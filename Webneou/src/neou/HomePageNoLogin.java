package neou;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePageNoLogin {

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
    driver.findElement(By.linkText("Update Your Goal")).click();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//span[contains(text(),'₹49.99 / MONTHLY')]")).click();
//Enter your billing details below:
    driver.findElement(By.name("name")).sendKeys("Test");
    driver.findElement(By.name("email")).sendKeys("raja@vuedata.in");
    Thread.sleep(3000);
//    driver.findElement(By.name("cardNumber")).sendKeys("4242424242424242");
//    Thread.sleep(2000);
//    driver.findElement(By.name("exp-date")).click();
//    driver.findElement(By.name("exp-date")).sendKeys("1224");
//    driver.findElement(By.name("cvc")).click();
//    driver.findElement(By.name("exp-date")).sendKeys("123");
//    Thread.sleep(3000);
//Stripe third party payment components are not detecting in code because 
//all three items are in same xpath(card number, cvv, date)  
    driver.findElement(By.id("icon/close")).click();
    driver.findElement(By.linkText("BROWSE")).click();
    Thread.sleep(10000);
    //Program
    driver.findElement(By.xpath("//span[contains(text(),'Programs')]")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/a[1]")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]/div[1]/img[1]")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//span[contains(text(),'Start Workout')]")).click();
    Thread.sleep(15000);
    driver.navigate().back();
    driver.navigate().back();
    //driver.navigate().back();
    driver.findElement(By.xpath("//span[contains(text(),'Challenges')]")).click();
    Thread.sleep(6000);
    driver.findElement(By.xpath("//span[contains(text(),'Collections')]")).click();
    Thread.sleep(6000);
    driver.findElement(By.xpath("//span[contains(text(),'Instructors')]")).click();
    Thread.sleep(6000);
    driver.findElement(By.xpath("//span[contains(text(),'Concepts')]")).click();
    driver.findElement(By.linkText("HOME")).click();
    Thread.sleep(6000);
    
    if (driver.getPageSource().contains("Raja")) {
        System.out.print("Payment page navigation and player cases are passed");
      } else {

        System.out.print("Payment page navigation and player cases are Failed");
        
      }
    
    driver.close();
    
  }
  

 
}