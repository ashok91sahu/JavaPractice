package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageTxtPrintToFlie {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ak\\eclipse-workspace\\JavaPractice\\Driver\\chromedriver.exe");
		File f =new File("D:\\tnt.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		String str=driver.findElement(By.xpath("//tbody/tr[2]/td[1]/p[1]")).getText();
		String str1=driver.findElement(By.xpath("//body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/p[2]")).getText();
		
	bw.write(str);
	bw.newLine();
	bw.write(str1);
	bw.flush();
	bw.close();
	driver.close();
	
		
	}

}
