import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.setText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Log in to Facebook_email'), '9994543833')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Log in to Facebook_pass'), 
    'V+5v479xnh9YKsltYkQ3xw==')

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook  Facebook/a_Recover Your Account'))

WebUI.setText(findTestObject('Object Repository/Page_Forgotten Password  Cant Log In  Facebook/input_Please enter your email address or phone number to search for your account_email'), 
    '9994543833')

WebUI.click(findTestObject('Object Repository/Page_Forgotten Password  Cant Log In  Facebook/input_Please enter your email address or phone number to search for your account_did_submit'))

