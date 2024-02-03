package glass.yasan.concrete.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.sp
import glass.yasan.concrete.theme.ConcreteTheme
import androidx.compose.material3.Switch as Material3Switch

@Composable
public fun Switch(
    title: String,
    checked: Boolean,
    modifier: Modifier = Modifier,
    description: String? = null,
    onCheckedChange: (Boolean) -> Unit,
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
        modifier = modifier,
        end = {
            Material3Switch(
                checked = checked,
                onCheckedChange = onCheckedChange,
            )
        },
    )
}

// region Preview

internal enum class SwitchPreviewParams(
    val title: String = "Title",
    val description: String? = "Description",
    val checked: Boolean = true
) {
    Unchecked(
        checked = false,
    ),
    WithoutDescription(
        description = null,
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
            )
        }
    }
}

// endregion Preview
