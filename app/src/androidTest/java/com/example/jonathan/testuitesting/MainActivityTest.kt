package com.example.jonathan.testuitesting

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun buttonClick_updatesText() {
        // Verify initial state
        composeTestRule.onNodeWithText("Click me!").assertExists()
        composeTestRule.onNodeWithText("Count: 0").assertExists()

        // Perform a click on the button
        composeTestRule.onNodeWithText("Click me!").performClick()

        // Verify text updates
        composeTestRule.onNodeWithText("Count: 1").assertExists()
    }
}
