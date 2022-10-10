import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChrome {

	public static void main(String[] args) {
		//
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ak\\eclipse-workspace\\JavaPractice\\Driver\\chromedriver.exe");
		//Chrome driver is a predifined class in selenium webdriver library
		//created an object for chromedriver().
		//WebDriver is an interface in selenium
		//ChromeDriver  is child class of WebDriver interface
	
		WebDriver driver = new ChromeDriver();
		//
		driver.manage().window().maximize();
	
		//
		driver.get("https://www.amazon.com/");
		//
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("carrot fit pants for men");
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    driver.close();

	}

}