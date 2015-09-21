import java.util.Properties;
import java.io.IOException;
import java.io.FileInputStream;

public class GetProperties {
	Properties prop = new Properties();
	String stock = null;
	{
		try{
			prop.load(new FileInputStream("/home/mikedes/workspace/JSoupParser/bidask.config"));
		}catch(IOException e){
			System.out.println(e);
		}
		
		for(String key : prop.stringPropertyNames()) {
			String value = prop.getProperty(key);
			if(value != null) {
				stock = value;
			} else {
				System.out.println("No stock value set.");
			}
		}
	}
	
	public String selectStock() {
		return stock;
	}
	
}
