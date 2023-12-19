package glass.yasan.concrete.component

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
public fun Spacer(
    width: Dp,
    height: Dp,
) {
    Spacer(
        modifier = Modifier
            .width(width)
            .height(height),
    )
}
