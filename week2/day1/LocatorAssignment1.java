package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAssignment1 {
	
	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//calling method to enter URL in browser
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
		
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//driver.findElement(By.id("decorativeSubmit")).click();
		//driver.findElement(By.className("submit")).click();
		
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test1");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prabal");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Pra");
		
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("For Test automation");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("prabal.nkgupta@gmail.com");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println("Result Page Title: " + driver.getTitle());
		
		Thread.sleep(4000);
		
		driver.close();
		
		//driver.close();
		
	}

}
