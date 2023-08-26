package com.example.finalproject.persentation.component

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.AlertDialog
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.finalproject.persentation.screens.FavouriteScreen


/**
 * CREATES A DIALOGUE THAT CONTAINS OR RETURNS FAVOURITES LIST
 *
 *
 * */

@Composable
fun CustomDialogUI(
    modifier: Modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
    onClick: () -> Unit
) {

    AlertDialog(
        onDismissRequest = { onClick.invoke() },
        confirmButton = {
            Column(
                modifier
                    .wrapContentSize(Alignment.Center)
                    .background(Color.White),
            ) {
                FavouriteScreen(onClick)

            }
        },
    )

}


@SuppressLint("UnrememberedMutableState")
@Preview(name = "Custom Dialog")
@Composable
fun MyDialogUIPreview() {
    //CustomDialogUI()
}
