package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionswithFlipkart {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ak\\eclipse-workspace\\JavaPractice\\Driver\\chromedriver.exe");
		ChromeDriver driver  =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ESCAPE);
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[4]/a[1]/div[2]/div[1]/div[1]"))).perform();
		ac.sendKeys(Keys.PAGE_DOWN);
		ac.sendKeys(Keys.PAGE_UP);
		Thread.sleep(1000);
		ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='All']"))).click().perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Baby & Kids']"))).perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.xpath("//a[@title='Puzzles']"))).click().perform();
		Thread.sleep(5000);
		driver.close();

	}

}
