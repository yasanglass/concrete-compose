package glass.yasan.stillbirth.theme.color

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
class Colors(
    var layerForeground: Color,
    var layerMidground: Color,
    var layerBackground: Color,
    var layerBackgroundOpposite: Color,
    var textTitle: Color,
    var textDescription: Color,
    var isLight: Boolean,
) {

    fun copy(
        layerForeground: Color = this.layerForeground,
        layerMidground: Color = this.layerMidground,
        layerBackground: Color = this.layerBackground,
        layerBackgroundOpposite: Color = this.layerBackgroundOpposite,
        textTitle: Color = this.textTitle,
        textDescription: Color = this.textDescription,
        isLight: Boolean = this.isLight,
    ) = Colors(
        layerForeground = layerForeground,
        layerMidground = layerMidground,
        layerBackground = layerBackground,
        layerBackgroundOpposite = layerBackgroundOpposite,
        textTitle = textTitle,
        textDescription = textDescription,
        isLight = isLight,
    )

    fun updateColorsFrom(other: Colors) {
        layerForeground = other.layerForeground
        layerMidground = other.layerMidground
        layerBackground = other.layerBackground
        layerBackgroundOpposite = other.layerBackgroundOpposite
        textTitle = other.textTitle
        textDescription = other.textDescription
        isLight = other.isLight
    }
}

internal val LocalColors: ProvidableCompositionLocal<Colors> = compositionLocalOf { lightColors() }
