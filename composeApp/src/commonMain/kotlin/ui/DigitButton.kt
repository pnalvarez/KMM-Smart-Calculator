package ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

expect enum class DigitButtonContext {
    OPERATION, NUMBER;
}

@Composable
expect fun DigitButton(text: String,
                       modifier: Modifier = Modifier,
                       context: DigitButtonContext,
                       action: () -> Unit = { })