package glass.yasan.stillbirth.component

import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import glass.yasan.stillbirth.theme.StillbirthTheme

@Composable
public fun ProgressBarCircular(
    modifier: Modifier = Modifier,
    color: Color = StillbirthTheme.colors.content.major,
) {
    CircularProgressIndicator(
        modifier = modifier,
        color = color,
    )
}