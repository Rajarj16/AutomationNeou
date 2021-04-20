package neou;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NeouSearch {

	private WebDriver driver;
	private static String baseUrl;
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		    // Need to seperate cases to run

		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\Desktop\\chromedriver\\chromedriver.exe");
		    driver = new ChromeDriver();
		    baseUrl = "https://devleaderboard.neoufitness.com";
		    Thread.sleep(5000);
		    driver.manage().window().maximize();
		    
		    
	}
		    
	@Test(description = "Validate search functionality and Add to list")    
			public void testSearch() throws InterruptedException {   
			driver.get(baseUrl);
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.id("custom-css-standard-input")).sendKeys("neourj@gmail.com");
		    driver.findElement(By.id("custom-css-standard-input")).sendKeys(Keys.ENTER);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.findElement(By.name("password")).sendKeys("Neou@123");
		    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		    Thread.sleep(10000);
		    //searchHomebutton
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/a[5]/div[1]/div[1]")).click();
		    Thread.sleep(6000);
		    driver.findElement(By.xpath("//input[@id='combobox']")).sendKeys("Wake Up Your Body!");
		    Thread.sleep(6000);
		    driver.findElement(By.xpath("//span[contains(text(),'SHOW RESULTS')]")).click();
		    Thread.sleep(6000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/button[1]/div[1]/img[1]")).click();
		    Thread.sleep(6000);
		    driver.findElement(By.xpath("//div[contains(text(),'Add to list')]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//span[contains(text(),'Start Workout')]")).click();
		    Thread.sleep(10000);
		    driver.navigate().back();
		    Thread.sleep(4000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]")).click();
		    Thread.sleep(10000);
		    ////body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]
		    if (driver.getPageSource().contains("Wake Up Your Body!")) {
		        System.out.print("Class added to the list");
		      } else {

		        System.out.print("Class is not on the list");
		      }
		    Thread.sleep(3000);
		    
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException  {
	driver.findElement(By.linkText("HOME")).click();
	Thread.sleep(5000);
	driver.close();
	}
}