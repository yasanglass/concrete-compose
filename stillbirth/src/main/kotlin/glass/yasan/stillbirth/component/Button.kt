package glass.yasan.stillbirth.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import glass.yasan.spine.compose.util.adaptiveContentColor
import glass.yasan.stillbirth.theme.StillbirthTheme

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Button(
    content: @Composable (Color) -> Unit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape,
    backgroundColor: Color = StillbirthTheme.colors.layer.foreground,
    contentColor: Color = adaptiveContentColor(backgroundColor = backgroundColor),
    border: BorderStroke? = BorderStroke(
        width = StillbirthTheme.sizes.borderStrokeWidth,
        color = contentColor,
    ),
    enabled: Boolean = true,
) {

    Surface(
        onClick = onClick,
        enabled = enabled,
        shape = shape,
        color = backgroundColor,
        border = border,
        content = { content(contentColor) },
        modifier = modifier,
    )
}