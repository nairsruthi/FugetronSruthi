package InterviewTests.FugetronSruthi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakemytripTest {
	
	@Test(enabled = false)
	public void TestMakemytrip() throws InterruptedException {
		
		//Instantiating driver object
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi nair\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launch website
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
	
		WebElement OneWay = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[1]/ul/li[1]"));
		OneWay.isSelected();
		Thread.sleep(5000);
		
		
		//Actions act = new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[1]/label")).click();
		Thread.sleep(5000);
		WebElement FromBox = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/input")) ;
		FromBox.click();
		Thread.sleep(5000);
		FromBox.sendKeys("Mumbai");
		Thread.sleep(5000);
		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
		//act.moveToElement(driver.findElement(By.id("react-autowhatever-1-section-0-item-0"))).click();
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]")).click();
		WebElement ToBox = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input"));
		ToBox.click();
		Thread.sleep(5000);
		ToBox.sendKeys("Delhi");
		Thread.sleep(5000);
		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
		//act.moveToElement(driver.findElement(By.id("react-autowhatever-1-section-0-item-0"))).click();
		Thread.sleep(5000);
		
		//Date Picker
		driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
		  Thread.sleep(5000);
		  
		 // String flag = "False";
		 // while(flag=="False") {
		  //driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'June 26 2021')]"));
			  WebElement Deptdate = driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--today']"));
			  boolean chk = Deptdate.getAttribute("aria-disabled") != null;
			  if(chk = false) {
				  Deptdate.click(); 
				  Thread.sleep(5000);
				  }
			  else {
				  Thread.sleep(5000);
				  WebElement Nextdate = driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'June 30 2021')]"));
				  Nextdate.click();
				  }
		      
		  }
		
	//}
	
}
