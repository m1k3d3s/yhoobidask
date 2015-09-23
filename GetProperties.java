import java.util.Properties;
import java.io.IOException;
import java.io.FileInputStream;

public class GetProperties {
        Properties prop = new Properties();
        String stock = null;
        String url = null;
        String logfile = null;
        {
                try{
                        prop.load(new FileInputStream("bidask.config"));
                }catch(IOException e){
                        System.out.println(e);
                        System.out.println("Unable to continue.");
                }
                
                for(String key : prop.stringPropertyNames()) {
                        String value = prop.getProperty(key);
                        if(key.matches("stock") && value != null) {
                                stock = value;
                                System.out.println(stock);
                        }else if(key.matches("url") && value != null) {
                                url = value;
                                System.out.println(url);
                        }else if(key.matches("logfile") && value != null){
                                logfile=value;
                        } else {
                                System.out.println("Unknown key/value pair. Skipping.");
                                System.out.println(key + " " + value);
                        }
                }
        }
        
        public String selectStock() {
                return stock;
        }
        public String selectUrl(){
                return url;
        }
        public String selectLogFile(){
                return logfile;
        }
        
}

