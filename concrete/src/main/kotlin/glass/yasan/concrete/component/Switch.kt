package glass.yasan.concrete.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.sp
import glass.yasan.concrete.component.internal.ConcretePreviews
import glass.yasan.concrete.component.internal.PreviewTheme
import glass.yasan.concrete.component.preference.Preference
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
                modifier = Modifier.padding(vertical = 1.grid)
            )
        },
        description = description?.let {
            {
                Text(
                    text = it,
                    color = ConcreteTheme.colors.content.minor,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(bottom = 1.grid)
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
    DisabledUnChecked(
        enabled = false,
        checked = false,
    ),
}

internal class SwitchPreviewParamsProvider : PreviewParameterProvider<SwitchPreviewParams> {
    override val values: Sequence<SwitchPreviewParams> = SwitchPreviewParams.entries.asSequence()
}

@ConcretePreviews
@Composable
internal fun SwitchPreview(
    @PreviewParameter(SwitchPreviewParamsProvider::class)
    params: SwitchPreviewParams,
) {
    PreviewTheme {
        with(params) {
            val mutableChecked = remember {
                mutableStateOf(checked)
            }
            Switch(
                title = title,
                description = description,
                checked = mutableChecked.value,
                onCheckedChange = {
                    mutableChecked.value = it
                },
                enabled = enabled,
            )
        }
    }
}

// endregion Preview
