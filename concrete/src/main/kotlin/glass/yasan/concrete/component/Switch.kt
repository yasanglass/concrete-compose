package glass.yasan.concrete.component

import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.sp
import glass.yasan.concrete.theme.ConcreteTheme
import glass.yasan.spine.compose.foundation.grid
import androidx.compose.material3.Switch as Material3Switch

@Composable
public fun Switch(
    title: String,
    checked: Boolean?,
    modifier: Modifier = Modifier,
    description: String? = null,
    onCheckedChange: (Boolean) -> Unit,
) {
    Switch(
        title = title,
        checked = checked ?: false,
        modifier = modifier,
        description = description,
        onCheckedChange = onCheckedChange,
        enabled = checked != null,
    )
}

@Composable
public fun Switch(
    title: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
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
            .clickable(enabled = enabled) {
                onCheckedChange(!checked)
            },
        end = {
            Material3Switch(
                checked = checked,
                onCheckedChange = onCheckedChange,
                enabled = enabled,
            )
        },
        paddingVertical = 0.25f.grid,
    )
}

// region Preview

internal enum class SwitchPreviewParams(
    val title: String = "Title",
    val description: String? = "Description",
    val checked: Boolean = true,
    val enabled: Boolean = true
) {
    Unchecked(
        checked = false,
    ),
    WithoutDescription(
        description = null,
    ),
    Disabled(
        enabled = false,
    ),
}

internal class SwitchPreviewParamsProvider : PreviewParameterProvider<SwitchPreviewParams> {
    override val values: Sequence<SwitchPreviewParams> = SwitchPreviewParams.entries.asSequence()
}

@Preview
@Composable
internal fun SwitchPreview(
    @PreviewParameter(SwitchPreviewParamsProvider::class)
    params: SwitchPreviewParams,
) {
    ConcreteTheme {
        with(params) {
            Switch(
                title = title,
                description = description,
                checked = checked,
                onCheckedChange = {},
                enabled = enabled,
            )
        }
    }
}

// endregion Preview
