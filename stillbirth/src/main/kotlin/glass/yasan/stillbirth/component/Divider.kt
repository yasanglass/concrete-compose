package glass.yasan.stillbirth.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import glass.yasan.stillbirth.theme.StillbirthTheme
import androidx.compose.material3.Divider as Material3Divider

@Composable
public fun Divider(
    modifier: Modifier = Modifier,
    color: Color = StillbirthTheme.colors.layer.background,
    thickness: Dp = StillbirthTheme.sizes.borderStrokeWidth,
) {

    Material3Divider(
        modifier = modifier,
        color = color,
        thickness = thickness,
    )
}