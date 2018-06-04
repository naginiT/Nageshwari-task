import java.io.File;
import java.io.IOException;
import java.util.HashMap;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Fileovrewrite {
	WebDriver driver;
	@Test
public void Exe() throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NAGESHWARI\\Desktop\\Nageshwari files\\jarfiles\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://cubicitsolution.co.in/project/mpower-admin/admin");
		String path = "C:\\Users\\NAGESHWARI\\Desktop\\file download";
	     HashMap<String, Object> chromeprefs = new HashMap<String, Object>();
	     chromeprefs.put("profile.default_content_settings.popups", 0);
	     chromeprefs.put("download.default_directory", path );
	     ChromeOptions options = new ChromeOptions();
	     HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
	     options.setExperimentalOption("prefs", chromeprefs);
	     options.addArguments("--test-type");
	     DesiredCapabilities cap = DesiredCapabilities.chrome();
	     cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
	     cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	     cap.setCapability(ChromeOptions.CAPABILITY, options);
	     driver =new ChromeDriver(cap);
		 driver.get("http://cubicitsolution.co.in/project/mpower-admin/admin/");
		     //return driver;

		driver.findElement(By.name("unm")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin321");
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/form/div/div[3]/button")).click();
		driver.findElement(By.cssSelector("body > div > div.main-panel.ps-container.ps-theme-default.ps-active-x.ps-active-y > div.content > div > div > div:nth-child(2) > div > div.card-footer > div > b > a")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/p/a[1]")).click();
	

	}}
	
	