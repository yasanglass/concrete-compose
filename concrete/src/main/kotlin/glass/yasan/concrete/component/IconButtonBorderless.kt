package glass.yasan.concrete.component

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import glass.yasan.concrete.theme.ConcreteTheme

@Composable
public fun IconButtonBorderless(
    imageVector: ImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = CircleShape,
    contentColor: Color = ConcreteTheme.colors.content.major,
    enabled: Boolean = true,
) {
    IconButton(
        imageVector = imageVector,
        onClick = onClick,
        modifier = modifier,
        shape = shape,
        backgroundColor = Color.Transparent,
        contentColor = contentColor,
        border = null,
        enabled = enabled,
    )
}