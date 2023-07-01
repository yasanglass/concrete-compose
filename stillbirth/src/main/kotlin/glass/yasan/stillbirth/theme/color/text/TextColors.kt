package glass.yasan.stillbirth.theme.color.text

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
class TextColors(
    var title: Color,
    var description: Color,
    var isLight: Boolean,
) {

    fun copy(
        title: Color = this.title,
        description: Color = this.description,
        isLight: Boolean = this.isLight,
    ) = TextColors(
        title = title,
        description = description,
        isLight = isLight,
    )

    fun updateTextColorsFrom(other: TextColors) {
        title = other.title
        description = other.description
        isLight = other.isLight
    }
}

internal val LocalTextColors: ProvidableCompositionLocal<TextColors> = compositionLocalOf { lightTextColors() }
