package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {

    WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    By acFilter = By.xpath("//div[contains(text(),'AC (102)')]");
    By sleeperFilter = By.xpath("//div[contains(text(),'SLEEPER (94)')]");
    By viewSeatsButton = By.xpath("//button[@aria-label='View seats for Royal Rich India R No.210']");

    public void selectAcFilter() throws InterruptedException {
    	Thread.sleep(2000);
        driver.findElement(acFilter).click();
    }

    public void selectSleeperFilter() throws InterruptedException {
    	Thread.sleep(2000);
        driver.findElement(sleeperFilter).click();
    }

    public void openSeatsForBus() throws InterruptedException {
    	Thread.sleep(3000);
        driver.findElement(viewSeatsButton).click();
    }
}