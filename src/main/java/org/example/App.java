package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        try {
            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--disable-extensions");
            options.setExperimentalOption("debuggerAddress","localhost:9222 ");
//            options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\jimi\\Documents\\ChromeDriver.exe");
            System.setProperty("webdriver.http.factory", "jdk-http-client");

            WebDriver driver = new ChromeDriver(options);

            driver.navigate().to("https://www.google.com/");
            driver.navigate().to("https://www.yahoo.com/");
            System.out.println();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
