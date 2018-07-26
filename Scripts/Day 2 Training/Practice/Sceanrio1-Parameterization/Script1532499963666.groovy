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

WebUI.navigateToUrl('http://demo.automationtesting.in/Register.html')

WebUI.setText(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/input_form-control ng-untouche'), 
    '11AMA')

WebUI.setText(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/input_form-control ng-untouche_1'), 
    '11BCB')

WebUI.setText(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/textarea_form-control ng-untou'), 
    'SLK1 Bangalore')

WebUI.setText(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/input_form-control ng-untouche_2'), 
    'abc@test.com')

WebUI.setText(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/input_form-control ng-untouche_3'), 
    '12345')

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/input_radiooptions'))

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/input_checkbox2'))

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/div_msdd'))

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/a_English'))

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/div_Skills'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/select_Select Skills'), 
    'Adobe Photoshop', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/select_Select Country'), 
    'India', true)

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/span_select2-selection select2'))

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/li_Australia'))

WebUI.setEncryptedText(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/input_firstpassword'), 'Mq0XerdhNgFYFz0TkapcnQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/input_secondpassword'), 
    'Mq0XerdhNgFYFz0TkapcnQ==')

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/button_Submit'))

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/div_col-md-4 col-xs-4 col-sm-4'))

WebUI.setText(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/input_form-control ng-untouche_3'), 
    '9876543211')

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/button_Submit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/select_year'), '1934', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/select_Month'), 'January', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/select_Day'), '19', true)

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/button_Submit'))

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/div_col-md-4 col-xs-4 col-sm-4'))

WebUI.setEncryptedText(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/input_firstpassword'), 'DAa4LTRinddwaUvmgoWHVQ==')

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/div_(adsbygoogle  window.adsby'))

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/label_Confirm Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/input_firstpassword'), 'Mq0XerdhNgG2NC9fAgluKw==')

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/div_(adsbygoogle  window.adsby'))

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/div_function validatepasswords'))

WebUI.setEncryptedText(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/input_secondpassword'), 
    'Mq0XerdhNgG2NC9fAgluKw==')

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/button_Submit'))

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/html_charset UTF-8ngcloakng-cl'))

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/div_col-md-4 col-xs-4 col-sm-4'))

WebUI.setText(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/input_form-control ng-untouche_3'), 
    '8745231698')

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Register/button_Submit'))

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Web Table/a_Home'))

WebUI.click(findTestObject('Object Repository/Day2 Repository/Register/Page_Index/button_Skip Sign In'))

WebUI.closeBrowser()

