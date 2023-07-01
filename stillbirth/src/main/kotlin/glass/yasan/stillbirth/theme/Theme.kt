package glass.yasan.stillbirth.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import glass.yasan.stillbirth.theme.color.Colors
import glass.yasan.stillbirth.theme.color.LocalColors
import glass.yasan.stillbirth.theme.color.text.LocalTextColors
import glass.yasan.stillbirth.theme.color.text.TextColors

@Composable
public fun StillbirthTheme(
    colors: Colors = StillbirthTheme.colors,
    textColors: TextColors = StillbirthTheme.textColors,
    content: @Composable () -> Unit,
) {
    val rememberedColors = remember { colors.copy() }.apply { updateColorsFrom(colors) }
    val rememberedTextColors = remember { textColors.copy() }.apply { updateTextColorsFrom(textColors) }

    CompositionLocalProvider(
        LocalColors provides rememberedColors,
        LocalTextColors provides rememberedTextColors,
        content = content
    )
}

public object StillbirthTheme {

    val colors: Colors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val textColors: TextColors
        @Composable
        @ReadOnlyComposable
        get() = LocalTextColors.current
}