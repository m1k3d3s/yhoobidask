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
                        }else if(key.matches("url") && value != null) {
                                url = value;
                        }else if(key.matches("logfile") && value != null){
                                logfile=value;
                        }else if(key.matches("classname") && value != null){
                                classname=value;
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
        public String selectClassName(){
                return classname;
        }
        
}

