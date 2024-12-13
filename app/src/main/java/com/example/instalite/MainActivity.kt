package com.example.instalite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.instalite.ui.theme.InstaLiteTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InstaLiteTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    InstaLiteApp()
                }
            }
        }
    }
}

@Composable
fun InstaLiteApp() {
    Text(text = "Hello!")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    InstaLiteTheme {
        InstaLiteApp()
    }
}