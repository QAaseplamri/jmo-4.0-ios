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
import redisKeywords.RedisUtils as RedisUtils
import java.util.UUID as UUID

Mobile.startApplication(GlobalVariable.App, true)

Mobile.waitForElementPresent(findTestObject('Object Repository/JMO/Login/XCUIElementTypeStaticText - Lebih Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Login/XCUIElementTypeStaticText - Lebih Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Login/XCUIElementTypeStaticText - Lebih Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Login/XCUIElementTypeStaticText - Login'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeTextField'), 0)

String randomEmail = ('test_' + UUID.randomUUID().toString()) + '@gmail.com'

// Log untuk memastikan emailnya benar
println('Generated email: ' + randomEmail)

// Gunakan email ini di test case
//Mobile.setText(findTestObject('YourTestObject_EmailField'), randomEmail, 0)
Mobile.setText(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeTextField'), randomEmail, 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeSecureTextField'), 0)

Mobile.setText(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeSecureTextField'), 'Welcome1##', 
    0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Done'), 0)

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Login'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Ok'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Login'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Ok'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Login'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Ok'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Login'), 0)

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Aktivasi Akun'), 0)

Mobile.delay(2)

Mobile.tapAtPosition(306, 120)

Mobile.waitForElementPresent(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeStaticText - Penerima Upah'), 
    0)

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeStaticText - Penerima Upah'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeImage - icDropdown'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeStaticText - Warga Negara Indonesia'), 
    0)

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeTextField - Nomor Induk Kependudukan'), 
    0)

Mobile.setText(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeTextField - Nomor Induk Kependudukan'), 
    '3203291208960001', 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeTextField - Nomor Peserta (KPJ)'), 
    0)

Mobile.setText(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeTextField - Nomor Peserta (KPJ)'), 
    '22069299679', 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeTextField - Nama Lengkap'), 0)

Mobile.setText(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeTextField - Nama Lengkap'), 
    'asep lamri', 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeTextField - Tanggal Lahir'), 0)

Mobile.setText(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeTextField - Tanggal Lahir'), 
    '12-08-1996', 0)

Mobile.tap(findTestObject('JMO/Registrasi dan Aktivasi/Kalender/XCUIElementTypeButton - Cancel'), 0)

//Mobile.tap(findTestObject('JMO/Registrasi dan Aktivasi/Kalender/XCUIElementTypePickerWheel - 12'), 0)
//
//// Swipe dari atas ke bawah
//Mobile.swipe(380, 1693, 380, 1420)
//Mobile.swipe(380, 1693, 380, 1420)
//
//Mobile.tap(findTestObject('JMO/Registrasi dan Aktivasi/Kalender/XCUIElementTypePickerWheel - August'), 0)
//
//// Swipe dari atas ke atas
//
//Mobile.swipe(770, 1420, 602, 1693)
//Mobile.swipe(770, 1420, 602, 1693)
//
//Mobile.tap(findTestObject('JMO/Registrasi dan Aktivasi/Kalender/XCUIElementTypePickerWheel - 1996'), 0)
//Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Done (1)'), 0)
Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Selanjutnya (1)'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeTextField - Email'), 0)

Mobile.setText(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeTextField - Email'), 'testing10@gmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Done'), 0)

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Selanjutnya (1)'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeTextView'), 0)

//Mobile.setText(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeTextView'), '491574', 0)
// Daftar Redis servers yang akan dicoba
List<Map> redisServers = [[('host') : '172.28.108.231', ('port') : 7000, ('password') : 'redisclusterDEV#' // Server Redis pertama
    ], [('host') : '172.28.108.235', ('port') : 7000, ('password') : 'redisclusterDEV#' // Server Redis kedua
    ], [('host') : '172.28.108.231', ('port') : 7001, ('password') : 'redisclusterDEV#' // Server Redis ketiga
    ]]

// Key yang digunakan untuk mendapatkan OTP
String emailotpkey = 'JMO#otp#testing10@gmail.com'

// Mendapatkan OTP dari beberapa Redis server
String otpemail = RedisUtils.getOTPFromMultipleRedisEmail(redisServers, emailotpkey)

if (otpemail != null) {
    println('OTP yang didapat dari Redis: ' + otpemail)

    // Lanjutkan untuk mengisi OTP di aplikasi
    Mobile.setText(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeTextView'), otpemail, 2)
} else {
    println('Gagal mendapatkan OTP dari semua Redis servers.')
}

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Verifikasi'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeTextField - Nomor Handphone'), 
    0)

Mobile.setText(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeTextField - Nomor Handphone'), 
    '858123456789', 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Done'), 0)

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Selanjutnya (1)'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeTextView'), 0)

//Mobile.setText(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeTextView'), '010309', 0)
// Key yang digunakan untuk mendapatkan OTP
String smsotpkey = 'JMO#otp#62858123456789'

// Mendapatkan OTP dari beberapa Redis server
String otpsms = RedisUtils.getOTPFromMultipleRedisSMS(redisServers, smsotpkey)

if (otpsms != null) {
    println('OTP yang didapat dari Redis: ' + otpsms)

    // Lanjutkan untuk mengisi OTP di aplikasi
    Mobile.setText(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeTextView'), otpsms, 2)
} else {
    println('Gagal mendapatkan OTP dari semua Redis servers.')
}

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Verifikasi'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeStaticText - Ambil Foto'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - ic checkbox disable'), 
    0)

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Selanjutnya (2)'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Izinkan Kamera'), 0)

'Melakukan bimetrik'
Mobile.delay(3)

Mobile.takeScreenshot()

Mobile.waitForElementPresent(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeSecureTextField - Kata sandi baru'), 
    0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeSecureTextField - Kata sandi baru'), 
    0)

Mobile.setText(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeSecureTextField - Kata sandi baru'), 
    'Welcome1#', 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeSecureTextField - Konfirmasi kata sandi'), 
    0)

Mobile.setText(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeSecureTextField - Konfirmasi kata sandi'), 
    'Welcome1#', 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Done'), 0)

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Selanjutnya (3)'), 0)

Mobile.scrollToText('Setuju')

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Setuju'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeStaticText - Aktivasi dan verifikasi kepesertaan Anda di BPJAMSOSTEK berhasil. Anda dapat mengakses semua fitur di aplikasi ini'), 
    'Aktivasi dan verifikasi kepesertaan Anda di BPJAMSOSTEK berhasil. Anda dapat mengakses semua fitur di aplikasi ini')

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Ok, Terima Kasih'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Profil Saya'), 
    0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - Profil Saya'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeStaticText - Ubah Profil'), 0)

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeButton - btn back'), 0)

Mobile.tap(findTestObject('Object Repository/JMO/Registrasi dan Aktivasi/XCUIElementTypeImage - icLogout'), 0)

