package neou;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegressionSuite {

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
		    
	@Test(description = "Validate Core flow function of Neou (Regression)")    
			public void regressionNeouConcept() throws InterruptedException {   
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
		    Thread.sleep(10000);
		    //concept
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]/div[1]/div[1]/img[2]")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]")).click(); //fav
		    Thread.sleep(2000);
		    //conceptfilter
		    driver.findElement(By.xpath("//p[contains(text(),'Filter')]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//div[contains(text(),'Impact')]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//span[contains(text(),'High')]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//div[contains(text(),'Genre')]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//span[contains(text(),'Dance')]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//span[contains(text(),'SHOW RESULTS')]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/button[1]/div[1]/img[1]")).click();
		    Thread.sleep(6000);
		    driver.findElement(By.xpath("//span[contains(text(),'Start Workout')]")).click();
		    Thread.sleep(15000);
		    driver.navigate().back();
		    Thread.sleep(7000);
		    if (driver.getPageSource().contains("VXN")) {
		        System.out.print("Concept Test cases are passed");
		      } else {

		        System.out.print("Concept Test cases are Failed");
		      }
		    Thread.sleep(3000);
		    
		    
	}
	
	@Test(description = "Validate Core flow function of Neou (Regression)")    
	public void regressionNeouProgram() throws InterruptedException, AWTException {   
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
    Thread.sleep(10000);
    driver.findElement(By.xpath("//span[contains(text(),'Programs')]")).click();
    Thread.sleep(6000);
    //Jumpstart U
    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/a[1]")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]/*[1]")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//span[contains(text(),'Start Program')]")).click();
    Thread.sleep(10000);
    //stopprogram
    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//span[contains(text(),'Ok')]")).click();
    Thread.sleep(10000);
    driver.findElement(By.xpath("//span[contains(text(),'Start Program')]")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//span[contains(text(),'Start First Class')]")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//span[contains(text(),'Start Workout')]")).click();
    Thread.sleep(15000);
    Robot r = new Robot();
    r.keyPress(KeyEvent.VK_ESCAPE);
    Thread.sleep(3000);
    
    }
	
	@AfterMethod
	public void neouSignout() throws InterruptedException  {
	driver.findElement(By.linkText("HOME")).click();
	Thread.sleep(5000);
	driver.close();
	}
}