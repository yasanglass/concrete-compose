package glass.yasan.concrete.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import glass.yasan.concrete.theme.StillbirthTheme

@Composable
public fun BottomBar(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Column(
        modifier = modifier
            .background(color = StillbirthTheme.colors.layer.foreground)
            .fillMaxWidth(),
    ) {
        Divider()
        content()
    }
}