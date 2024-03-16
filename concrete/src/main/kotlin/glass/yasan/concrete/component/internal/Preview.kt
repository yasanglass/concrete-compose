package glass.yasan.concrete.component.internal

import android.content.res.Configuration
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import glass.yasan.concrete.theme.ConcreteTheme
import glass.yasan.concrete.theme.color.darkColors
import glass.yasan.concrete.theme.color.lightColors

@Composable
internal fun PreviewTheme(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    val colors = when (!isSystemInDarkTheme()) {
        true -> lightColors()
        false -> darkColors()
    }
    ConcreteTheme(colors = colors) {
        Surface(
            modifier = modifier,
        ) {
            content()
        }
    }
}

@Preview(
    name = "Light",
    group = "light-mode",
)
@Preview(
    name = "Dark",
    group = "dark-mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
internal annotation class ConcretePreviews
