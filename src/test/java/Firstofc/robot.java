package Firstofc;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class robot {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://prepespro.christuniversity.in/Application/");
		driver.manage().window().maximize();
		WebElement unTB = driver.findElement(By.xpath("//input[@id='email']"));
		unTB.sendKeys("neethuiolite@gmail.com");
		Robot r = new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DELETE);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_DELETE);
		Thread.sleep(3000);
		driver.close();

	
	}

}
