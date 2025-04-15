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

Mobile.tap(findTestObject('Object Repository/JMO/Cek Saldo/XCUIElementTypeButton - Kartu Digital'), 0)

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/JMO/Cek Saldo/XCUIElementTypeCell'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/JMO/Cek Saldo/XCUIElementTypeStaticText -     Klik untuk memperbesar'), 
    0)

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/JMO/Cek Saldo/XCUIElementTypeStaticText -     Klik untuk memperbesar'), 0)

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/JMO/Cek Saldo/XCUIElementTypeButton - Simpan'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Cek Saldo/XCUIElementTypeStaticText - Save Image'), 0)

Mobile.delay(10)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/JMO/Cek Saldo/XCUIElementTypeButton - btn back'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Cek Saldo/XCUIElementTypeButton - btn back'), 0)

