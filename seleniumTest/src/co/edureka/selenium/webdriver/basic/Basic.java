package co.edureka.selenium.webdriver.basic;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver ;


 

public class Basic {
	WebDriver driver;
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyotsna\\Downloads\\chromedriver_win32 17\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("http://www.edureka.co");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Basic bref= new Basic();
		bref.invokeBrowser();

		

	}

}
