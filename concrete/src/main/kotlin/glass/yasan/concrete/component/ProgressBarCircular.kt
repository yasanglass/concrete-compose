package glass.yasan.concrete.component

import androidx.compose.material3.CircularProgressIndicator as Material3CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import glass.yasan.concrete.theme.ConcreteTheme

@Composable
public fun ProgressBarCircular(
    modifier: Modifier = Modifier,
    color: Color = ConcreteTheme.colors.content.major,
) {
    Material3CircularProgressIndicator(
        modifier = modifier,
        color = color,
    )
}