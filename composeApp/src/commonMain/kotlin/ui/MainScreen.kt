package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.FlowPreview

@Composable
fun MainScreen() {
    Column(verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.fillMaxSize().background(Color.Black)) {
        Text("Text",
            textAlign = TextAlign.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .padding(end = 16.dp))
        Surface(color = Color.Green) {
            LazyVerticalGrid(columns = GridCells.Fixed(3), contentPadding = PaddingValues(
                start = 12.dp,
                top = 16.dp,
                end = 12.dp,
                bottom = 16.dp
            ), verticalArrangement = Arrangement.spacedBy(8.dp), // Vertical space between items
                horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                items(15) {
                    DigitButton(it+1,
                        modifier = Modifier.height(64.dp))
                }
            }
        }
    }
}


