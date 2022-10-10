package HandlingTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHanding2 {

	public static void main(String[] args) throws Throwable {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ak\\eclipse-workspace\\JavaPractice\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.indiainfoline.com/markets/share-stock-market-live");
		driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[normalize-space()='x']")).click();
			Thread.sleep(3000);
			WebElement table=driver.findElement(By.xpath("//table[@id='adrs']"));
			Thread.sleep(3000);
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			for (WebElement eachrow : rows) {
				String rowdata=eachrow.getText();
				System.out.println("Total no of rows::"+ rowdata );
				List<WebElement> cols=eachrow.findElements(By.tagName("td"));
				for (WebElement eachcols: cols) {
					String coldata=eachcols.getText();
					System.out.println("Total no of rows::"+ coldata);
					Thread.sleep(3000);
				}
			}
	
					driver.close();
					
				}
}
	
