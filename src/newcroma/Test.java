package newcroma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("chromedriver.chrome.driver","‪C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.softwaretestingmaterial.com/");
		
		driver.findElement(By.xpath("//button[contains(@id,'onesignal-popover-allow-button']")).click();
		

	}

}
