package glass.yasan.concrete.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.LinearProgressIndicator as Material3LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import glass.yasan.concrete.theme.StillbirthTheme

@Composable
public fun ProgressBarLinear(
    modifier: Modifier = Modifier,
    color: Color = StillbirthTheme.colors.content.major,
) {
    Material3LinearProgressIndicator(
        modifier = modifier.fillMaxWidth(),
        color = color,
    )
}