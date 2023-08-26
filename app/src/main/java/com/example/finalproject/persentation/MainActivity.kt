package com.example.finalproject.persentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.finalproject.R
import com.example.finalproject.persentation.screens.CompareBox
import com.example.finalproject.persentation.screens.ConvertScreen
import com.example.finalproject.persentation.theme.FinalProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinalProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    setContent {

                        var convertScreen by remember {
                            mutableStateOf(true)
                        }

                        Column {


                            MainScreen(onConvertClick = { convertScreen = true },
                                onCompareClick = { convertScreen = false })
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(1F)
                            ) {
                                if (convertScreen) {
                                    ConvertScreen()

                                } else {
                                    CompareBox()
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun MainScreen(
    onConvertClick: () -> Unit,
    onCompareClick: () -> Unit
) {
    var textColorConvertState by remember {
        mutableStateOf(Color.White)
    }
    var textColorCompareState by remember {
        mutableStateOf(Color(0xFFF8F8F8))
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(265.dp)
            .background(Color.White)

    ) {
        Image(
            painter = painterResource(id = R.drawable.top_image), modifier = Modifier

                .fillMaxWidth()
                .size(250.dp), contentDescription = "", contentScale = ContentScale.FillBounds
        )
        Column {
            Image(
                painter = painterResource(id = R.drawable.concurrency_text),
                contentDescription = "",
                modifier = Modifier
                    .padding(top = 16.dp, start = 8.dp)
                    .width(143.dp)
                    .height(32.dp)
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Currency Converter",
                    color = Color.White,
                    fontWeight = FontWeight(600),
                    fontSize = 24.sp,

                    )
                Text(
                    text = "check live foreign exchange rates",
                    color = Color.White,
                    fontWeight = FontWeight(400),
                    fontSize = 18.sp
                )
            }
        }
        Card(
            shape = RoundedCornerShape(22.dp), modifier = Modifier
                .align(Alignment.BottomCenter)
        ) {
            Row(
                modifier = Modifier
                    .background(Color(0xFFF8F8F8)),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Convert",
                    Modifier

                        .background(

                            color = textColorConvertState, shape =
                            RoundedCornerShape(22.dp)
                        )
                        .padding(start = 20.dp)
                        .width(100.dp)

                        .padding(
                            10.dp
                        )
                        .clickable {
                            textColorConvertState = Color.White
                            textColorCompareState = Color(0xFFF8F8F8)

                            onConvertClick(

                            )
                        },
                    style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight(400))
                )
                Text(

                    text = "Compare",
                    Modifier
                        .background(
                            color = textColorCompareState, shape = RoundedCornerShape(22.dp)
                        )

                        .padding(
                            start = 20.dp
                        )
                        .width(100.dp)
                        .padding(10.dp)
                        .clickable {
                            textColorCompareState = Color.White
                            textColorConvertState = Color(0xFFF8F8F8)


                            onCompareClick()


                        },
                    style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight(400))
                )
            }
        }
    }
}

