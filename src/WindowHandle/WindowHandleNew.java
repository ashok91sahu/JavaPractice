package WindowHandle;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleNew {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ak\\eclipse-workspace\\JavaPractice\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		String par=driver.getWindowHandle();
		System.out.println(par);
		driver.findElement(By.xpath("//a[@aria-label='Menu BUSES. Website will be opened in new tab']")).click();
		driver.findElement(By.xpath("//a[@aria-label='Menu Flight. Website will be opened in new tab']")).click();
		driver.findElement(By.xpath("//a[@aria-label='Menu Hotels. Website will be opened in new tab']")).click();
		ArrayList<String> multi= new ArrayList<String>(driver.getWindowHandles());
		System.out.println(multi);
	driver.switchTo().window(multi.get(1));
	driver.findElement(By.xpath("//input[@id='filterText']")).sendKeys("tajhotel");
	Thread.sleep(3000);
	driver.close();
	driver.switchTo().window(multi.get(2));
	driver.findElement(By.xpath("//input[@id='stationFrom']")).sendKeys("mumbai");
	Thread.sleep(3000);
	driver.close();
	driver.switchTo().window(multi.get(3));
	driver.findElement(By.xpath("//input[@id='departFrom']")).sendKeys("hyderabad");
	Thread.sleep(3000);
	driver.close();
	driver.switchTo().window(par);
	driver.findElement(By.xpath("//span[@aria-label='Click here for Agents Login']")).click();
	Thread.sleep(3000);
	driver.quit();
	
	
	
	
	
	
	
	
	
	}

}
