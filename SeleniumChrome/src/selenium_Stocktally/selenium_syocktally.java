package selenium_Stocktally;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_syocktally {

	WebDriver driver;

	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\Jyotsna\\\\Downloads\\\\chromedriver_win32 13\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("http://localhost:8080/stocktally/");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void doLogin() {
		try {
			driver.findElement(By.name("loginid")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin");
			Thread.sleep(3000);
			driver.findElement(By.name("submit")).click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	public void openPage() {
		try {
			WebElement el = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[4]/a/span[2]"));
			System.out.println(el);
			el.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@href='../common/entity_list.jsp?entitytype=USR']")).click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void Add_User() {
		try {
			driver.findElement(By.xpath("//a[@class='btn btn-white btn-xs addbutton ']")).click();
			driver.findElement(By.name("firstname")).sendKeys("Amqan"/* + System.currentTimeMillis()*/);
			Thread.sleep(2000);
			driver.findElement(By.name("lastname")).sendKeys("Singh");
			Thread.sleep(2000);
			driver.findElement(By.name("loginid")).sendKeys("Aman"/* + System.currentTimeMillis()*/);
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("password");
			Thread.sleep(2000);
			driver.findElement(By.name("email")).sendKeys("surajkumarsingh2159@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.name("contact")).sendKeys("7979785210");
			Thread.sleep(2000);
			driver.findElement(By.name("role")).sendKeys("normal");

			//// *[@id="entityform"]/div[4]/div[2]/div/select
			//// *[@id="entityform"]/div[4]/div[2]/div/select/option[1]
			/*
			 * WebElement dl = driver.findElement(By.xpath(
			 * "//*[@id=\"entityform\"]/div[4]/div[2]/div/select/option[1]"));
			 * System.out.println(dl); dl.click();
			 */
			WebElement dl = driver.findElement(By.xpath("//*[@id=\"entityform\"]/div[4]/div[2]/div/select"));
			System.out.println(dl);
			dl.sendKeys("A");

			Thread.sleep(2000);
			// driver.findElement(By.name("joiningdate")).sendKeys("02/05/2020");
			Thread.sleep(2000);
			driver.findElement(By.name("empcode")).sendKeys("1001");
			Thread.sleep(2000);
			driver.findElement(By.name("submitbutton")).click();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Edit_User() {
		try {
			WebElement dl = driver.findElement(By.id("1002"));
			dl.click();
			Thread.sleep(2000);
			driver.findElement(By.name("email")).sendKeys("");
			Thread.sleep(2000);
			driver.findElement(By.name("submitbutton")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		selenium_syocktally myObj = new selenium_syocktally();
		myObj.invokeBrowser();
		myObj.doLogin();
		myObj.openPage();
		myObj.Add_User();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myObj.Edit_User();

	}

}
