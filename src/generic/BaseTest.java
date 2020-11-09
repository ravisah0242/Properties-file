package generic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import properties_file.Property_data2;


public class BaseTest implements AutoConstant
{
public static WebDriver driver;
	
	@BeforeMethod
	public void ipenAppln() throws FileNotFoundException, IOException
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String data = Property_data2.test2("./p2.properties", "url");
		
		driver.get(data);
	}
	
	@AfterMethod
	public void closeAppln() 
	{
		driver.quit();
	}
}
