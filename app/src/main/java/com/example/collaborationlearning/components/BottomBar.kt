package com.example.collaborationlearning.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.collaborationlearning.ui.theme.PurpleGrey80

@Composable
fun BottomBar(
    onInputClick: () -> Unit,
    onValidateClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .background(PurpleGrey80)
            .height(100.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        BottomBarButton(
            text = "Input",
            modifier = Modifier.weight(1f),
            onClick = {
                onInputClick()
            }
        )
        BottomBarButton(
            text = "Validate",
            modifier = Modifier.weight(1f),
            onClick = {
                onValidateClick()
            }
        )
    }
}

@Composable
fun BottomBarButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Column(
        modifier = modifier.clickable {
            onClick()
            // When we click it performs onClick(). We do not define the functionality here
            // because this is a "dumb" reusable button.
            // We instead define it on the screen level composable.
        },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {}
        ) {
            // Contents within the button would go here. Text for example.
        }
        Text(text = text)
    }
}