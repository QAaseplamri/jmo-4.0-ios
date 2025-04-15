package redisKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
//import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
//import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
//import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import redis.clients.jedis.Jedis

import internal.GlobalVariable

public class RedisUtils {
	// Method untuk mendapatkan OTP dari beberapa Redis server
	@Keyword
	static String getOTPFromMultipleRedisEmail(List<Map<String, Object>> redisServers, String emailotpkey) {
		for (Map<String, Object> server : redisServers) {
			String host = server.get("host")
			int port = (int) server.get("port")
			String password = server.get("password")
			println("Mencoba menghubungkan ke Redis server: " + host + ":" + port)

			Jedis jedis = null
			try {
				// Membuat koneksi ke Redis
				jedis = new Jedis(host, port)

				// Jika Redis memerlukan autentikasi, lakukan autentikasi
				if (password != null && !password.isEmpty()) {
					jedis.auth(password)
				}

				// Mendapatkan OTP dari Redis berdasarkan key
				String otp = jedis.get(emailotpkey)


				if (otp != null) {
					println("OTP ditemukan di Redis server: " + host + ":" + port + " - OTP: " + otp)
					return otp
				} else {
					println("OTP tidak ditemukan di Redis server: " + host + ":" + port)
				}
			} catch (Exception e) {
				println("Gagal terhubung ke Redis server: " + host + ":" + port)
				e.printStackTrace()
			} finally {
				// Tutup koneksi Redis
				if (jedis != null) {
					jedis.close()
				}
			}
		}
		return null  // Jika tidak ada OTP yang ditemukan di semua Redis server
	}

	@Keyword
	static String getOTPFromMultipleRedisSMS(List<Map<String, Object>> redisServers, String smsotpkey) {
		for (Map<String, Object> server : redisServers) {
			String host = server.get("host")
			int port = (int) server.get("port")
			String password = server.get("password")
			println("Mencoba menghubungkan ke Redis server: " + host + ":" + port)

			Jedis jedis = null
			try {
				// Membuat koneksi ke Redis
				jedis = new Jedis(host, port)

				// Jika Redis memerlukan autentikasi, lakukan autentikasi
				if (password != null && !password.isEmpty()) {
					jedis.auth(password)
				}

				// Mendapatkan OTP dari Redis berdasarkan key
				String otp = jedis.get(smsotpkey)


				if (otp != null) {
					println("OTP ditemukan di Redis server: " + host + ":" + port + " - OTP: " + otp)
					return otp
				} else {
					println("OTP tidak ditemukan di Redis server: " + host + ":" + port)
				}
			} catch (Exception e) {
				println("Gagal terhubung ke Redis server: " + host + ":" + port)
				e.printStackTrace()
			} finally {
				// Tutup koneksi Redis
				if (jedis != null) {
					jedis.close()
				}
			}
		}
		return null  // Jika tidak ada OTP yang ditemukan di semua Redis server
	}
}
