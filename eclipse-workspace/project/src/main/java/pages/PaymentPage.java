package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {

    WebDriver driver;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    By payviaUPI = By.xpath("//label[@class='customRadio___526a82 customRadio___526a82']");
    
    	public void verifyPaymentDetailsPage() {
    	    if (driver.getCurrentUrl().contains("paymentDetails")) {
    	        System.out.println("Payment page is displayed successfully");
    	    } else {
    	        System.out.println("Payment page is not displayed");
    	    }
    	}
    	public void selectPayViaUPI() throws InterruptedException {
		driver.findElement(payviaUPI).click();
		Thread.sleep(1000);
    }
  }