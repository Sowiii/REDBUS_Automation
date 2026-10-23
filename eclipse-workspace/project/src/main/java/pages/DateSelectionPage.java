package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DateSelectionPage {
	WebDriver driver;
    public DateSelectionPage(WebDriver driver) {
        this.driver = driver;
    }

    By journeyDate = By.xpath("//div[@aria-label='Select date of journey']");
    By nextMonth = By.xpath("//i[@aria-label='Next month, November 2026']");
    By date13 = By.xpath("//span[normalize-space()='13']");
    By searchButton = By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/button");

    public void selectDateAndSearch() throws InterruptedException {
        driver.findElement(journeyDate).click();
        driver.findElement(nextMonth).click();
        driver.findElement(date13).click();
        driver.findElement(searchButton).click();
        Thread.sleep(6000);
    }
}