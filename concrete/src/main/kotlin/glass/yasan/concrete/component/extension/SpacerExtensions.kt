package glass.yasan.concrete.component.extension

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import glass.yasan.concrete.component.Spacer
import glass.yasan.concrete.component.SpacerHorizontal
import glass.yasan.concrete.component.SpacerVertical

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

public fun LazyListScope.spacer(
    width: Dp,
    height: Dp,
) {
    item {
        Spacer(
            width = width,
            height = height,
        )
    }
}

public fun LazyListScope.spacerHorizontal(
    width: Dp,
) {
    item {
        SpacerHorizontal(
            width = width,
        )
    }
}

public fun LazyListScope.spacerVertical(
    height: Dp,
) {
    item {
        SpacerVertical(
            height = height,
        )
    }
}
