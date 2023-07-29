package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W2D2Assignment2EditLead {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test1");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prabal");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Pra2");
		
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation part2");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("For Test automation part2");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("prabal.nkgupta@gmail.com");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("checking for automation testing");
		
		driver.findElement(By.className("smallSubmit")).click();
		
        System.out.println("Result Page Title: " + driver.getTitle());
		
		Thread.sleep(4000);
		
		driver.close();
	}

}
