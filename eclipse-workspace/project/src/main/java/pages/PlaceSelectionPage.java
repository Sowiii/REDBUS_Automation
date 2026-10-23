package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PlaceSelectionPage {

    WebDriver driver;

    public PlaceSelectionPage(WebDriver driver) {
        this.driver = driver;
    }

    By from = By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/div[1]/div[2]/div[1]/div");
    By fromInput = By.xpath("//input[@id='srcinput']");
    By toInput = By.xpath("//input[@id='destinput']");

    public void selectFromPlace(String fromPlace) throws InterruptedException {
        driver.findElement(from).click();

        driver.findElement(fromInput).sendKeys(fromPlace);
        Thread.sleep(3000);
        driver.findElement(fromInput).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(fromInput).sendKeys(Keys.ENTER);
    }

    public void selectToPlace(String toPlace) throws InterruptedException {
        driver.findElement(toInput).sendKeys(toPlace);
        Thread.sleep(3000);
        driver.findElement(toInput).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(toInput).sendKeys(Keys.ENTER);
    }
} 