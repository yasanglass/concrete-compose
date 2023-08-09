package glass.yasan.stillbirth.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import glass.yasan.stillbirth.theme.StillbirthTheme

@Composable
fun IconButton(
    imageVector: ImageVector,
    onClickLabel: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    tint: Color = StillbirthTheme.colors.content.major,
    enabled: Boolean = true,
    contentDescription: String?,
) {

    Icon(
        modifier = modifier
            .padding(4.dp)
            .clip(CircleShape)
            .clickable(
                onClick = onClick,
                enabled = enabled,
                onClickLabel = onClickLabel,
            )
            .padding(8.dp),
        imageVector = imageVector,
        contentDescription = contentDescription,
        tint = tint,
    )
}