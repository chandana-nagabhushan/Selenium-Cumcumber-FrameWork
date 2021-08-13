package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
public class PropertyFileReader {

	private static Properties properties = new Properties();
	final static Logger logger = Logger.getLogger(PropertyFileReader.class);

	/**
	 * Reads the resource property file and return the property value
	 * 
	 */
	public static String getPropertyValue(String path, String propertyName) {
		properties = new Properties();
		String value = null;

		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + path);

			properties.load(fis);

			value = properties.getProperty(propertyName);
		} catch (FileNotFoundException ex) {
			logger.error("File Not Found", ex);
		} catch (IOException ex) {
			logger.error("Value corrosponding to the key is not present in the config.properties file " + ex);
		}
		return value;
	}

}
