package glass.yasan.concrete.component.extension

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import glass.yasan.concrete.component.Spacer

public fun LazyListScope.spacer(
    width: Dp = 0.dp,
    height: Dp = 0.dp,
) {
    item {
        Spacer(
            width = width,
            height = height,
        )
    }
}
