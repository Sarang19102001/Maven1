package commonutils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtils {

	
		
		public String getdatafromPropertyFile(String key) throws IOException
		
		{
			FileInputStream f= new FileInputStream("src\\main\\resources\\F1.properties");
		Properties p=new Properties();
		p.load(f);
		String value=p.getProperty(key);
		return value;
		

	}
		
		public String getdataPropertyFilec(String keys) throws IOException
		{
		FileInputStream f= new FileInputStream("src\\main\\resources\\cmod.properties");
		Properties p=new Properties();
		p.load(f);
		String cvalue = p.getProperty(keys);
		return cvalue;
		}
	}

