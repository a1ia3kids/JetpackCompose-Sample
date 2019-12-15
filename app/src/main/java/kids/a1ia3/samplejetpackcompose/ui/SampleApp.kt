package kids.a1ia3.samplejetpackcompose.ui

import androidx.compose.Composable
import androidx.ui.animation.Crossfade
import androidx.ui.material.MaterialTheme
import kids.a1ia3.samplejetpackcompose.AppStatus
import kids.a1ia3.samplejetpackcompose.Screen

@Composable
fun SampleApp() {
    MaterialTheme {
        Content()
    }
}

@Composable
private fun Content() {
    Crossfade(current = AppStatus.currentScreen) { screen ->
        when (screen) {
            is Screen.Home -> HomeScreen()
            is Screen.Story -> TextScreen(id = screen.id)
        }
    }
}