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

WebUI.callTestCase(findTestCase('JMO 4.0/Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/JMO/Beranda/XCUIElementTypeButton - Berita'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/JMO/Beranda/XCUIElementTypeStaticText - BPJS Ketenagakerjaan, Bank BJB dan REI Bersinergi Sediakan Rumah bagi Pekerja'), 
    0)

Mobile.tap(findTestObject('Object Repository/JMO/Beranda/XCUIElementTypeStaticText - BPJS Ketenagakerjaan, Bank BJB dan REI Bersinergi Sediakan Rumah bagi Pekerja'), 
    0)

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.scrollToText('Berita Lainnya')

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/JMO/Beranda/XCUIElementTypeButton - btn back'), 0)

WebUI.callTestCase(findTestCase('JMO 4.0/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

