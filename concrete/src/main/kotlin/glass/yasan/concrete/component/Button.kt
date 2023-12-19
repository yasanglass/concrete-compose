package glass.yasan.concrete.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.Surface as Material3Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import glass.yasan.spine.compose.util.adaptiveContentColor
import glass.yasan.concrete.theme.ConcreteTheme

@Composable
public fun Button(
    content: @Composable (Color) -> Unit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape,
    backgroundColor: Color = ConcreteTheme.colors.layer.foreground,
    contentColor: Color = adaptiveContentColor(backgroundColor = backgroundColor),
    border: BorderStroke? = BorderStroke(
        width = ConcreteTheme.sizes.borderStrokeWidth,
        color = ConcreteTheme.colors.layer.background,
    ),
    enabled: Boolean = true,
) {

    Material3Surface(
        onClick = onClick,
        enabled = enabled,
        shape = shape,
        color = backgroundColor,
        border = border,
        content = { content(contentColor) },
        modifier = modifier,
    )
}