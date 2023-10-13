package Com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() throws Exception {
		String configPath="C:\\Users\\DELL\\eclipse-workspace\\FrameWorkSelenium\\ConfigDataProvider\\ConfigData.txt";
		FileInputStream file =new FileInputStream(configPath);
		pro=new Properties();
		pro.load(file);
	
	}
	public String getBaseURL_QA2() {
		return pro.getProperty("BaseURL_QA2");
	}
	
}
