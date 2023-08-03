package glass.yasan.stillbirth.theme.color

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
class Colors(
    var content: Content,
    var layer: Layer,
    var isLight: Boolean,
) {

    constructor(
        contentMajor: Color,
        contentMinor: Color,
        layerForeground: Color,
        layerMidground: Color,
        layerBackground: Color,
        layerBackgroundOpposite: Color,
        isLight: Boolean,
    ) : this(
        content = Content(
            major = contentMajor,
            minor = contentMinor,
        ),
        layer = Layer(
            foreground = layerForeground,
            midground = layerMidground,
            background = layerBackground,
            backgroundOpposite = layerBackgroundOpposite,
        ),
        isLight = isLight,
    )

    class Content(
        val major: Color,
        val minor: Color,
    )

    class Layer(
        val foreground: Color,
        val midground: Color,
        val background: Color,
        val backgroundOpposite: Color,
    )

    fun copy(
        content: Content = this.content,
        layer: Layer = this.layer,
        isLight: Boolean = this.isLight,
    ) = Colors(
        content = content,
        layer = layer,
        isLight = isLight,
    )

    fun updateColorsFrom(
        other: Colors,
    ) {
        content = other.content
        layer = other.layer
        isLight = other.isLight
    }
}

internal val LocalColors: ProvidableCompositionLocal<Colors> =
    compositionLocalOf {
        lightColors()
    }
