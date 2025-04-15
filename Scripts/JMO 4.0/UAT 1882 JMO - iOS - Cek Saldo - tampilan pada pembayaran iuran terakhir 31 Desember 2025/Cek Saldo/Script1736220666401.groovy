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

Mobile.startApplication('/Users/admin/Downloads/jmo-ios 2025-01-07. Bug fixing 2.8.1/Apps/jmo-ios-9D900BDF-D9DB-458E-83B5-52D09217EECA.ipa', 
    true)

Mobile.tap(findTestObject('Object Repository/JMO/Login/XCUIElementTypeStaticText - Lebih Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Login/XCUIElementTypeStaticText - Lebih Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Login/XCUIElementTypeStaticText - Login'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Login/XCUIElementTypeTextField'), 0)

Mobile.setText(findTestObject('Object Repository/JMO/Login/XCUIElementTypeTextField'), 'julyandadessy@yahoo.com', 0)

Mobile.tap(findTestObject('Object Repository/JMO/Login/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Login/XCUIElementTypeSecureTextField'), 0)

Mobile.setText(findTestObject('Object Repository/JMO/Login/XCUIElementTypeSecureTextField'), 'Welcome8#', 0)

Mobile.tap(findTestObject('Object Repository/JMO/Login/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Login/XCUIElementTypeButton - Login'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/JMO/Login/XCUIElementTypeImage - bpjs-tku-logo'), 0)

Mobile.delay(2)

Mobile.tapAtPosition(100, 100)

Mobile.tap(findTestObject('Object Repository/JMO/Cek Saldo/XCUIElementTypeStaticText - Jaminan Hari Tua'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Cek Saldo/XCUIElementTypeStaticText - Cek Saldo'), 0)

Mobile.waitForElementPresent(findTestObject('JMO/Beranda/XCUIElementTypeImage - chevron-down - Pilih KPJ'), 0)

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/JMO/Cek Saldo/XCUIElementTypeButton - btn back'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Cek Saldo/XCUIElementTypeButton - btn back'), 0)

