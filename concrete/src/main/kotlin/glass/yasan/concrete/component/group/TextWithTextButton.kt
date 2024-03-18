package glass.yasan.concrete.component.group

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import glass.yasan.concrete.component.ButtonText
import glass.yasan.concrete.component.SpacerVertical
import glass.yasan.concrete.component.Text
import glass.yasan.spine.compose.foundation.grid

/**
 * A simple column with a text on top and a button on the bottom.
 */
@Composable
public fun TextWithTextButton(
    text: String,
    buttonText: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    buttonModifier: Modifier = Modifier,
    buttonStartIcon: ImageVector? = null,
    buttonEndIcon: ImageVector? = null
) {
    Column(
        modifier = modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        SpacerVertical(height = 2.grid)
        Text(text = text)
        SpacerVertical(height = 2.grid)
        ButtonText(
            text = buttonText,
            startIcon = buttonStartIcon,
            endIcon = buttonEndIcon,
            onClick = onClick,
            modifier = buttonModifier,
        )
        SpacerVertical(height = 2.grid)
    }
}
