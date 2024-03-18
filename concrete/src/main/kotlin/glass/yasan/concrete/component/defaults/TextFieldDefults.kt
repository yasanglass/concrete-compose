package glass.yasan.concrete.component.defaults

import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import glass.yasan.concrete.theme.ConcreteTheme

@Composable
public fun concreteTextFieldDefaults(): TextFieldDefaults = TextFieldDefaults.apply {
    colors().copy(
        disabledIndicatorColor = ConcreteTheme.colors.layer.background,
        errorIndicatorColor = ConcreteTheme.colors.layer.background,
        focusedIndicatorColor = ConcreteTheme.colors.theme.primary,
        unfocusedIndicatorColor = ConcreteTheme.colors.layer.background,
    )
}
