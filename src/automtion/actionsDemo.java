package automtion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh.konda\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		
		Actions a=new Actions(driver); 
		WebElement move=driver.findElement(By.cssSelector("a[id=\'nav-link-accountList\']"));
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

		a.moveToElement(driver.findElement(By.cssSelector("a[id=\'nav-link-accountList\']"))).build().perform();

		a.moveToElement(move).contextClick(). build().perform();
		a.moveToElement(move).c
		


	}
	
}
