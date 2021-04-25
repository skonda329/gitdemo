package automtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh.konda\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.facebook.com");
		//driver.findElement(By.id("email")).sendKeys("mona");
		
		//driver.findElement(By.name("pass")).sendKeys("1111");
		
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("1111"); //pw
		driver.findElement(By.cssSelector("#email")).sendKeys("mona"); //username

		driver.findElement(By.xpath("//*[@id=\'login_link\']/div[1]/a")).click(); //forgot account
		driver.findElement(By.xpath("//*[@id=\'login_link\']/div[1]/a")).getText(); //see error in console

		
		//driver.findElement(By.xpath("//*[@id=\'Login\']")).click();

		
		//driver.findElement(By.classname("inputtext")).sendKeys();
		
		//driver.findElement(By.linkText("Forgot account")).click();


		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
	
		//System.out.println(driver.getPageSource());
		
		//driver.get("http://www.yahoo.com");
		//driver.navigate().back();
		//driver.close();//current browse
		//driver.quit();//all selinium windows
		
	}

}
