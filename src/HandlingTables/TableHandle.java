package HandlingTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandle {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ak\\eclipse-workspace\\JavaPractice\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
			Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
	Thread.sleep(3000);
	WebElement table=driver.findElement(By.id("//table[@class='table hover']"));
	List<WebElement> row=table.findElements(By.tagName("tr"));
	for (WebElement each : row) {
		List<WebElement>col=each.findElements(By.tagName("td"));
		for (WebElement eachcell : col) {
			String tabledata=eachcell.getText();
		System.out.println("\n"+tabledata);	
		Thread.sleep(3000);
	}
		System.out.println("");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	driver.quit();
		
}
}