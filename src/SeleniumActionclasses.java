import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActionclasses {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ak\\eclipse-workspace\\JavaPractice\\Driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
Actions a=new Actions(driver);
WebElement blogmenu = driver.findElement(By.id("blogsmenu"));
WebElement selenium143option = driver.findElement(By.xpath("//a/span[text()='Selenium143']"));
	a.moveToElement(blogmenu).perform();
a.moveToElement(selenium143option).perform();
a.click(selenium143option).perform();
	}

}
