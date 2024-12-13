package com.example.instalite.ui.composables

sealed class ScreenDestinations(val route: String) {
    object SignUp: ScreenDestinations("signup")
}