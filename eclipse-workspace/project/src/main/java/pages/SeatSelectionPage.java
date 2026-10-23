package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeatSelectionPage {

    WebDriver driver;

    public SeatSelectionPage(WebDriver driver) {
        this.driver = driver;
    }

    By seat = By.id("L7");
    By boardingDroppingButton = By.xpath(
        "//button[normalize-space()='Select boarding & dropping points']"
    );
    By boardingPoint = By.xpath(
        "//div[contains(@class,'bpdpContainer__ind-seat-styles-module-scss-oS00i')]//div[1]//ul[1]//li[1]//div[1]//div[3]//div[1]//label[1]"
    );
    By droppingPoint = By.xpath(
        "//div[@aria-label='06:25, 14 Nov Pattikkad Junction Bus Stop, Junction Bus Stop, Pattikad, Dropping points, 1 of 5']//div//div//label[@for='bp-point-0']"
    );

    public void selectSeat() throws InterruptedException {
    	Thread.sleep(3000);
        driver.findElement(seat).click();
    }

    public void openBoardingAndDroppingPoints() throws InterruptedException {
    	Thread.sleep(3000);
        driver.findElement(boardingDroppingButton).click();
    }

    public void selectBoardingPoint() throws InterruptedException {
    	Thread.sleep(3000);
        driver.findElement(boardingPoint).click();
    }

    public void selectDroppingPoint() throws InterruptedException {
    	Thread.sleep(3000);
        driver.findElement(droppingPoint).click();
    }
}