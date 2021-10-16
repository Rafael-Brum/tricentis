package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	
	@Before
	public void iniciarDriver() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_94.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}
	
	@After
	public void fecharDriver() {
		driver.quit();
	}
	
	public static WebDriver getDriver()
    {
        return driver;
    }

    public static void abrirUrl(String url)
    {
        driver.get(url);
    }

    
}
