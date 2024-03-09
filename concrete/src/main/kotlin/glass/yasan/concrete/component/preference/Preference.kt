package glass.yasan.concrete.component.preference

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import glass.yasan.concrete.component.Text
import glass.yasan.concrete.theme.ConcreteTheme
import glass.yasan.spine.compose.foundation.grid

@Composable
public fun Preference(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    description: @Composable (() -> Unit)? = null,
    paddingVertical: Dp = 1.grid,
    paddingHorizontal: Dp = 2.grid,
    start: @Composable (() -> Unit)? = null,
    end: @Composable (() -> Unit)? = null,
) {
    Row(
        modifier = modifier
            .background(color = ConcreteTheme.colors.layer.foreground)
            .fillMaxWidth()
            .padding(
                horizontal = paddingHorizontal,
                vertical = paddingVertical,
            ),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        start?.let { it() }
        Column(
            modifier = Modifier.weight(1f),
        ) {
            title()
            description?.let { it() }
        }
        end?.let { it() }
    }
}

@Composable
public fun Preference(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    description: @Composable (() -> Unit)? = null,
    applyPaddings: Boolean = true,
    start: @Composable (() -> Unit)? = null,
    end: @Composable (() -> Unit)? = null,
) {
    val paddingHorizontal = if (applyPaddings) 2.grid else 0.grid
    val paddingVertical = if (applyPaddings) 1.grid else 0.grid

    Preference(
        title = title,
        modifier = modifier,
        description = description,
        paddingVertical = paddingVertical,
        paddingHorizontal = paddingHorizontal,
        start = start,
        end = end,
    )
}


// region Preview

@Preview
@Composable
private fun PreferenceLayoutPreview() {
    ConcreteTheme {
        Preference(
            start = {
                Text(
                    modifier = Modifier.background(Color.Red),
                    text = "Start",
                )
            },
            title = {
                Text(
                    modifier = Modifier.background(Color.Green),
                    text = "Title",
                )
            },
            description = {
                Text(
                    modifier = Modifier.background(Color.Blue),
                    text = "Description",
                )
            },
            end = {
                Text(
                    modifier = Modifier.background(Color.Red),
                    text = "End",
                )
            },
        )
    }
}

// endregion Preview
