import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirefox {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Ak\\eclipse-workspace\\JavaPractice\\Driver\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.manage().window().fullscreen();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("carrot fit pants for men");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.close();
	
}
}