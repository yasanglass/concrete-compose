package glass.yasan.concrete.theme.color

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
public class Colors(
    public var content: Content,
    public var layer: Layer,
    public var isLight: Boolean,
) {

    public constructor(
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

    public class Content(
        public val major: Color,
        public val minor: Color,
    )

    public class Layer(
        public val foreground: Color,
        public val midground: Color,
        public val background: Color,
        public val backgroundOpposite: Color,
    )

    public fun copy(
        content: Content = this.content,
        layer: Layer = this.layer,
        isLight: Boolean = this.isLight,
    ): Colors = Colors(
        content = content,
        layer = layer,
        isLight = isLight,
    )

    public fun updateColorsFrom(
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
