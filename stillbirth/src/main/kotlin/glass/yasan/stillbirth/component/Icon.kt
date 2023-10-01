package glass.yasan.stillbirth.component

import androidx.compose.material.Icon as Material3Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import glass.yasan.stillbirth.theme.StillbirthTheme

@Composable
public fun Icon(
    imageVector: ImageVector,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = StillbirthTheme.colors.content.major,
) {

    Material3Icon(
        modifier = modifier,
        imageVector = imageVector,
        contentDescription = contentDescription,
        tint = tint,
    )
}

@Composable
public fun Icon(
    painter: Painter,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = StillbirthTheme.colors.content.major,
) {

    Material3Icon(
        modifier = modifier,
        painter = painter,
        contentDescription = contentDescription,
        tint = tint,
    )
}

@Composable
public fun Icon(
    bitmap: ImageBitmap,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = StillbirthTheme.colors.content.major,
) {

    Material3Icon(
        modifier = modifier,
        bitmap = bitmap,
        contentDescription = contentDescription,
        tint = tint,
    )
}