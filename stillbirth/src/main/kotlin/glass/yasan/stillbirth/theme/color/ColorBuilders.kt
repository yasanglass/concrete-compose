package glass.yasan.stillbirth.theme.color

import androidx.compose.ui.graphics.Color
import glass.yasan.stillbirth.theme.color.Colors.Content
import glass.yasan.stillbirth.theme.color.Colors.Layer

public fun lightColors(
    layerForeground: Color = ColorTokens.layerForegroundLight,
    layerMidground: Color = ColorTokens.layerMidgroundLight,
    layerBackground: Color = ColorTokens.layerBackgroundLight,
    layerBackgroundOpposite: Color = ColorTokens.layerBackgroundOppositeLight,
    textTitle: Color = ColorTokens.contentMajorLight,
    textDescription: Color = ColorTokens.contentMinorLight,
): Colors = Colors(
    content = Content(
        major = textTitle,
        minor = textDescription,
    ),
    layer = Layer(
        foreground = layerForeground,
        midground = layerMidground,
        background = layerBackground,
        backgroundOpposite = layerBackgroundOpposite,
    ),
    isLight = true,
)

public fun darkColors(
    layerForeground: Color = ColorTokens.layerForegroundDark,
    layerMidground: Color = ColorTokens.layerMidgroundDark,
    layerBackground: Color = ColorTokens.layerBackgroundDark,
    layerBackgroundOpposite: Color = ColorTokens.layerBackgroundOppositeDark,
    textTitle: Color = ColorTokens.contentMajorDark,
    textDescription: Color = ColorTokens.contentMinorDark,
): Colors = Colors(
    layerForeground = layerForeground,
    layerMidground = layerMidground,
    layerBackground = layerBackground,
    layerBackgroundOpposite = layerBackgroundOpposite,
    contentMajor = textTitle,
    contentMinor = textDescription,
    isLight = false,
)