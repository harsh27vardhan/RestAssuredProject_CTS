package genericLib;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class DataUtilities {
	public String readData(String key) throws FileNotFoundException, IOException {
		Properties p = new Properties();
		p.load(new FileInputStream(AutoConstant.propertyFilePath));
		return p.getProperty(key);
		}
}
