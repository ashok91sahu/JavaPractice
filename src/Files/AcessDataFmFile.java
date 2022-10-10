package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcessDataFmFile {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ak\\eclipse-workspace\\JavaPractice\\Driver\\chromedriver.exe");
		FileReader fr=new FileReader("D:\\tnt.txt\\");
		BufferedReader br= new BufferedReader(fr);
		String str = "";
		
		Thread.sleep(3000);
		while ((str=br.readLine())!=null) {
			Date date= new Date();
			DateFormat dr=new SimpleDateFormat("dd_mm_yyyy hh_mm_ss");
			String datef=dr.format(date);
			String login[]=str.split(";");
			WebDriver driver= new ChromeDriver();
			driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/validateCredentials");
			driver.findElement(By.cssSelector("#txtUsername")).sendKeys(login[0]);
			driver.findElement(By.cssSelector("#txtPassword")).sendKeys(login[1]);
			driver.findElement(By.cssSelector("#btnLogin")).click();
			Thread.sleep(3000);
			String expected="dashboard";
			String actual=driver.getCurrentUrl();
			if(actual.contains(expected)) {
				System.out.println("Login Success::"+ expected+"   "+actual);}

			else 
			{
				/*File Screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				try {
				FileHandler.copy(Screen, new File("D:\\Sel\\"+ datef +"loginpage.png\\screenshot.png"));
				}
				catch(Throwable e) {
					System.out.println(e.getMessage());
				}
				String error=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
				System.out.println("Login Failed::" +error+"   "+expected+"   "+actual);
			}*/	
			driver.close();
		}
		}}}




