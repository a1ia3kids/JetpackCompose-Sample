package kids.a1ia3.samplejetpackcompose.ui

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.Clickable
import androidx.ui.layout.Column
import androidx.ui.layout.ExpandedWidth
import androidx.ui.layout.Padding
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview
import kids.a1ia3.samplejetpackcompose.Screen
import kids.a1ia3.samplejetpackcompose.data.chapter01
import kids.a1ia3.samplejetpackcompose.model.StoryModel
import kids.a1ia3.samplejetpackcompose.navigateTo

@Composable
fun HomeItem(data: StoryModel) {
    Column(modifier = ExpandedWidth) {
        Clickable(onClick = {
            navigateTo(Screen.Story(data.id))
        }) {
            ItemText(text = data.id)
        }
    }
}

@Composable
private fun ItemText(text: String) {
    val typography = +MaterialTheme.typography()
    Padding(padding = 5.dp) {
        Text(
            text = text,
            style = typography.h5
        )
    }
}

@Preview
@Composable
private fun Preview() {
    HomeItem(data = chapter01)
}