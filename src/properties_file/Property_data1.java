package properties_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Property_data1 
{
	@Test
	public void test1() throws FileNotFoundException, IOException
	{
		//1. Create object for Properties class;
		Properties p1=new Properties();
		
		
		//2. Specify the path of properties file;
		p1.load(new FileInputStream("./p.properties"));
		
		//3. Specify the key and it will fetch the value;
		 String value = p1.getProperty("url");
		System.out.println(value);
	}

}
