package com.github.musinapolina.urlhashcodeinspectionplugin

import com.intellij.testFramework.TestDataPath
import com.intellij.testFramework.fixtures.LightJavaCodeInsightFixtureTestCase

@TestDataPath("\$CONTENT_ROOT/src/test/testData")
class UrlHashCodeInspectionPluginTest : LightJavaCodeInsightFixtureTestCase() {
    override fun getTestDataPath() = "src/test/testData"

    private val filePath = "Test.java"
    @Throws(Exception::class)
    fun testPlugin() {
        myFixture.configureByFile(filePath)
        myFixture.enableInspections(UrlHashCodeInspection())
        val highlightInfos = myFixture.doHighlighting()
        assertFalse(highlightInfos.isEmpty())
    }
}
