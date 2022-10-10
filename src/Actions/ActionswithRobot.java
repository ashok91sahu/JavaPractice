package Actions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionswithRobot {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ak\\eclipse-workspace\\JavaPractice\\Driver\\chromedriver.exe");
		ChromeDriver driver  =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://accounts.google.com/");
		Actions ac= new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("Help"))).contextClick().perform();
		Thread.sleep(5000);
		Robot r=new Robot();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		ArrayList<String> win= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(win.get(1));
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Community")).click();
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(win.get(0));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("mituandtitu");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
