package Task;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Corroulate {
	@Test
	public void corrlate() {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\NAGESHWARI\\Desktop\\Nageshwari files\\jarfiles\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://cubicitsolution.co.in/");
	
    
    List<WebElement> corroulate =driver.findElements(By.xpath("//div[@class='sb-description']/h3"));
    int a=corroulate.size();
    System.out.println("count of images" +a);
    for(int i=0;i<a;i++)
    {
    	WebElement ele=corroulate.get(i);
    	String s=ele.getAttribute("outerHTML");
    	System.out.println(s);
}

	} 
}
