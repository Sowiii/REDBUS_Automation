package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static WebDriver driver;
	public void setup() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/?gad_source=1&gad_campaignid=22479772058&gclid=CjwKCAjwrbfWBhAeEiwAc2e6PswPSF0g71Rzugv7wdLQhnwyEMyHghtehGckbE6fjUvgiZbxv6y1PBoCaSoQAvD_BwE");
	}
	public void tearDown() {
		driver.quit();
	}
}