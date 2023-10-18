package glass.yasan.stillbirth.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
public fun SpacerVertical(
    height: Dp,
) {
    Spacer(
        width = 0.dp,
        height = height,
    )
}
