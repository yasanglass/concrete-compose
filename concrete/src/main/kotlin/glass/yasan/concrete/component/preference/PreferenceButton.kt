package glass.yasan.concrete.component.preference

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.sp
import glass.yasan.concrete.component.Icon
import glass.yasan.concrete.component.Text
import glass.yasan.concrete.theme.ConcreteTheme
import glass.yasan.spine.compose.foundation.grid

@Composable
public fun PreferenceButton(
    title: String,
    startIcon: ImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    endIcon: ImageVector? = null,
    description: String? = null,
    enabled: Boolean = true,
) {
    Preference(
        title = {
            Text(
                text = title,
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
            Icon(
                imageVector = startIcon,
                contentDescription = null,
                modifier = Modifier.padding(2.grid),
            )
        },
        end = {
            endIcon?.let { icon ->
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    modifier = Modifier.padding(2.grid),
                )
            }
        },
        applyPaddings = false,
    )
}
