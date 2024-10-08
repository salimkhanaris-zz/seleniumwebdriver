package day41;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertoesFile {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        String path = System.getProperty("user.dir") + "\\testdata\\config.properties";
        FileInputStream file = new FileInputStream(path);

        //Loading Properties file
        prop.load(file);

        //Reading Data from prop file
        String url= prop.getProperty("appurl");
        String email= prop.getProperty("email");
        String pass= prop.getProperty("pass");
        String orderid= prop.getProperty("orderid");
        String customerid= prop.getProperty("customerid");

        System.out.println(url+" "+email+ " "+ pass+" "+orderid+ " "+customerid);

        //Reading all keys from properties file
        Set<String> properties=prop.stringPropertyNames();
        System.out.println(properties);

        //Reading all values from properties file
        Collection<Object> values= prop.values();
        System.out.println(values);

    }

}
