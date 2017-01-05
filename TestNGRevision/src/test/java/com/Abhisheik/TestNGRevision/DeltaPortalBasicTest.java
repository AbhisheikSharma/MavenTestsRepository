package com.Abhisheik.TestNGRevision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeltaPortalBasicTest {
	WebDriver driver;
	String url = "https://www.delta.com/";
	
	@BeforeTest
	public void initializeDriver() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void tflightBooking() {
		driver.findElement(By.id("originCity")).click();
		driver.findElement(By.id("originCity")).sendKeys("Atl");
		driver.findElement(By.xpath("//a[text()='Atlanta, GA, US (ATL)']")).click();
		driver.findElement(By.id("destinationCity")).click();
		driver.findElement(By.id("destinationCity")).sendKeys("San");
		driver.findElement(By.xpath("//a[text()='San Antonio, TX, US (SAT)']")).click();
		driver.findElement(By.id("departureDate")).click();
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//tbody//td//a")).click();
		driver.findElement(By.id("returnDate")).click();
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//tbody//td//a")).click();
		driver.findElement(By.id("findFlightsSubmit")).click();
	}
	
	@Test
	public void mouseHoverAction() throws InterruptedException {
		WebElement travelwithusLink = driver.findElement(By.xpath("//a[text()='Traveling With Us']"));
		Actions act = new Actions(driver);
		act.moveToElement(travelwithusLink).perform();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/content/www/en_US/traveling-with-us/where-we-fly.html']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='brand']/a")).click();
		
	}
	@AfterTest
	public void destroy() {
		driver.quit();
	}

}
