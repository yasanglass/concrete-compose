package glass.yasan.stillbirth.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import glass.yasan.stillbirth.theme.StillbirthTheme

@Composable
fun ProgressBarLinear(
    modifier: Modifier = Modifier,
    color: Color = StillbirthTheme.colors.layerForeground,
) {
    LinearProgressIndicator(
        modifier = modifier.fillMaxWidth(),
        color = color,
    )
}