package WindowHandle;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowWthArrayList {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ak\\eclipse-workspace\\JavaPractice\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		String par=driver.getWindowHandle();
		System.out.println(par);
	Thread.sleep(3000);
		driver.findElement(By.linkText("BUSES")).click();
		driver.findElement(By.linkText("FLIGHTS")).click();
		driver.findElement(By.linkText("HOTELS")).click();
		Thread.sleep(3000);
		ArrayList<String> all= new ArrayList<String>(driver.getWindowHandles());
		System.out.println(all);
		Thread.sleep(3000);
		driver.switchTo().window(all.get(3));
		driver.findElement(By.xpath("//input[@id='departFrom']")).sendKeys("Berhampur");
		Thread.sleep(3000);
		driver.close();

		driver.switchTo().window(all.get(2));
		driver.findElement(By.xpath("//input[@id='stationFrom']")).sendKeys("Mumbai");
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(all.get(1));
		driver.findElement(By.xpath("//input[@id='filterText']")).sendKeys("Delhi");
		Thread.sleep(3000);
		driver.close();
		
		String child=driver.switchTo().window(par).getTitle();
		
	    String expected="irctc next Generation eTicketing System";
		String actual=driver.getTitle();
		if(expected.equalsIgnoreCase(actual)){
			System.out.println("Title is matching"+expected+"   "+actual);
				}
		else {
			System.out.println("Title is not matching"+expected+"   "+actual);}
		Thread.sleep(3000);
		
	System.out.println(child);
	driver.close();
	}

}
	


