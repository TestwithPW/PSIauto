package BASE2;


import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.BeforeTest;




public class BaseClass {
	
	public static WebDriver driver;
	
	public static Properties p =new Properties();
	
	public static FileReader fr;
	
	@BeforeTest
	public void Setup() throws IOException, InterruptedException  {
		
		
				if(driver==null) {
					FileReader fr = new FileReader("C:\\Users\\prasa\\eclipse-workspace\\psi_Auto5\\src\\test\\resources\\Properties\\Config.properties"
							+ "");
					
					p.load(fr); 
				}
				
				if(p.getProperty("Browser").equalsIgnoreCase("chrome")) {
					
//					WebDriverManager.chromedriver().setup();
					
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--remote-allow-origins=*");
					
					driver = new ChromeDriver(options);
			
					driver.get(p.getProperty("URL_lgn"));
					driver.manage().window().maximize();
				    driver.manage().deleteAllCookies();
			        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//			        Thread.sleep(3000);
//			        driver.quit();
				}
				
				else if(p.getProperty("Browser").equalsIgnoreCase("edge")) {
					
//					WebDriverManager.edgedriver().setup();
					EdgeOptions options = new EdgeOptions();
					options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
					List<String> args = Arrays.asList("use-fake-ui-for-media-stream", "use-fake-device-for-media-stream");
					Map<String, Object> map = new HashMap<>();
					map.put("args", args);
					options.setCapability("ms:edgeOptions", map);
					
					driver =new EdgeDriver();
					driver.get(p.getProperty("URL_lgn"));
					driver.manage().window().maximize();
				    driver.manage().deleteAllCookies();
			        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
				}
			    
				else if(p.getProperty("Browser").equalsIgnoreCase("firefox")) {
					
//					WebDriverManager.firefoxdriver().setup();
					
					driver = new FirefoxDriver();
					driver.get(p.getProperty("URL_lgn"));
					driver.manage().window().maximize();
				    driver.manage().deleteAllCookies();
			        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					
				  }
					
	}
	
    
//	public static void main(String[] args) throws IOException, InterruptedException{
//		BaseClass start =new BaseClass();
//		start.Setup();}
	
}
	

