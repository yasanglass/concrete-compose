package glass.yasan.concrete.component

import androidx.compose.material3.CircularProgressIndicator as Material3CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import glass.yasan.concrete.theme.StillbirthTheme

@Composable
public fun ProgressBarCircular(
    modifier: Modifier = Modifier,
    color: Color = StillbirthTheme.colors.content.major,
) {
    Material3CircularProgressIndicator(
        modifier = modifier,
        color = color,
    )
}