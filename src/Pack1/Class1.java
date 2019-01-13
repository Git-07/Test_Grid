package Pack1;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Class1 {


	@Test
	public void auto(){
		System.out.println("Auto Test cases from Package1 Class22");
	}
	
	@Test
	public void boat(){
		System.out.println("Condo Test cases from Package1 Class22");
	}
	
	@Test
	public void Home(){
		System.out.println("home Test cases from Package1 Class22");
	}
	
	@Test
	public void standaloneTest(){
		try{
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		DesiredCapabilities dc1 = DesiredCapabilities.internetExplorer();		
		dc.setPlatform(Platform.WINDOWS);		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohit\\workspace\\Latest_Test_NG\\chromedriver.exe\\chromedriver.exe");
		RemoteWebDriver driver;
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("useAutomationExtension", false);
//		options.addArguments("start-maximized");
		//dc.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new RemoteWebDriver(new URL ("http://mohit-PC:4444/wd/hub"),dc);
		driver.manage().window().maximize();
		driver.get("https://google.com/");	
		WebDriverWait wait = new WebDriverWait(driver,60);
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[2]/input")));
		ele.sendKeys("Remote Web driver");
		WebElement ele2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='tsf']/div[2]/div/div[3]/center/input[1]")));
		ele2.click();
		Thread.sleep(2000);
		driver.close();
		
		driver = new RemoteWebDriver(new URL ("http://mohit-PC:4444/wd/hub"),dc1);
		driver.get("https://google.com/");
		Thread.sleep(2000);
		driver.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
