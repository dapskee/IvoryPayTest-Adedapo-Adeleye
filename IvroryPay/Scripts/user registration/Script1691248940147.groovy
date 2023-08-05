import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.d1ainun5cjrnni.amplifyapp.com/login')

WebUI.click(findTestObject('Object Repository/Page_IvoryPay Dashboard/a_Sign up'))

WebUI.setText(findTestObject('Object Repository/Page_IvoryPay Dashboard/input_First name_register_firstName'), 'Bola')

WebUI.setText(findTestObject('Object Repository/Page_IvoryPay Dashboard/input_Last name_register_lastName'), 'Tinubu')

WebUI.setText(findTestObject('Object Repository/Page_IvoryPay Dashboard/input_Email Address_register_email'), 'bola@mailinator.com')

WebUI.setText(findTestObject('Object Repository/Page_IvoryPay Dashboard/input_Business Name_register_businessName'), 'Bola Limited')

WebUI.click(findTestObject('Object Repository/Page_IvoryPay Dashboard/div_Country_ant-select-selector'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_IvoryPay Dashboard/nigeria'))

WebUI.setText(findTestObject('Object Repository/Page_IvoryPay Dashboard/input_Business Name_register_businessName'), 'Bola Limited')

WebUI.doubleClick(findTestObject('Object Repository/Page_IvoryPay Dashboard/body_iframe srchttpswww.googletagmanager.co_bc97cb'))

WebUI.setText(findTestObject('Object Repository/Page_IvoryPay Dashboard/input_Phone Number_ant-input'), '08056789098')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_IvoryPay Dashboard/input_Password_register_password'), 'cvW8qx4B2o1WegCEDy41Xg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_IvoryPay Dashboard/input_Confirm Password_register_confirmPassword'), 
    'cvW8qx4B2o1WegCEDy41Xg==')

WebUI.click(findTestObject('Object Repository/Page_IvoryPay Dashboard/input_What type of business do you own_ant-_7c9937'))

WebUI.click(findTestObject('Object Repository/Page_IvoryPay Dashboard/input_What type of business do you own_ant-_7c9937'))

WebUI.click(findTestObject('Page_IvoryPay Dashboard/is dev'))

WebUI.click(findTestObject('Object Repository/Page_IvoryPay Dashboard/input_Send me Information about products, s_232f39'))

WebUI.click(findTestObject('Object Repository/Page_IvoryPay Dashboard/span_Sign Up'))

