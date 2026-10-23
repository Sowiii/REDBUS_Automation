package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PassengerDetailsPage {

    WebDriver driver;

    public PassengerDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    By phone = By.id("0_6");
    By email = By.id("0_5");
    By name = By.id("0_4");
    By age = By.id("0_1");
    By gender = By.xpath("//div[contains(@aria-labelledby,':rm:')]");
    By rejectInsurance = By.xpath("//div[contains(@aria-label,'Don’t add Travel Insurance')]//label[contains(@for,'insuranceRejectBtn')]");
    By continueBooking = By.xpath("//button[contains(@aria-label,'Continue booking')]");

    public void enterPassengerDetails(
            String phoneNumber,
            String emailAddress,
            String passengerName,
            String passengerAge) throws InterruptedException {
    	

        driver.findElement(phone).sendKeys(phoneNumber);
        driver.findElement(email).sendKeys(emailAddress);
        Thread.sleep(2000);
        driver.findElement(name).sendKeys(passengerName);
        driver.findElement(age).sendKeys(passengerAge);
        driver.findElement(gender).click();
        Thread.sleep(2000);
    }
     public void rejectInsuranceAndContinue() throws InterruptedException {
		driver.findElement(rejectInsurance).click();
		driver.findElement(continueBooking).click();
		Thread.sleep(2000);
    }
}