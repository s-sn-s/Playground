package myTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class selectBrowser {

	final static String CONFIG_FILE_PATH = "./src/test/java/myTest/selectBrowser.java";
	
	public static void main(String[] params) {
		Properties prop = null;
		try {
			FileInputStream fis = new FileInputStream(CONFIG_FILE_PATH);
			prop = new Properties();
			prop.load(fis);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		switch(prop.getProperty("browser").trim().toLowerCase()) {
			case ("chrome"):
				System.out.println("chrome browser is selected!");
				break;
			case ("edge"):
				System.out.println("edge browser is selected!");
				break;
			case ("safari"):
				System.out.println("safari browser is selected!");
				break;
			default:
				throw new RuntimeException("Wrong browser selected");
		}
	}
}
