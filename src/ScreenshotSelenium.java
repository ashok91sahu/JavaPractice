import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenshotSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ak\\\\eclipse-workspace\\\\JavaPractice\\\\Driver\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://omayo.blogspot.com/");
	driver.manage().window().maximize();
	Actions a=new Actions(driver);
WebElement usernm = driver.findElement(By.xpath("//input[@type='text']"));
usernm.sendKeys("amit");
a.sendKeys(Keys.TAB).perform();
WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
pass.sendKeys("12345");
a.sendKeys(Keys.TAB).sendKeys(Keys.ENTER);
Thread.sleep(5000);
driver.quit();



}

}

