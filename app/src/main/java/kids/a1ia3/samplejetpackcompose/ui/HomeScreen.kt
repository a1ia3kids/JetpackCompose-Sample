package kids.a1ia3.samplejetpackcompose.ui

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.Expanded
import androidx.ui.layout.Size
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.res.stringResource
import kids.a1ia3.samplejetpackcompose.R
import kids.a1ia3.samplejetpackcompose.data.stories

@Composable
fun HomeScreen() {
    VerticalScroller(modifier = Expanded) {
        Column {
            Image()
            TextTitle()
            stories.forEach {
                HomeItem(data = it)
                Divider(color = Color.Black)
            }
        }
    }
}

@Composable
private fun TextTitle() {
    val title = +stringResource(R.string.text_title)
    val typography = +MaterialTheme.typography()
    Text(title, style = typography.h6)
}

@Composable
private fun Image() {
    val image = +imageResource(R.drawable.image)
    Container(
        modifier = Size(150.dp, 180.dp)
    ) {
        Clip(shape = RoundedCornerShape(8.dp)) {
            DrawImage(image = image)
        }
    }
}