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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\Bri\\Downloads\\FINALPROJECTS-201016-121328\\FINAL PROJECTS\\MOBILE\\app-debug.apk', 
    true)

Mobile.setText(findTestObject('Object Repository/New account/android.widget.EditText - Username'), 'sissysorayaa', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/New account/android.widget.EditText - Password'), 'PUzfDdK+d5w8D7fm7CT/mw==', 
    0)

Mobile.tap(findTestObject('Object Repository/New account/android.widget.Button - LOGIN'), 0)

Mobile.tap(findTestObject('Object Repository/New account/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/New account/android.support.v7.widget.LinearLayoutCompat'), 0)

Mobile.tap(findTestObject('Object Repository/New account/android.widget.ImageButton (1)'), 0)

Mobile.setText(findTestObject('Object Repository/New account/android.widget.EditText - Account Name'), 'sissysor', 0)

Mobile.setText(findTestObject('Object Repository/New account/android.widget.EditText - Initial Balance (Optional)'), '50000', 
    0)

Mobile.tap(findTestObject('Object Repository/New account/android.widget.Button - ADD'), 0)

Mobile.closeApplication()

