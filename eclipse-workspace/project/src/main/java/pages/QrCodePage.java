package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class QrCodePage {

    WebDriver driver;
    WebDriverWait wait;

    public QrCodePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    By qrCode = By.xpath("//img[@alt='UPI QR scanner']");

    public void verifyQrCodeAndTakeScreenshot()
            throws IOException, InterruptedException {

        wait.until(ExpectedConditions.visibilityOfElementLocated(qrCode));
        System.out.println("QR code page is displayed successfully");

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        File destination = new File("C:\\Users\\sowin\\Pictures\\Screenshots\\ss.png");
        FileHandler.copy(source, destination);
    }
}