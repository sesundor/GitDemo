import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome -ChromeDriver 
		//FireFox - FirefoxDriver
		//safari SafariDriver
		//WebDriver methods + class methods
		
		//chromedriver.exe -> Chrome browser Selenium Manager
		//step to invoke chrome driver //
		System.setProperty("webdriver.chrome.driver", "/putri/Documents/Sylvia/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Firefox 
		//geckodriver		
		//webdriver.gecko.driver
		System.setProperty("webdriver.gecko.driver", "/putri/Documents/Sylvia/Driver/geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		//Microsoft Edge
		System.setProperty("webdriver.edge.driver", "/putri/Documents/Sylvia/Driver/msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();	
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// not working because of version // driver.close();

		driver.quit();

	}

}
