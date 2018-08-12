package jenkinTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testGit {

	//public static void main(String [] args){
	
	public WebDriver driver;
	@BeforeSuite
	public void before1(){
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executable\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		
	}
	
	
	@Test
	public void  testOne1() throws InterruptedException{
		
		driver.findElement(By.className("gb_P")).click();
		
		Thread.sleep(3000);
	}
	
	
	
	@AfterSuite
	public void after(){
		
		driver.quit();
		
		
	}
	
	
	//}


	
}
