package revision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readProp {

	public static final String CONFIG_FILE_PATH = "./src/revision/config.properties";
	
	public static void main(String[] param) {
		Properties prop = null;
		try {
		FileInputStream fis = new FileInputStream(CONFIG_FILE_PATH);
		prop = new Properties();
		prop.load(fis);
		
		}
		catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		catch(IOException fnfe) {
			fnfe.printStackTrace();
		}
		
		String name = prop.getProperty("name");
		
		System.out.println(name);
	}
	
}
