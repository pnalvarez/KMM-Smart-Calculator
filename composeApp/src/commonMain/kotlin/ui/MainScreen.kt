package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import viewModel.MainViewModel

@Composable
fun MainScreen(viewModel: MainViewModel) {
    val count: String by viewModel.text.collectAsState()

    Column(verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)) {

        Text(count,
            textAlign = TextAlign.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .padding(end = 16.dp),
            color = Color.Green,
            fontSize = 64.sp)

        Surface(color = Color.White) {
            LazyVerticalGrid(columns = GridCells.Fixed(3),
                contentPadding = PaddingValues(
                start = 12.dp,
                top = 16.dp,
                end = 12.dp,
                bottom = 16.dp
            ), verticalArrangement = Arrangement.spacedBy(8.dp), // Vertical space between items
                horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                val digits = listOf("AC", "/", "X", "-", "+", "=", "7", "8", "9", "4", "5", "6", "1", "2", "3", "0")
                items(digits) {
                    DigitButton(it,
                        context = if(it.toIntOrNull() != null)
                            DigitButtonContext.NUMBER
                         else
                            DigitButtonContext.OPERATION) {
                        viewModel.didTapButton(it)
                    }
                }
            }
        }
    }
}


