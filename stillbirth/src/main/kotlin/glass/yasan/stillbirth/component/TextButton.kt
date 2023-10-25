package glass.yasan.stillbirth.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import glass.yasan.spine.compose.util.adaptiveContentColor
import glass.yasan.stillbirth.theme.StillbirthTheme


@Composable
public fun TextButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    contentModifier: Modifier = Modifier,
    iconStart: ImageVector? = null,
    iconEnd: ImageVector? = null,
    shape: Shape = RectangleShape,
    backgroundColor: Color = StillbirthTheme.colors.layer.foreground,
    contentColor: Color = adaptiveContentColor(backgroundColor = backgroundColor),
    border: BorderStroke? = BorderStroke(
        width = StillbirthTheme.sizes.borderStrokeWidth,
        color = StillbirthTheme.colors.layer.background,
    ),
    enabled: Boolean = true,
) {

    Button(
        content = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = contentModifier
                    .padding(16.dp),
            ) {
                if (iconStart != null) {
                    Icon(
                        imageVector = iconStart,
                        contentDescription = null,
                        tint = it,
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                }
                Text(
                    text = text.uppercase(),
                    color = it,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier = Modifier.weight(1f),
                    textAlign = TextAlign.Center,
                )
                if (iconEnd != null) {
                    Spacer(modifier = Modifier.width(16.dp))
                    Icon(
                        imageVector = iconEnd,
                        contentDescription = null,
                        tint = it,
                    )
                }
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