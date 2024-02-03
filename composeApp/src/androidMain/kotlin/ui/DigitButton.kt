package ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

actual enum class DigitButtonContext {
    OPERATION, NUMBER;

    fun color(): Color {
        return when(this) {
            OPERATION -> Color.Gray
            NUMBER -> Color(0xFFFF944D)
        }
    }
}

@Composable
actual fun DigitButton(text: String,
                       modifier: Modifier,
                       context: DigitButtonContext,
                       action: () -> Unit) {
    Card(backgroundColor = context.color(),
        shape = CircleShape,
        modifier = modifier.height(64.dp)) {
        Box(contentAlignment = Alignment.Center, modifier = Modifier
            .clickable { action() }) {
            Text(text,
                fontSize = 20.sp)
        }
    }
}