package automtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class updatedropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\suresh.konda\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		/*
		 * int i=1; while(i<5) {
		 * 
		 * driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click(4); }i++;
		 * for(int i=1; i<5; i++)
		 */
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));

		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(5);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		driver.findElement(By.id("display: none;")).click();

	}

}
