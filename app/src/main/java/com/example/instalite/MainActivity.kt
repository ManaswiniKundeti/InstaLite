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
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.instalite.ui.composables.ScreenDestinations
import com.example.instalite.ui.composables.signupscreen.SignupScreen
import com.example.instalite.ui.theme.InstaLiteTheme
import com.example.instalite.viewmodel.InstaLiteViewModel
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
    val viewModel = hiltViewModel<InstaLiteViewModel>()
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = ScreenDestinations.SignUp.route) {
        composable(route = ScreenDestinations.SignUp.route) {
            SignupScreen(navController = navController, viewModel = viewModel)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    InstaLiteTheme {
        InstaLiteApp()
    }
}