package neou;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FavouriteFunc {

	private WebDriver driver;
	private static String baseUrl;
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\Desktop\\chromedriver\\chromedriver.exe");
		    driver = new ChromeDriver();
		    baseUrl = "https://devleaderboard.neoufitness.com";
		    Thread.sleep(5000);
		    driver.manage().window().maximize();
		    
		    
	}
		    
	@Test(description = "Validate instructor Favorite")    
			public void testFav() throws InterruptedException {   
			driver.get(baseUrl);
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.id("custom-css-standard-input")).sendKeys("neourj@gmail.com");
		    driver.findElement(By.id("custom-css-standard-input")).sendKeys(Keys.ENTER);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.findElement(By.name("password")).sendKeys("Neou@123");
		    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		    Thread.sleep(10000);
		    driver.findElement(By.linkText("BROWSE")).click();
		    Thread.sleep(6000);
		    driver.findElement(By.xpath("//span[contains(text(),'Instructors')]")).click();
		    Thread.sleep(7000);
		    //un-fav
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/div[2]/div[2]/div[1]/div[3]/button[1]")).click();
		    Thread.sleep(4000);
		    driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();
		    //fav
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
		    Thread.sleep(10000);
		    //nav to inst. class
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]")).click();
		    Thread.sleep(6000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]/div[1]/img[1]")).click();
		    Thread.sleep(6000);
		    driver.findElement(By.xpath("//span[contains(text(),'Start Workout')]")).click();
		    Thread.sleep(15000);
		    driver.navigate().back();
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]")).click();
		    Thread.sleep(10000);
		    //fav view all
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/a[1]")).click();
		    Thread.sleep(10000);
		    if (driver.getPageSource().contains("Adam Nelson")) {
		        System.out.print("Adam's in the Fav list");
		      } else {

		        System.out.print("Adam's not in the Fav list");
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