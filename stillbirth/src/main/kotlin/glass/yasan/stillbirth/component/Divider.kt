package glass.yasan.stillbirth.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import glass.yasan.stillbirth.theme.StillbirthTheme
import androidx.compose.material3.Divider as Material3Divider

@Composable
public fun Divider(
    modifier: Modifier = Modifier,
) {

    Material3Divider(
        color = StillbirthTheme.colors.layer.background,
        thickness = StillbirthTheme.sizes.borderStrokeWidth,
        modifier = modifier,
    )
}