package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage1 {
    private final WebDriverWait wait;

    public RegisterPage1(AppiumDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private final By nameField = By.id("com.fghilmany.dietmealapp:id/et_name");
    private final By weightField = By.id("com.fghilmany.dietmealapp:id/et_weight");
    private final By heightField = By.id("com.fghilmany.dietmealapp:id/et_height");
    private final By femaleGenderButton = By.id("com.fghilmany.dietmealapp:id/rb_female");
    private final By maleGenderButton = By.id("com.fghilmany.dietmealapp:id/rb_male");
    private final By nextButton = By.id("com.fghilmany.dietmealapp:id/bt_next");
    private final By onPage2 = By.id("com.fghilmany.dietmealapp:id/title_activity");
    private final By invalidInput = By.id("com.fghilmany.dietmealapp:id/textinput_placeholder");
    private final By stillPage1 = By.id("com.fghilmany.dietmealapp:id/header_welcome");

    public void inputField(String name, String weight, String height) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameField)).sendKeys(name);
        wait.until(ExpectedConditions.visibilityOfElementLocated(weightField)).sendKeys(weight);
        wait.until(ExpectedConditions.visibilityOfElementLocated(heightField)).sendKeys(height);
    }

    public void chooseFemaleGender() {
        wait.until(ExpectedConditions.elementToBeClickable(femaleGenderButton)).click();
    }

    public void chooseMaleGender(){
        wait.until(ExpectedConditions.elementToBeClickable(maleGenderButton)).click();
    }

    public void clickNext() {
        wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
    }

    public boolean isOnPage2(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(onPage2)).isDisplayed();
    }

    public boolean isInputInvalid(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(invalidInput)).isDisplayed();
    }

    public boolean isGenderEmpty(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(stillPage1)).isDisplayed();
    }

}
