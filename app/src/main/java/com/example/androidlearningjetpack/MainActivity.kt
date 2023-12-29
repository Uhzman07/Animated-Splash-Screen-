package com.example.androidlearningjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.ViewModel
import com.example.androidlearningjetpack.ui.theme.AndroidLearningJetpackTheme

class MainActivity : ComponentActivity() {

    private val viewModel : MainViewModel by viewModels() // Note that by "viewModels()" here is a very essential attachment to the code

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Then to apply the Theme change
        installSplashScreen().apply {

            setKeepVisibleCondition{ // This is a conditional check (in built)
                viewModel.isLoading.value // This is used to set the Splash Screen based on the boolean value of the viewModel
            }
        }

        setContent {
            AndroidLearningJetpackTheme {
                Box(modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                 ){
                    Text(text ="Hello Usman!!!")

                }
            }
        }
    }
}

/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidLearningJetpackTheme {
        Greeting("Android")
    }
}\
 */