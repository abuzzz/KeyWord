package config;

import static executionEngine.DriverScript.OR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ActionKeywords {

		public static WebDriver driver;

	public static void openBrowser(String object){		
		driver=new FirefoxDriver();
		}

	public static void navigate(String object){	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("Constant.URL");
		}

	public static void click(String object){
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		}

	public static void input_Username(String object){
		driver.findElement(By.xpath(OR.getProperty(object))).sendKeys(Constants.UserName);;
		}

	public static void input_Password(String object){
		driver.findElement(By.xpath(OR.getProperty(object))).sendKeys(Constants.Password);
		}



	public static void waitFor(String object) throws Exception{
		Thread.sleep(5000);
		}

	

	public static void closeBrowser(String object){
			driver.quit();
		}

	}