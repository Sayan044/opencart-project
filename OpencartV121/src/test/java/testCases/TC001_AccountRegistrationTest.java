package testCases;

import java.security.SecureRandom;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String NUMERIC = "0123456789";
    private static final SecureRandom random = new SecureRandom();

    @Test
    public void verify_account_registration() {
        HomePage hp = new HomePage(driver);
        hp.clickMyAccount();
        hp.clickRegister();

        AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
        regpage.setFirstName(randomString(5).toUpperCase());
        regpage.setLastName(randomString(5).toUpperCase());
        regpage.setEmail(randomString(5) + "@gmail.com");
        regpage.setTelephone(randomNumber(10));

        String password = randomAlphaNumeric(3, 3);
        regpage.setPassword(password);
        regpage.setConfirmPassword(password);

        regpage.setPrivacyPolicy();
        regpage.clickContinue();

        String confM = regpage.getConfirmationMsg();
        Assert.assertEquals(confM, "Your Account Has Been Created!");
    }

    public String randomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
        }
        return sb.toString();
    }

    public String randomNumber(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(NUMERIC.charAt(random.nextInt(NUMERIC.length())));
        }
        return sb.toString();
    }

    public String randomAlphaNumeric(int alphaLength, int numLength) {
        return randomString(alphaLength) + "@" + randomNumber(numLength);
    }
}
