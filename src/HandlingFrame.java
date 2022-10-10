

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrame {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ak\\eclipse-workspace\\JavaPractice\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");

List<WebElement> frames= driver.findElements(By.tagName("iframe"));
System.out.println(frames.size());
driver.switchTo().frame(0);
Actions ac= new Actions(driver);
ac.sendKeys(Keys.PAGE_DOWN).build().perform();
Thread.sleep(3000);
ac.sendKeys(Keys.PAGE_UP).build().perform();
Thread.sleep(3000);
//ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Interaction']"))).click().perform();
//ac.moveToElement(driver.findElement(By.xpath("//div[@data-option-value='.performance-testing']"))).click().perform();
Thread.sleep(3000);
driver.switchTo().defaultContent();

driver.findElement(By.xpath("//a[@class='no_border'][normalize-space()='Free Ebooks']")).click();
driver.findElement(By.xpath("//span[normalize-space()='Free Machine Learning Ebooks']")).click();
System.out.println(driver.getTitle());


Thread.sleep(3000);
driver.close();

	}

}
