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

WebUI.navigateToUrl('https://www.zumrafood.com/en')

WebUI.click(findTestObject('Page_Zumra - The Republic of Asian Ingredients/span_Login'))

WebUI.setText(findTestObject('Page_Login  Zumra - The Republic of Asian I_bb4b1d/input_Phone Number'), '01800909012')

WebUI.click(findTestObject('Page_Login  Zumra - The Republic of Asian I_bb4b1d/span_Continue'))

WebUI.setText(findTestObject('Page_1 new message/input_otp-input'), '8')

WebUI.setText(findTestObject('Page_1 new message/input_otp-input_1'), '7')

WebUI.setText(findTestObject('Page_1 new message/input_otp-input_2'), '0')

WebUI.setText(findTestObject('Page_1 new message/input_otp-input_3'), '9')

WebUI.click(findTestObject('Page_Login  Zumra - The Republic of Asian I_bb4b1d/button_Continue'))

WebUI.click(findTestObject('Page_Login  Zumra - The Republic of Asian I_bb4b1d/i_'))

WebUI.closeBrowser()

