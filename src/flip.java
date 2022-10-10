import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ak\\eclipse-workspace\\JavaPractice\\Driver\\chromedriver.exe");	
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
Actions a= new Actions(driver);
driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8618858689");
a.sendKeys(Keys.TAB);
driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Ashok91sahu");
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("tshirts");
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
Thread.sleep(5000);
driver.quit();



}
}
