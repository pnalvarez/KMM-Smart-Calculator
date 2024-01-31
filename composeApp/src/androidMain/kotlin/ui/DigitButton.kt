package ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
actual fun DigitButton(digit: Int,
                       modifier: Modifier,
                       action: () -> Unit) {
    Card(backgroundColor = Color(0xFFFF944D),
        shape = CircleShape,
        modifier = modifier) {
        Box(contentAlignment = Alignment.Center, modifier = Modifier
            .clickable { action() }) {
            Text("$digit")
        }
    }
}