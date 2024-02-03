import androidx.compose.ui.window.ComposeUIViewController
import ui.MainScreen
import viewModel.MainViewModel

fun MainViewController() = ComposeUIViewController {
    MainScreen(viewModel = MainViewModel())
}
