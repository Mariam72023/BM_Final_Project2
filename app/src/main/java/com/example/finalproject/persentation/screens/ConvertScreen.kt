package com.example.finalproject.persentation.screens


import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.finalproject.R
import com.example.finalproject.persentation.component.CustomDialogUI
import com.example.finalproject.persentation.component.DropDownMenu

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun ConvertScreen() {
    var open by remember {
        mutableStateOf(
            false
        )
    }
    var amountFrom by remember {
        mutableStateOf(0)
    }
    var amountTo by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {
            Text(
                text = "Amount",
                style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight(600)),
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .weight(0.3F)
                    .padding(start = 36.dp)
            )
            Text(
                modifier = Modifier
                    .weight(0.8F)
                    .padding(end = 40.dp),
                text = "From", textAlign = TextAlign.Center,
                fontSize = 14.sp,
                fontWeight = FontWeight(600),

                )
        }
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = amountFrom.toString(),
                onValueChange = {

                    amountFrom = it.toInt()
                },
                shape = RoundedCornerShape(20.dp),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0xFFF9F9F9),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                ),
                modifier = Modifier
                    .border(
                        width = 0.5.dp,
                        color = Color(0xFFC5C5C5),
                        shape = RoundedCornerShape(size = 20.dp)
                    )
                    .width(130.dp)
                    .height(48.dp),
                textStyle = TextStyle(fontSize = 16.sp, fontWeight = FontWeight(600))
            )
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                DropDownMenu()
            }

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {
            Text(
                text = "To",
                style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight(600)),
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .weight(0.3F)
                    .padding(start = 36.dp)
            )
            Text(
                modifier = Modifier
                    .weight(0.4F)
                    .padding(end = 30.dp),
                text = "Amount", textAlign = TextAlign.Center,
                fontSize = 14.sp,
                fontWeight = FontWeight(600),

                )
        }
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                DropDownMenu()
            }
            TextField(
                value = amountTo.toString(),
                onValueChange = {
                    amountTo = it.toInt()
                    Log.i("TAG", (amountFrom + amountTo).toString())
                },
                shape = RoundedCornerShape(20.dp),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0xFFF9F9F9),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                ),
                modifier = Modifier
                    .border(
                        width = 0.5.dp,
                        color = Color(0xFFC5C5C5),
                        shape = RoundedCornerShape(size = 20.dp)
                    )
                    .width(130.dp)
                    .height(48.dp),
                textStyle = TextStyle(fontSize = 16.sp, fontWeight = FontWeight(600))
            )

        }
        Spacer(modifier = Modifier.height(18.dp))
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 25.dp, end = 25.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF363636))

        ) {
            Text(text = "Convert", fontSize = 16.sp, fontWeight = FontWeight(600))
        }
        Spacer(modifier = Modifier.height(25.dp))
        Spacer(
            Modifier
                .fillMaxWidth()
                .padding(start = 25.dp, end = 25.dp)
                .height(1.5.dp)
                .background(color = Color(0xFFE9E9E9))
        )





        Spacer(modifier = Modifier.height(34.dp))



        Row(
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .fillMaxSize()
                .padding(start = 25.dp, end = 25.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "live exchange rate", fontSize = 16.sp, fontWeight = FontWeight(600))

            Card(

                modifier = Modifier
                    .background(Color.White)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFE9E9E9),
                        shape = RoundedCornerShape(size = 18.dp)
                    )

                    .padding(10.dp),


                ) {
                Row(
                    modifier = Modifier
                        .background(Color.White)
                        .clickable { open = !open }, verticalAlignment = Alignment.CenterVertically


                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.plus_icon),
                        contentDescription = "", modifier = Modifier
                            .padding(end = 10.dp)
                            .size(25.dp)

                    )
                    Text(text = "Add to Favorites", color = Color.Black)

                }

            }


        }



        Text(
            text = "My Portfolio",
            modifier = Modifier.padding(start = 25.dp, top = 15.dp),
            fontSize = 18.sp,
            fontWeight = FontWeight(400)
        )
        Column {
            ListItem(modifier = Modifier.padding(start = 10.dp, end = 10.dp),
                headlineText = {
                    Text(
                        text = "GPB",
                        fontSize = 14.sp,
                        fontWeight = FontWeight(400)
                    )
                },
                supportingText = {
                    Text(
                        text = "Currency",
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFFB8B8B8)
                    )
                },
                leadingContent = {
                    Image(
                        painter = painterResource(id = R.drawable.united_states_of_america_1),
                        contentDescription = ""
                    )
                },
                trailingContent = {
                    Text(
                        text = "2.45",
                        fontSize = 18.sp,
                        fontWeight = FontWeight(500)
                    )
                }

            )
            Spacer(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 25.dp, end = 25.dp)
                    .height(1.dp)
                    .background(color = Color(0xFFE9E9E9))
            )
            ListItem(modifier = Modifier.padding(start = 10.dp, end = 10.dp),
                headlineText = {
                    Text(
                        text = "GPB",
                        fontSize = 14.sp,
                        fontWeight = FontWeight(400)
                    )
                },
                supportingText = {
                    Text(
                        text = "Currency",
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFFB8B8B8)
                    )
                },
                leadingContent = {
                    Image(
                        painter = painterResource(id = R.drawable.united_states_of_america_1),
                        contentDescription = ""
                    )
                },
                trailingContent = {
                    Text(
                        text = "2.45",
                        fontSize = 18.sp,
                        fontWeight = FontWeight(500)
                    )
                }

            )
            Spacer(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 25.dp, end = 25.dp)
                    .height(1.dp)
                    .background(color = Color(0xFFE9E9E9))
            )
            ListItem(modifier = Modifier.padding(start = 10.dp, end = 10.dp),
                headlineText = {
                    Text(
                        text = "GPB",
                        fontSize = 14.sp,
                        fontWeight = FontWeight(400)
                    )
                },
                supportingText = {
                    Text(
                        text = "Currency",
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFFB8B8B8)
                    )
                },
                leadingContent = {
                    Image(
                        painter = painterResource(id = R.drawable.united_states_of_america_1),
                        contentDescription = ""
                    )
                },
                trailingContent = {
                    Text(
                        text = "2.45",
                        fontSize = 18.sp,
                        fontWeight = FontWeight(500)
                    )
                }

            )
            Spacer(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 25.dp, end = 25.dp)
                    .height(1.dp)
                    .background(color = Color(0xFFE9E9E9))
            )
        }

    }

    if (open) {

        CustomDialogUI(onClick = { open = false })
    }


}
