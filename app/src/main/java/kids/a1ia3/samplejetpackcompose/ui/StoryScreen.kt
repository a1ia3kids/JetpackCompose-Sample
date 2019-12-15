package kids.a1ia3.samplejetpackcompose.ui

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Alignment
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.graphics.vector.DrawVector
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.res.vectorResource
import androidx.ui.tooling.preview.Preview
import kids.a1ia3.samplejetpackcompose.R
import kids.a1ia3.samplejetpackcompose.Screen
import kids.a1ia3.samplejetpackcompose.data.stories
import kids.a1ia3.samplejetpackcompose.navigateTo

@Composable
fun TextScreen(id: String) {
    val data = stories.find { it.id == id } ?: return
    VerticalScroller(modifier = Expanded) {

        Column() {
            Header()

            Container(
                modifier = ExpandedWidth,
                alignment = Alignment.TopCenter,
                padding = EdgeInsets(15.dp, 5.dp, 15.dp, 5.dp)
            ) {
                TextChapter(data.id)
            }
            Container(
                modifier = ExpandedWidth,
                alignment = Alignment.TopCenter
            ) {
                TextChapterTitle(data.chapterTitle)
            }
            Container(
                modifier = ExpandedWidth,
                alignment = Alignment.TopCenter,
                padding = EdgeInsets(15.dp, 5.dp, 15.dp, 5.dp)
            ) {
                TextStory(data.story)
            }

        }
    }
}

@Composable
private fun Header() {
    val vector = +vectorResource(R.drawable.ic_baseline_arrow_back_24)
    Surface(color = (+MaterialTheme.colors()).background) {
        Clickable(onClick = {
            navigateTo(Screen.Home)
        }) {
            Container(
                modifier = Height(31.dp) wraps Expanded,
                alignment = Alignment.TopLeft,
                padding = EdgeInsets(15.dp, 0.dp, 0.dp, 0.dp)
            ) {

                DrawVector(
                    vectorImage = vector,
                    tintColor = Color.Black,
                    alignment = Alignment.CenterLeft
                )

            }
        }
    }
}


@Composable
private fun TextChapter(text: String) {
    val typography = +MaterialTheme.typography()
    Text(text, style = typography.h4)
}

@Composable
private fun TextChapterTitle(text: String) {
    val typography = +MaterialTheme.typography()
    Text(text, style = typography.h6)
}

@Composable
private fun TextStory(text: String) {
    val typography = +MaterialTheme.typography()
    Text(text, style = typography.body1)
}

@Preview
@Composable
private fun Preview() {
    TextScreen("Chapter01")
}


