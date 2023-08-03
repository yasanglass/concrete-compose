package glass.yasan.stillbirth.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import glass.yasan.stillbirth.theme.color.Colors
import glass.yasan.stillbirth.theme.color.LocalColors

@Composable
public fun StillbirthTheme(
    colors: Colors = StillbirthTheme.colors,
    content: @Composable () -> Unit,
) {
    val rememberedColors = remember { colors.copy() }.apply { updateColorsFrom(colors) }

    CompositionLocalProvider(
        LocalColors provides rememberedColors,
        content = content
    )
}

public object StillbirthTheme {

    val colors: Colors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current
}