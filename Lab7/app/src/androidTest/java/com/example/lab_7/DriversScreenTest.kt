package com.example.lab_7

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class DriversScreenTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun testDriversScreen_Navigation_Actions() {
        composeTestRule.onNodeWithText("FormulaZero Home").assertExists()

        composeTestRule.onNodeWithTag("driversButton").performClick()

        composeTestRule.onNodeWithText("FormulaZero Drivers").assertExists()

        composeTestRule.onNodeWithTag("DriverInput").performTextInput("Lewis Hamilton")

        composeTestRule.onNodeWithTag("addDriverButton").performClick()

        composeTestRule.onNodeWithText("Lewis Hamilton").assertExists()

        composeTestRule.onNodeWithTag("clearButton").performClick()

        composeTestRule.onNodeWithText("Lewis Hamilton").assertDoesNotExist()

        composeTestRule.onNodeWithTag("backButton").performClick()

        composeTestRule.onNodeWithText("FormulaZero Home").assertExists()
    }
}
