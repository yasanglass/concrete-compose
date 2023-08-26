package glass.yasan.stillbirth.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import glass.yasan.spine.compose.util.adaptiveContentColor
import glass.yasan.stillbirth.theme.StillbirthTheme

@Composable
fun TextButton(
    text: String,
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

    Button(
        content = {
            Box(
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = text.uppercase(),
                    color = it,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(16.dp),
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