package glass.yasan.concrete.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import glass.yasan.spine.compose.util.adaptiveContentColor
import glass.yasan.concrete.theme.ConcreteTheme

@Composable
public fun IconButton(
    imageVector: ImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = CircleShape,
    backgroundColor: Color = ConcreteTheme.colors.layer.foreground,
    contentColor: Color = adaptiveContentColor(backgroundColor = backgroundColor),
    border: BorderStroke? = BorderStroke(
        width = ConcreteTheme.sizes.borderStrokeWidth,
        color = ConcreteTheme.colors.layer.background,
    ),
    enabled: Boolean = true,
) {

    Button(
        content = {
            Box(
                contentAlignment = Alignment.Center,
            ) {
                Icon(
                    modifier = Modifier
                        .padding(12.dp),
                    imageVector = imageVector,
                    contentDescription = null,
                    tint = contentColor,
                )
            }
        },
        onClick = onClick,
        modifier = modifier,
        shape = shape,
        backgroundColor = backgroundColor,
        contentColor = contentColor,
        border = border,
        enabled = enabled,
    )
}