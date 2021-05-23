package configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class config {
	
	public static String getPropertyValue(String PropertyName) {
		  // TODO Auto-generated method stub
		  FileReader input=null;
		  
		  try {
		    input=new FileReader("D:\\Nidhi\\JAVA_practice\\SeleniumFramework\\src\\main\\java\\configuration\\configuration");
		  } catch (FileNotFoundException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  
		  Properties p=new Properties();
		  
		  try {
		   p.load(input);
		  } catch (IOException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  
		   return p.getProperty(PropertyName);
		 
	
}
}