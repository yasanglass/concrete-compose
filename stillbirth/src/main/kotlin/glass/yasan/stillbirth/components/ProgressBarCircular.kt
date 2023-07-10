package glass.yasan.stillbirth.components

import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import glass.yasan.stillbirth.theme.StillbirthTheme

@Composable
fun ProgressBarCircular(
    modifier: Modifier = Modifier,
    color: Color = StillbirthTheme.colors.layerForeground,
) {
    CircularProgressIndicator(
        modifier = modifier,
        color = color,
    )
}