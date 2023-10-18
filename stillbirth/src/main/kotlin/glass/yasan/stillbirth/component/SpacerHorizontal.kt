package glass.yasan.stillbirth.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
public fun SpacerHorizontal(
    width: Dp,
) {
    Spacer(
        width = width,
        height = 0.dp,
    )
}