package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {

		FileInputStream f = new FileInputStream("C:\\testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		String correctEmailId = prop.getProperty("correctEmail");
		System.out.println(correctEmailId);
		
		System.out.println(prop.getProperty("correctEmail"));
		System.out.println(prop.getProperty("incorrectemail"));
		
		prop.setProperty("tool", "selenium");
		System.out.println(prop.getProperty("tool"));
		
		prop.setProperty("testing", "automation");
		System.out.println(prop.getProperty("testing"));
		
		FileOutputStream fo = new FileOutputStream("C:\\testing\\prop.properties");
		prop.store(fo, "Adding to properties file"); // give comment 
		
		
	}

}