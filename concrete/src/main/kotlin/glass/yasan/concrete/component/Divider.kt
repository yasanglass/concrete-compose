package glass.yasan.concrete.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import glass.yasan.concrete.theme.ConcreteTheme
import androidx.compose.material3.HorizontalDivider as Material3HorizontalDivider

@Composable
public fun Divider(
    modifier: Modifier = Modifier,
    color: Color = ConcreteTheme.colors.layer.background,
    thickness: Dp = ConcreteTheme.sizes.borderStrokeWidth,
) {

    Material3HorizontalDivider(
        modifier = modifier,
        thickness = thickness,
        color = color
    )
}