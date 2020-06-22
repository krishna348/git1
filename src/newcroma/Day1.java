package newcroma;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("ChromeDriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("krishna");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.navigate().back();
		/*driver.findElement(By.id("pass")).sendKeys("1234");
		Thread.sleep(3000);
		driver.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(6000);*/
		driver.navigate().forward();
		//Thread.sleep(6000);
		//driver.close();

	}

}
