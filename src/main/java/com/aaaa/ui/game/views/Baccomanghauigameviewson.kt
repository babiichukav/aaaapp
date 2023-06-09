package com.aaaa.ui.game.views

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Baccomanghauigameviewson(
    modifier: Modifier = Modifier,
    text: String,
    action: () -> Unit,
) {
    TextButton(
        modifier = modifier.padding(18.dp),
        onClick = { action() },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green.copy(red = 0.8F)),
        shape = RoundedCornerShape(24.dp),
        border = BorderStroke(1.dp, color = Color.White.copy(red = 0.2F))
    ) {
        Text(text, style = TextStyle(fontSize = 26.sp))
    }
}