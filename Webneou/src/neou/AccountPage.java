package neou;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountPage {

	
	 public static void main(String[] args) throws InterruptedException{
		    // TODO Auto-generated method stub

		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\Desktop\\chromedriver\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    //gotoneouweb
		    driver.get("https://devleaderboard.neoufitness.com");
		    driver.manage().window().maximize();
		    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]")).click();
		    driver.findElement(By.id("custom-css-standard-input")).sendKeys("raja@vuedata.in");
		    driver.findElement(By.id("custom-css-standard-input")).sendKeys(Keys.ENTER);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.findElement(By.name("password")).sendKeys("Neou@123");
		    driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
		    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		    driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
  }
	 
}
