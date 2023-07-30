package glass.yasan.stillbirth.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import glass.yasan.stillbirth.theme.StillbirthTheme

@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Column(
        modifier = modifier
            .background(color = StillbirthTheme.colors.layerForeground)
            .fillMaxWidth(),
    ) {
        content()
        Divider()
    }
}