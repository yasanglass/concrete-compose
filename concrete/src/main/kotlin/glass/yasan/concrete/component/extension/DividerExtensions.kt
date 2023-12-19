package glass.yasan.concrete.component.extension

import androidx.compose.foundation.lazy.LazyListScope
import glass.yasan.concrete.component.Divider

public fun LazyListScope.divider() {
    item {
        Divider()
    }
}