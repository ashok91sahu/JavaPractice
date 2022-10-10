import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;//ashok.m.sahu

public class ValidateLoginTest {

	public static void main(String[] args) throws Throwable {
		//write a programme to validate orangehrm of qedge link and  url and print it.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ak\\eclipse-workspace\\JavaPractice\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		username.clear();
		username.sendKeys("Admin");
	System.out.println(username.getAttribute("value"));
	Thread.sleep(3000);
		WebElement pass = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		pass.clear();
		pass.sendKeys("Qedge123!@#");
		System.out.println(pass.getAttribute("value"));
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(3000);
		String expected="home";
		String actual=driver.getCurrentUrl();
		
		if(actual.contains(expected)) {
			System.out.println("log in success::"+ "Actual"+"  "+ "expected");
			
		}else
			{
			String error= driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
				System.out.println("log in failed::"+ error);
			}
			driver.close();
			
		}
	
		

	}

