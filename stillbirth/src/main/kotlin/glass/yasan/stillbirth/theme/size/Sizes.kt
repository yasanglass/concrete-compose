package glass.yasan.stillbirth.theme.size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp

@Immutable
class Sizes(
    var borderStrokeWidth: Dp,
) {

    fun copy(
        borderStrokeWidth: Dp = this.borderStrokeWidth,
    ) = Sizes(
        borderStrokeWidth = borderStrokeWidth,
    )

    fun updateSizesFrom(
        other: Sizes,
    ) {
        borderStrokeWidth = other.borderStrokeWidth
    }
}

internal val LocalSizes: ProvidableCompositionLocal<Sizes> =
    compositionLocalOf {
        sizes()
    }
