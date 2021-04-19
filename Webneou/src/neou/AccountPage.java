package neou;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountPage {

	private WebDriver driver;
	private static String baseUrl;
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		    // Neeed to seperate cases to run

		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\Desktop\\chromedriver\\chromedriver.exe");
		    driver = new ChromeDriver();
		    baseUrl = "https://devleaderboard.neoufitness.com";
		    Thread.sleep(5000);
		    driver.manage().window().maximize();
//		    driver.get("chrome://settings/clearBrowserData");
//		    Thread.sleep(3000);
//		    driver.findElement(By.linkText("Clear data")).click();
		    driver.manage().window().maximize();
		    
		    
	}
		    
	@Test(description = "Validate User can log in with valid credentials and read the User Name from Home page")    
			public void testAccount() throws InterruptedException {   
			driver.get(baseUrl);
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.id("custom-css-standard-input")).sendKeys("neourj@gmail.com");
		    driver.findElement(By.id("custom-css-standard-input")).sendKeys(Keys.ENTER);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.findElement(By.name("password")).sendKeys("Neou@123");
		    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		    Thread.sleep(10000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]")).click();
		    Thread.sleep(10000);
		    driver.findElement(By.xpath("//span[contains(text(),'Fitness Profile')]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.name("zipCode")).sendKeys("10001");
		    driver.findElement(By.xpath("//span[contains(text(),'Settings')]")).click();
		    Thread.sleep(2000);
		    
		   //Account and password change then re-login, navigate to Account and change ph no.
		   //ToDo made this as seperate Test cases 
		    driver.findElement(By.name("old_password")).sendKeys("Neou@123");
		    driver.findElement(By.name("new_password")).sendKeys("Neou@123");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//span[contains(text(),'Save New Password')]")).click();
		    Thread.sleep(6000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[3]/a[1]/div[1]/div[1]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.id("custom-css-standard-input")).sendKeys("neourj@gmail.com");
		    driver.findElement(By.id("custom-css-standard-input")).sendKeys(Keys.ENTER);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.findElement(By.name("password")).sendKeys("Neou@123");
		    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		    Thread.sleep(10000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]")).click();
		    Thread.sleep(10000);
		    driver.findElement(By.xpath("//span[contains(text(),'Fitness Profile')]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.name("zipCode")).sendKeys("10001");
		    driver.findElement(By.xpath("//span[contains(text(),'Settings')]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.name("mobile")).sendKeys("1234567890");
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/button[4]/span[1]")).click();
		    Thread.sleep(3000);
		    if (driver.getPageSource().contains("Test")) {
		        System.out.print("Account logged in");
		      } else {

		        System.out.print("Account logged in but Text not able to find");
		      }
		      
	}
		    
	@Test(description = "Validate User can log in with valid credentials and read the User Name from Home page")    
	public void testFitness() throws InterruptedException {
		    driver.get(baseUrl);
		    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.id("custom-css-standard-input")).sendKeys("neourj@gmail.com");
		    driver.findElement(By.id("custom-css-standard-input")).sendKeys(Keys.ENTER);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.findElement(By.name("password")).sendKeys("Neou@123");
		    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		    Thread.sleep(10000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]")).click();
		    Thread.sleep(10000);
		    driver.findElement(By.xpath("//span[contains(text(),'Fitness Profile')]")).click();
		    Thread.sleep(2000);
  }
	
	@AfterMethod
	public void tearDown() throws InterruptedException  {
	driver.findElement(By.linkText("HOME")).click();
	Thread.sleep(5000);
	driver.close();
	 
}
}