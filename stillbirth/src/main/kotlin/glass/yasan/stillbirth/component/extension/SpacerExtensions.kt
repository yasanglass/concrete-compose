package glass.yasan.stillbirth.component.extension

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.ui.unit.Dp
import glass.yasan.stillbirth.component.Spacer
import glass.yasan.stillbirth.component.SpacerHorizontal
import glass.yasan.stillbirth.component.SpacerVertical

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