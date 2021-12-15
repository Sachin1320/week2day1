package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {
		                     WebDriverManager.chromedriver().setup(); 
							 ChromeDriver driver=new ChromeDriver(); 
							 driver.get("https://www.youtube.com/watch?v=lEc7m_8TrJUs");
							 driver.manage().window().maximize();
						     String title = driver.getTitle();
						     System.out.println(title);
						     
						     
	}

}
