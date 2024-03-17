package glass.yasan.concrete.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import glass.yasan.concrete.theme.ConcreteTheme

@Composable
public fun LazyScreen(
    content: LazyListScope.() -> Unit,
    modifier: Modifier = Modifier,
    showTopBarDivider: Boolean = true,
    showBottomBarDivider: Boolean = true,
    topBar: (@Composable () -> Unit)? = null,
    bottomBar: (@Composable () -> Unit)? = null,
) {
    Column(
        modifier = modifier
            .background(ConcreteTheme.colors.layer.midground)
            .fillMaxSize(),
    ) {
        if (topBar != null) {
            Column(
                modifier = Modifier
                    .background(ConcreteTheme.colors.layer.foreground)
            ) {
                topBar()
                Divider(enabled = showTopBarDivider)
            }
        }
        LazyColumn(
            modifier = Modifier.weight(1f),
            content = content,
        )
        if (bottomBar != null) {
            Column(
                modifier = Modifier
                    .background(ConcreteTheme.colors.layer.foreground)
            ) {
                Divider(enabled = showBottomBarDivider)
                bottomBar()
            }
        }
    }
}
