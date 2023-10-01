package glass.yasan.stillbirth.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import glass.yasan.stillbirth.theme.color.Colors
import glass.yasan.stillbirth.theme.color.LocalColors
import glass.yasan.stillbirth.theme.size.LocalSizes
import glass.yasan.stillbirth.theme.size.Sizes

@Composable
public fun StillbirthTheme(
    colors: Colors = StillbirthTheme.colors,
    sizes: Sizes = StillbirthTheme.sizes,
    content: @Composable () -> Unit,
) {
    val rememberedColors = remember { colors.copy() }.apply { updateColorsFrom(colors) }
    val rememberedSizes = remember { sizes.copy() }.apply { updateSizesFrom(sizes) }

    CompositionLocalProvider(
        LocalColors provides rememberedColors,
        LocalSizes provides rememberedSizes,
        content = content
    )
}

public object StillbirthTheme {

    public val colors: Colors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    public val sizes: Sizes
        @Composable
        @ReadOnlyComposable
        get() = LocalSizes.current
}