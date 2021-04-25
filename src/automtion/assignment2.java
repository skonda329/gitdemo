package automtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh.konda\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		
		driver.findElement(By.xpath("//input[@etitle='Depart Date']")).click();    //date
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();
		
		WebElement staticAdults=driver.findElement(By.id("Adults"));//adults
		
		Select Adults= new Select(staticAdults);
		Adults.selectByIndex(2);
		System.out.println(Adults.getFirstSelectedOption().getText());
		
		WebElement staticchild1=driver.findElement(By.id("Childrens"));//childrens
		
		Select child1= new Select(staticchild1);
		child1.selectByIndex(2);
		System.out.println(child1.getFirstSelectedOption().getText());

		driver.findElement(By.id("MoreOptionsLink")).click();

		driver.findElement(By.name("airline")).sendKeys("Indego");
		
		driver.findElement(By.xpath("//*[@id=\'SearchBtn\']")).click();
		System.out.println(driver.findElement(By.cssSelector("#homeErrorMessage")).getText());



	}

}
