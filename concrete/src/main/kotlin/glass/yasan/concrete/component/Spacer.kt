package glass.yasan.concrete.component

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
public fun Spacer(
    width: Dp,
    height: Dp,
    modifier: Modifier = Modifier,
) {
    Spacer(
        modifier = modifier
            .width(width)
            .height(height),
    )
}

@Composable
public fun RowScope.Spacer(
    width: Dp,
    modifier: Modifier = Modifier,
) {
    Spacer(
        width = width,
        height = 0.dp,
        modifier = modifier,
    )
}

@Composable
public fun ColumnScope.Spacer(
    height: Dp,
    modifier: Modifier = Modifier,
) {
    Spacer(
        width = 0.dp,
        height = height,
        modifier = modifier,
    )
}
