package stepdefinitions;

import drivers.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegisterPage1;
import pages.RegisterPage2;

import java.net.MalformedURLException;

public class RegisterSteps {
    private final RegisterPage1 registerPage1;
    private final RegisterPage2 registerPage2;


    public RegisterSteps() throws MalformedURLException{
        AppiumDriver driver = DriverManager.getAppiumDriver();
        this.registerPage1 = new RegisterPage1(driver);
        this.registerPage2 = new RegisterPage2(driver);
    }


    @Given("user is on the registration page")
    public void userIsOnTheRegistrationPage() {
        System.out.println("User berada di halaman register.");
    }

    @When("user input {string}, {string}, and {string}")
    public void userInputAnd(String name, String weight, String height) {
        registerPage1.inputField(name, weight, height);
    }

    @And("user choose {string}")
    public void userChoose(String gender) {
        if (gender.equals("male")) {
            registerPage1.chooseMaleGender();
        } else if (gender.equals("female")) {
            registerPage1.chooseFemaleGender();
        } else {
            System.out.println("User did not select any gender.");
        }
    }

    @And("user click next")
    public void userClickNext() {
        registerPage1.clickNext();
    }

    @Then("user get {string} to next page")
    public void userGetToNextPage(String status) {
        switch (status) {
            case "passed":
                Assert.assertTrue("Registrasi gagal", registerPage1.isOnPage2());
                break;
            case "invalid input":
                Assert.assertTrue("Input harus valid", registerPage1.isInputInvalid());
                break;
            case "empty gender":
                Assert.assertTrue("Gender harus diisi", registerPage1.isGenderEmpty());
                break;
            default:
                Assert.fail("Status tidak dikenali: " + status);
        }
    }

    @And("user click selesai")
    public void userClickSelesai() {
        registerPage2.clickSelesai();
    }

    @When("user choose one {string}")
    public void userChooseOne(String activity){
        switch (activity){
            case "1":
                registerPage2.chooseActivity1();
                break;
            case "2":
                registerPage2.chooseActivity2();
                break;
            case "3":
                registerPage2.chooseActivity3();
                break;
            case "4":
                registerPage2.chooseActivity4();
                break;
            case "5":
                registerPage2.chooseActivity5();
                break;
            case "6":
                registerPage2.chooseActivity6();
                break;
            case "7":
                registerPage2.chooseActivity7();
                break;
            default:
                System.out.println("user tidak memilih activity");
                break;
        }
    }

    @Then("user get {string} registers")
    public void userGetRegisters(String status) {
        if (status.equals("passed")){
            Assert.assertTrue("registrasi gagal", registerPage2.isRegisterSuccessful());
        } else {
            Assert.assertTrue("registrasi gagal", registerPage2.isStillOnPage2());
        }
    }
}
