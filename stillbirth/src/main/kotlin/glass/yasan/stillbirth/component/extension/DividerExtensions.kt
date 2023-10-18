package glass.yasan.stillbirth.component.extension

import androidx.compose.foundation.lazy.LazyListScope
import glass.yasan.stillbirth.component.Divider

public fun LazyListScope.divider() {
    item {
        Divider()
    }
}