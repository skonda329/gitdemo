package automtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh.konda\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.facebook.com");
	//tagname[attribute='value']
	driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Mona"); //username
	driver.findElement(By.xpath("//Input[@id='pass']")).sendKeys("1111"); //pw
	driver.findElement(By.xpath("//*[@value='1']")).click(); //login

//tagname[attribute='value']...//[attribute="value']...//tagname#id..tagname.classname
	
}
}