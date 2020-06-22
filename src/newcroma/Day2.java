package newcroma;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Day2 {

	@Test
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	WebElement day = driver.findElement(By.id("day"));
	Select s = new Select(day);
	s.selectByVisibleText("8");
	
	List<WebElement> days = s.getOptions();
	int total = days.size();
	System.out.println("Total month count is" +total);
	
	
	WebElement month = driver.findElement(By.id("month"));
	Select k = new Select(month);
	k.selectByIndex(11);
	
	WebElement year = driver.findElement(By.id("year"));
	Select l = new Select(year);
	l.selectByVisibleText("1988");
	
	
	//s.selectByVisibleText("14");

	}

}
