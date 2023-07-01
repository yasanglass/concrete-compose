package glass.yasan.stillbirth.theme.color

import androidx.compose.ui.graphics.Color

public fun lightColors(
    layerForeground: Color = ColorTokens.layerForegroundLight,
    layerMidground: Color = ColorTokens.layerMidgroundLight,
    layerBackground: Color = ColorTokens.layerBackgroundLight,
    layerBackgroundOpposite: Color = ColorTokens.layerBackgroundOppositeLight,
    textTitle: Color = ColorTokens.textTitleLight,
    textDescription: Color = ColorTokens.textDescriptionLight,
) = Colors(
    layerForeground = layerForeground,
    layerMidground = layerMidground,
    layerBackground = layerBackground,
    layerBackgroundOpposite = layerBackgroundOpposite,
    textTitle = textTitle,
    textDescription = textDescription,
    isLight = true,
)

public fun darkColors(
    layerForeground: Color = ColorTokens.layerForegroundDark,
    layerMidground: Color = ColorTokens.layerMidgroundDark,
    layerBackground: Color = ColorTokens.layerBackgroundDark,
    layerBackgroundOpposite: Color = ColorTokens.layerBackgroundOppositeDark,
    textTitle: Color = ColorTokens.textTitleDark,
    textDescription: Color = ColorTokens.textDescriptionDark,
) = Colors(
    layerForeground = layerForeground,
    layerMidground = layerMidground,
    layerBackground = layerBackground,
    layerBackgroundOpposite = layerBackgroundOpposite,
    textTitle = textTitle,
    textDescription = textDescription,
    isLight = false,
)