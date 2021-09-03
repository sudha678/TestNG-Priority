package TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG {
	
	@Test (priority=1)
	public void test() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (1).exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Welcome  to Ebay...");
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.close();
		
	}
	
	// Method 2: Launch Google.com			
    @Test (priority=2)		
    public void launchGoogle() {				
        ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://www.google.co.in");						
    }		
	

    // Method 4: Verify Google search page title.			
    @Test (priority=3)		
    public void FaceBookPageTitleVerification() throws Exception {
    	ChromeDriver driver = new ChromeDriver();
    	driver.get("http://www.google.co.in");
    	driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");
    	
        driver.findElement(By.xpath(".//*[@value='Search']")).click();						
        Thread.sleep(3000);		
        Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);				
    }	


}
