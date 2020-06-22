package newcroma;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("chromedriver.chrome.driver","‪C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://optinmonster.com/website-alert-banners/");
		Thread.sleep(3000);
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[contains(@id,'onesignal-popover-cancel-button')]")).click();
		
	}

}
