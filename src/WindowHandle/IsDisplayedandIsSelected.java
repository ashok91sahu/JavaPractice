package WindowHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedandIsSelected {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ak\\eclipse-workspace\\JavaPractice\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(3000);
		List<WebElement> check= driver.findElements(By.tagName("input"));
System.out.println("Total no of check boxes::"+ check.size());
Thread.sleep(3000);
for (WebElement each : check) {
	Boolean boo= each.isSelected();
	String chkbox=each.getAttribute("value");
	System.out.println("checkboxname"+"\n"+boo);
	Thread.sleep(3000);
	if (boo==true) {
		each.click();
	Thread.sleep(3000);}
		else
		{
			each.click();
			Thread.sleep(3000);
		}
			driver.close();
			Thread.sleep(3000);
		
	}
	
}

}
