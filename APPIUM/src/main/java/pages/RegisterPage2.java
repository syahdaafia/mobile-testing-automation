package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage2 {
    private final WebDriverWait wait;

    public RegisterPage2(AppiumDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    private final By activity1RadioButton = By.id("com.fghilmany.dietmealapp:id/rb_rest");
    private final By activity2RadioButton = By.id("com.fghilmany.dietmealapp:id/rb_very_very_low");
    private final By activity3RadioButton = By.id("com.fghilmany.dietmealapp:id/rb_very_low");
    private final By activity4RadioButton = By.id("com.fghilmany.dietmealapp:id/rb_low_to_medium");
    private final By activity5RadioButton = By.id("com.fghilmany.dietmealapp:id/rb_medium");
    private final By activity6RadioButton = By.id("com.fghilmany.dietmealapp:id/rb_heavy");
    private final By activity7RadioButton = By.id("com.fghilmany.dietmealapp:id/rb_very_heavy");
    private final By selesaiButton = By.id("com.fghilmany.dietmealapp:id/bt_finish");
    private final By successMessage = By.id("com.fghilmany.dietmealapp:id/tv_header_meal");
    private final By stillOnPage2 = By.id("com.fghilmany.dietmealapp:id/title_activity");

    public void chooseActivity1() {
        wait.until(ExpectedConditions.elementToBeClickable(activity1RadioButton)).click();
    }

    public void chooseActivity2() {
        wait.until(ExpectedConditions.elementToBeClickable(activity2RadioButton)).click();
    }
    public void chooseActivity3() {
        wait.until(ExpectedConditions.elementToBeClickable(activity3RadioButton)).click();
    }
    public void chooseActivity4() {
        wait.until(ExpectedConditions.elementToBeClickable(activity4RadioButton)).click();
    }
    public void chooseActivity5() {
        wait.until(ExpectedConditions.elementToBeClickable(activity5RadioButton)).click();
    }
    public void chooseActivity6() {
        wait.until(ExpectedConditions.elementToBeClickable(activity6RadioButton)).click();
    }
    public void chooseActivity7() {
        wait.until(ExpectedConditions.elementToBeClickable(activity7RadioButton)).click();
    }

    public void clickSelesai() {
        wait.until(ExpectedConditions.elementToBeClickable(selesaiButton)).click();
    }

    public boolean isRegisterSuccessful() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).isDisplayed();
    }

    public boolean isStillOnPage2(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(stillOnPage2)).isDisplayed();
    }
}
