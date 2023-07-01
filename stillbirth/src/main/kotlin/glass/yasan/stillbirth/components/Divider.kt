package glass.yasan.stillbirth.components

import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import glass.yasan.stillbirth.theme.StillbirthTheme

@Composable
public fun Divider(
    modifier: Modifier = Modifier,
) {

    Divider(
        color = StillbirthTheme.colors.layerBackground,
        modifier = modifier,
    )
}