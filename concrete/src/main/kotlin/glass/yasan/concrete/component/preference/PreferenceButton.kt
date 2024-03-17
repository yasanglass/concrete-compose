package glass.yasan.concrete.component.preference

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.sp
import glass.yasan.concrete.component.Icon
import glass.yasan.concrete.component.SpacerHorizontal
import glass.yasan.concrete.component.Text
import glass.yasan.concrete.theme.ConcreteTheme
import glass.yasan.spine.compose.foundation.grid
import glass.yasan.spine.compose.util.adaptiveContentColor

@Composable
public fun PreferenceButton(
    title: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    startIcon: ImageVector? = null,
    endIcon: ImageVector? = null,
    description: String? = null,
    enabled: Boolean = true,
    uppercaseTitle: Boolean = false,
) {
    Preference(
        title = {
            Text(
                text = if (uppercaseTitle) title.uppercase() else title,
                color = ConcreteTheme.colors.content.major,
                fontSize = 16.sp,
            )
        },
        description = description?.let {
            {
                Text(
                    text = it,
                    color = ConcreteTheme.colors.content.minor,
                    fontSize = 14.sp,
                )
            }
        },
        modifier = modifier
            .clickable(
                enabled = enabled,
                onClick = onClick,
            ),
        start = {
            if (startIcon != null) {
                Icon(
                    imageVector = startIcon,
                    contentDescription = null,
                    modifier = Modifier.padding(2.grid),
                )
            } else {
                SpacerHorizontal(width = 2.grid)
            }
        },
        end = {
            if (endIcon != null) {
                Icon(
                    imageVector = endIcon,
                    contentDescription = null,
                    tint = ConcreteTheme.colors.content.major,
                    modifier = Modifier.padding(2.grid),
                )
            } else {
                SpacerHorizontal(width = 2.grid)
            }
        },
        applyPaddings = false,
    )
}

@Composable
public fun PreferenceButton(
    title: String,
    onClick: () -> Unit,
    backgroundColor: Color,
    modifier: Modifier = Modifier,
    contentColor: Color = adaptiveContentColor(backgroundColor = backgroundColor),
    startIcon: ImageVector? = null,
    endIcon: ImageVector? = null,
    enabled: Boolean = true,
    uppercaseTitle: Boolean = false,
) {
    Preference(
        title = {
            Text(
                text = if (uppercaseTitle) title.uppercase() else title,
                color = contentColor,
                fontSize = 16.sp,
            )
        },
        modifier = modifier
            .clickable(
                enabled = enabled,
                onClick = onClick,
            ),
        start = {
            if (startIcon != null) {
                Icon(
                    imageVector = startIcon,
                    contentDescription = null,
                    tint = contentColor,
                    modifier = Modifier.padding(2.grid),
                )
            } else {
                SpacerHorizontal(width = 2.grid)
            }
        },
        end = {
            if (endIcon != null) {
                Icon(
                    imageVector = endIcon,
                    contentDescription = null,
                    tint = contentColor,
                    modifier = Modifier.padding(2.grid),
                )
            } else {
                SpacerHorizontal(width = 2.grid)
            }
        },
        applyPaddings = false,
        backgroundColor = backgroundColor,
    )
}