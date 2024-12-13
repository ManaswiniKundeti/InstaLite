package com.example.instalite.ui.composables.signupscreen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.instalite.viewmodel.InstaLiteViewModel

@Composable
fun SignupScreen(
    navController: NavController,
    viewModel: InstaLiteViewModel
) {
    Text(text = "SignUp Screen")
}