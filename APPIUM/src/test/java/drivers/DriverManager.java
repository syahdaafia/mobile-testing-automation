package drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {
    private static AppiumDriver driver;

    public static AppiumDriver getAppiumDriver() throws MalformedURLException {
        if (driver == null) {
            System.out.println("Initializing new Appium driver...");
            driver = new AndroidDriver(new URL(getAppiumServerUrl()), getCapabilities());
        } else {
            System.out.println("Reusing existing Appium driver...");
        }
        return driver;
    }

    public static void restartApp() {
        if (driver instanceof AndroidDriver androidDriver) {
            System.out.println("Restarting application...");
            androidDriver.terminateApp("com.fghilmany.dietmealapp"); // Tutup aplikasi
            androidDriver.activateApp("com.fghilmany.dietmealapp");  // Buka ulang aplikasi
        } else {
            System.out.println("Driver is not an instance of AndroidDriver");
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            System.out.println("Quitting Appium driver...");
            driver.quit();
            driver = null; // Reset driver agar dibuat ulang di skenario berikutnya
        }
    }

    private static String getAppiumServerUrl() {
        return System.getProperty("appium.server.url", "http://127.0.0.1:4723");
    }

    private static DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Format W3C (Harus ditambahkan "appium:" untuk yang spesifik Appium)
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:deviceName", "emulator-5554");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("appium:app", "D:\\SQA\\MOBILE AUTOMATION\\APPIUM\\appium-testing\\src\\test\\resources\\app\\Diet_meal.apk");
        capabilities.setCapability("appium:appPackage", "com.fghilmany.dietmealapp");
        capabilities.setCapability("appium:appActivity", "com.fghilmany.dietmealapp.ui.main.MainActivity");
        capabilities.setCapability("appium:noReset", true);

        return capabilities;
    }

}
