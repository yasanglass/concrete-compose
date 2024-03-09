package glass.yasan.concrete.component.extension

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.ui.Modifier
import glass.yasan.concrete.component.Divider

public fun LazyListScope.divider(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    item {
        Divider(
            modifier = modifier,
            enabled = enabled,
        )
    }
}
