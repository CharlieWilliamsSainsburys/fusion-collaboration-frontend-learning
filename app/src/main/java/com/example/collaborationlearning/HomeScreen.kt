package com.example.collaborationlearning

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.collaborationlearning.components.BottomBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.weight(1f))
        Column(
            modifier = Modifier.padding(horizontal = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Enter the IMEI found on the back of the mobile device",
                modifier = Modifier.padding(bottom = 28.dp),
                textAlign = TextAlign.Start
            )
            /* Note: This TextField will not be usable until we implement a ViewModel and
            ViewState to track what is entered */
            TextField(
                value = "",
                onValueChange = {
                    // We would update the ViewState value here
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 28.dp)
            )
            Button(
                onClick = { },
                modifier = Modifier.width(200.dp)
            ) {
                Text(text = "Register")
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        BottomBar(
            onInputClick = {
                // We define the button functionality on the screen level composable here.
            },
            onValidateClick = {
                // We define the button functionality on the screen level composable here.
            }
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}