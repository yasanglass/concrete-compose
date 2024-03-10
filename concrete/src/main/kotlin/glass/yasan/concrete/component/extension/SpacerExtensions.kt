package glass.yasan.concrete.component.extension

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.ui.unit.Dp
import glass.yasan.concrete.component.Spacer
import glass.yasan.concrete.component.SpacerHorizontal
import glass.yasan.concrete.component.SpacerVertical

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