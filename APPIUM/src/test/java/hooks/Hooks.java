package hooks;

import drivers.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class Hooks {
    @Before
    public void setUp() throws MalformedURLException {
        AppiumDriver driver = DriverManager.getAppiumDriver();
        System.out.println("Appium session started: " + driver.getSessionId());
        DriverManager.restartApp(); // Restart aplikasi sebelum skenario dimulai
    }

    @After
    public void tearDown() {
        System.out.println("Closing Appium driver...");
        DriverManager.quitDriver(); // Pastikan driver di-quit setelah skenario selesai
    }
}
