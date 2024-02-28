package glass.yasan.concrete.component.extension

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import glass.yasan.concrete.component.Divider
import glass.yasan.concrete.theme.ConcreteTheme

public fun LazyListScope.divider(
    modifier: Modifier = Modifier,
) {
    item {
        Divider(
            modifier = modifier,
        )
    }
}
