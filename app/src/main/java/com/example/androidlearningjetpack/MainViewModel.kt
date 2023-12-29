package com.example.androidlearningjetpack

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val _isLoading = MutableStateFlow(true)
    val isLoading = _isLoading.asStateFlow()

    init {

        viewModelScope.launch {
            // This is to simulate the delay for 3 seconds when we run the app
            delay(3000)
            _isLoading.value = false // We then want to hide the Splash Screen By This time
        }
    }

}