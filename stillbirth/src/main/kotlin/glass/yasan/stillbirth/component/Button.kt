package glass.yasan.stillbirth.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import glass.yasan.stillbirth.theme.StillbirthTheme
import androidx.compose.material3.Button as Material3Button

@Composable
fun Button(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    borderColor: Color? = StillbirthTheme.colors.layer.background,
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        borderColor = borderColor,
        content = {
            Text(
                text = text.uppercase(),
                color = StillbirthTheme.colors.content.major,
            )
        }
    )
}

@Composable
fun Button(
    content: @Composable RowScope.() -> Unit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    borderColor: Color? = StillbirthTheme.colors.layer.background,
) {
    Material3Button(
        modifier = modifier,
        onClick = onClick,
        shape = RectangleShape,
        contentPadding = PaddingValues(16.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = StillbirthTheme.colors.layer.foreground,
            contentColor = StillbirthTheme.colors.content.major,
            disabledContainerColor = StillbirthTheme.colors.layer.midground,
            disabledContentColor = StillbirthTheme.colors.content.minor,
        ),
        border = borderColor?.let {
            BorderStroke(
                width = 1.dp,
                color = it,
            )
        },
        content = content,
    )
}