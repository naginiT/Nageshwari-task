import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouseover {
	static WebDriver driver;
@Test
public void action(){
	
	
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\NAGESHWARI\\Desktop\\Nageshwari files\\jarfiles\\drivers\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://cubicitsolution.co.in/project/quikrdeal/");
	   WebElement element=driver.findElement(By.xpath("//*[@id='locpanel1']/div[1]/div/center/h6[2]/a[1]"));
	   Actions act = new Actions(driver);
	   act.moveToElement(element).build().perform();
	   String colorafterhover = element.getCssValue("background-color");//predefined method in desired capabilities
	   System.out.println("The color after  hover is" +colorafterhover);
	   String[] aftervalue = colorafterhover.replace("rgba(", "").replace(")", "").split(",");
	   int aftervalue1=Integer.parseInt(aftervalue[0]);
	   System.out.println(aftervalue1+"aftervalue1");
	   aftervalue[1] = aftervalue[1].trim();
	   System.out.println("Aftervalue1"+aftervalue1);
	   int aftervalue2=Integer.parseInt(aftervalue[1]);
	   aftervalue[2] = aftervalue[2].trim();
	   int aftervalue3=Integer.parseInt(aftervalue[2]);
	   String actualcolorafterhover = String.format("#%02x%02x%02x", aftervalue1, aftervalue2, aftervalue3);
	   System.out.println("The actual color afterhover"+actualcolorafterhover);
	   driver.close();
}
}
