package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup(); 
			 ChromeDriver driver=new ChromeDriver(); 
			 driver.get("http://leaftaps.com/opentaps/control/main");
			 driver.manage().window().maximize();
		     String title = driver.getTitle();
		     System.out.println(title);
		     driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		     driver.findElement(By.id("password")).sendKeys("crmsfa");
		     driver.findElement(By.className("decorativeSubmit")).click();
		     driver.findElement(By.linkText("CRM/SFA")).click();
		     driver.findElement(By.linkText("Leads")).click();
		     driver.findElement(By.linkText("Create Lead")).click();
		     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Macron_kacron");
		     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sachin");
		     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thiyagarajan");
		     driver.findElement(By.name("submitButton")).click();
		     WebElement eleDropDown = driver.findElement(By.id("CreateLeadform_dataSource"));
		     Select select = new Select(eleDropDown);
		     select.selectByVisibleText("Employee");
		     select.selectByValue("3");
		     String text = driver.findElement(By.id("CreateLeadform_dataSource")).getText();
		     System.out.println(text);
		     
		     String title1 = driver.getTitle();
		     System.out.println(title1);
		     
				
	}
	}


