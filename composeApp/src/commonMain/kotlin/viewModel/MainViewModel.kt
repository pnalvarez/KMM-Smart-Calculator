package viewModel

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel: ViewModel() {
    private var _text = MutableStateFlow<String>("")

    var text: StateFlow<String> = _text

    private var count: Int = 0
    private var cachedValue: Int = 0
    private var lastDigit: String? = null

    fun didTapButton(digit: String) {
        when(digit) {
            "AC" -> reset()
            "/" -> divide()
        }
        if(_text.value.length < 5)
            _text.value += digit
    }

    private fun reset() {
        // TO DO
    }

    private fun divide() {
        // TO DO
    }

    private fun multiply() {
        // TO DO
    }

    private fun add() {
        // TO DO
    }

    private fun subtract() {
        // TO DO
    }
}