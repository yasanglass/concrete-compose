package glass.yasan.stillbirth.theme.color.text

import androidx.compose.ui.graphics.Color
import glass.yasan.stillbirth.theme.color.ColorTokens

public fun lightTextColors(
    title: Color = ColorTokens.textTitleLight,
    description: Color = ColorTokens.textDescriptionLight,
) = TextColors(
    title = title,
    description = description,
    isLight = true,
)

public fun darkTextColors(
    title: Color = ColorTokens.textTitleDark,
    description: Color = ColorTokens.textDescriptionDark,
) = TextColors(
    title = title,
    description = description,
    isLight = false,
)