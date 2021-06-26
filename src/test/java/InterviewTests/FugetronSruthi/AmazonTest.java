package InterviewTests.FugetronSruthi;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AmazonTest 
{
    /**
     * Rigorous Test :-)
     * @throws InterruptedException 
     */
    @Test
    public void TestAmazon() throws InterruptedException
    {
    	//Instantiating driver object
    			System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi nair\\chromedriver.exe");
    			WebDriver driver = new ChromeDriver();
    			
    			//Launch website
    			driver.get("https://www.amazon.in/");
    			driver.manage().window().maximize();
    			System.out.println(driver.getTitle());
    					
    			//click All
    			WebElement All_btn = driver.findElement(By.id("nav-hamburger-menu"));
    			All_btn.click();
    			Thread.sleep(5000);
    			
    			//click amz prime music
    			WebElement amz_music = driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[12]/a"));
    			amz_music.click();
    			Thread.sleep(5000);
    			
    			//click amz prime music in main menu
    			WebElement amz_prime_music = driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[7]/li[3]/a"));
    			amz_prime_music.click();
    			Thread.sleep(5000);
    			
    			//Get title of the amz prime music page
    			String Title = driver.getTitle();
    			Thread.sleep(5000);
    			
    			//Verifying if the selected main menu is displayed
    			Assert.assertEquals("Stream Music on Amazon Prime Music",Title);
    			System.out.println(Title);
    			Reporter.log("Validating Landing on Amazon music by getting the title of current page");
    			Reporter.log(Title);
    			driver.close();
    }
}
