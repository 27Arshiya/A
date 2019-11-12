package org.tcs.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ultimat {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdul\\eclipse-workspace\\Selen\\driverss\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
	WebElement txtUser=driver.findElement(By.id("email"));
	txtUser.sendKeys("arshiyamuzannil@gmail.com");
	
}
}