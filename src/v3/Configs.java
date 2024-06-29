
package v3;

import com.sun.jdi.Value;
import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.InputStream;


public class Configs {
    public static Properties prop = new Properties();
    
    public void SaveProp(String title, String value){
        try{
            prop.setProperty(title, value);
            prop.store(new FileOutputStream("config.tut"), null);
        }catch(IOException e){
            System.err.println("Couldn't save settings");
        }
    }
    
    public String GetProp(String title){
        String value = "";
        try{
           prop.load(new FileInputStream("config.tut"));
           value = prop.getProperty(title);
        }catch(IOException e){
            System.err.println("Couldn't save settings");
        }
        return value ;
    }
    
}
