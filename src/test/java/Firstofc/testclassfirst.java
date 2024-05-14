package Firstofc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testclassfirst 
{

	public static void main(String[] args) throws InterruptedException 
	{
System.out.println("Hi");
WebDriver driver;
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://prepespro.christuniversity.in/Application/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("neethuiolite@gmail.com");
driver.findElement(By.xpath("//input[@id=':r1:']")).sendKeys("Admin*123");
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='programmelevel']")).sendKeys("archi");
Thread.sleep(5000);
driver.findElement(By.xpath("//div[@class='ag-cell ag-cell-not-inline-editing ag-cell-normal-height ag-cell-first-right-pinned ag-cell-focus ag-cell-value']//button[@type='button'][normalize-space()='Apply Now']")).click();
Thread.sleep(5000);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.close();
	}

}
