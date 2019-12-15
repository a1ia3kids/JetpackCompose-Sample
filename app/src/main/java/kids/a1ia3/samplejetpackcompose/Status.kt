package kids.a1ia3.samplejetpackcompose

import androidx.compose.Model

sealed class Screen {
    object Home : Screen()
    data class Story(val id: String) : Screen()
}

@Model
object AppStatus {
    var currentScreen: Screen = Screen.Home
}

fun navigateTo(destination: Screen) {
    AppStatus.currentScreen = destination
}