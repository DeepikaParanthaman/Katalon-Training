import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.setURL)

WebUI.click(findTestObject('Object Repository/a_Input Forms'))

WebUI.click(findTestObject('Day2 Repository/Exercise/Sceanrio2/Page_Selenium Easy - Checkbox demo/a_Checkbox Demo'))

WebUI.click(findTestObject('Object Repository/input_isAgeSelected'))

WebUI.verifyElementChecked(findTestObject('Object Repository/input_isAgeSelected'), 5)

OUTPUTMSG = WebUI.getText(findTestObject('Object Repository/div_Success - Check box is che'))

WebUI.verifyMatch(OUTPUTMSG, a, false)

WebUI.click(findTestObject('Day2 Repository/Exercise/Sceanrio2/Page_Selenium Easy - Checkbox demo/CheckAll Button'))

not_run: WebUI.verifyElementChecked(findTestObject('Day2 Repository/Exercise/Sceanrio2/Page_Selenium Easy - Checkbox demo/label_Option 1'), 
    0)

not_run: WebUI.verifyElementChecked(findTestObject('Day2 Repository/Exercise/Sceanrio2/Page_Selenium Easy - Checkbox demo/label_Option 2'), 
    0)

not_run: WebUI.verifyElementChecked(findTestObject('Day2 Repository/Exercise/Sceanrio2/Page_Selenium Easy - Checkbox demo/label_Option 3'), 
    0)

not_run: WebUI.verifyElementChecked(findTestObject('Day2 Repository/Exercise/Sceanrio2/Page_Selenium Easy - Checkbox demo/label_Option 4'), 
    0)

WebUI.verifyElementPresent(findTestObject('Day2 Repository/Exercise/Sceanrio2/Page_Selenium Easy - Checkbox demo/UnCheck All Button'), 
    0)

