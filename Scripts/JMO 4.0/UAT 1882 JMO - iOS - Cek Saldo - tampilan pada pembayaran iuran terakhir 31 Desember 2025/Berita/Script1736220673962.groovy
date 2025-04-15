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

Mobile.tap(findTestObject('Object Repository/JMO/Beranda/XCUIElementTypeButton - Berita'), 0)

Mobile.waitForElementPresent(findTestObject('JMO/Beranda/XCUIElementTypeStaticText - Sasaran Program BPJS Ketenagakerjaan Khusus Buruh Tani di Sumenep Bakal Berubah, Penerima Sebelumnya Harus Bayar Secara Mandiri'), 
    0)

Mobile.tap(findTestObject('JMO/Beranda/XCUIElementTypeStaticText - Sasaran Program BPJS Ketenagakerjaan Khusus Buruh Tani di Sumenep Bakal Berubah, Penerima Sebelumnya Harus Bayar Secara Mandiri'), 
    0)

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.scrollToText('Berita Lainnya')

Mobile.delay(2)

Mobile.takeScreenshot()
device_Height = Mobile.getDeviceHeight()
device_Width = Mobile.getDeviceWidth()
int startX = device_Width / 2
int endX = startX
int startY = device_Height * 0.30
int endY = device_Height * 0.70

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)
Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.swipe(startX, endY, endX, startY)
Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/JMO/Beranda/XCUIElementTypeButton - btn back'), 0)

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)
Mobile.delay(2)

Mobile.takeScreenshot()
Mobile.swipe(startX, endY, endX, startY)
Mobile.delay(2)

Mobile.takeScreenshot()
Mobile.swipe(startX, endY, endX, startY)
Mobile.delay(2)

Mobile.takeScreenshot()
Mobile.swipe(startX, endY, endX, startY)
Mobile.delay(2)

Mobile.takeScreenshot()
Mobile.swipe(startX, endY, endX, startY)
Mobile.delay(2)

Mobile.takeScreenshot()
Mobile.swipe(startX, endY, endX, startY)
Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.swipe(startX, endY, endX, startY)
Mobile.delay(2)

Mobile.takeScreenshot()