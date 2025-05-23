package i.progress.tech.github_actions

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import i.progress.tech.github_actions.ui.IncrementScreen
import i.progress.tech.github_actions.ui.theme.Github_actionsTheme
import org.junit.Rule
import org.junit.Test

class TestIncrementalScreen {
    @get:Rule val composeTestRule = createComposeRule()

    @Test
    fun shouldShow2(){
        composeTestRule.setContent {
            Github_actionsTheme {
                IncrementScreen()
            }
        }
        composeTestRule.onNodeWithText("Plus").performClick()
        composeTestRule.onNodeWithText("Value = 2").assertExists()
    }
    @Test
    fun shouldShowMinus1(){
        composeTestRule.setContent {
            Github_actionsTheme {
                IncrementScreen()
            }
        }
        composeTestRule.onNodeWithText("Minus").performClick()
        composeTestRule.onNodeWithText("Value = -1").assertExists()
    }
}