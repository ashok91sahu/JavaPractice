package WindowHandle;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWins {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ak\\eclipse-workspace\\JavaPractice\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		String par=driver.getWindowHandle();
		Thread.sleep(3000);
		System.out.println(par);
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);
		
		for (String each : all)
		{
			if(!par.equals(each)) 
				{
					String child=driver.switchTo().window(each).getTitle();
					System.out.println(child);
					Thread.sleep(3000);
					driver.close();
				}}
			driver.switchTo().window(par);
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mituandtitu@gmail.com");
			Thread.sleep(3000);
			driver.close();
		}
		
		}

	

