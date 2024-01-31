package ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
expect fun DigitButton(digit: Int,
                       modifier: Modifier = Modifier,
                       action: () -> Unit = { })