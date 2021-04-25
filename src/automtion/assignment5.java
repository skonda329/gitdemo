package automtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh.konda\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[34]/a")). click();
		
		driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-middle");
		
		//driver.findElement(By.cssSelector("#content")).getText();
		
		System.out.println(driver.findElement(By.id("content")).getText());
		
		
	}

}
