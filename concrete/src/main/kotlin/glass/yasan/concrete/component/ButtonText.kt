package glass.yasan.concrete.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import glass.yasan.spine.compose.foundation.grid

@Composable
public fun ButtonText(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    startIcon: ImageVector? = null,
    endIcon: ImageVector? = null,
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        content = { color ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
            ) {
                startIcon?.let { icon ->
                    Icon(
                        imageVector = icon,
                        contentDescription = null,
                        tint = color,
                        modifier = Modifier.padding(start = 2.grid),
                    )
                }
                SpacerHorizontal(width = 2.grid)
                Text(
                    text = text,
                    color = color,
                    modifier = Modifier
                        .padding(
                            vertical = 2.grid,
                        ),
                )
                SpacerHorizontal(width = 2.grid)
                endIcon?.let { icon ->
                    Icon(
                        imageVector = icon,
                        contentDescription = null,
                        tint = color,
                        modifier = Modifier.padding(end = 2.grid),
                    )
                }
            }
        },
    )
}