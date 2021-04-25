package automtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh.konda\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

  //Assert.assertTrue(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());//true
	
		
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());//true
		

		driver.findElement(By.xpath("//input[@value='option1']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());//false
		

		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		driver.close();
		
		
	}

}
