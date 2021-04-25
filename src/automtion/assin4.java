package automtion;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assin4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh.konda\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[text() = 'Multiple Windows']")).click();

		driver.findElement(By.xpath("//a[text() = 'Click Here']")).click();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();

		String ParentId = it.next();

		String childId = it.next();

		driver.switchTo().window(childId);

		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());

		driver.switchTo().window(ParentId);

		System.out.println(driver.findElement(By.xpath("//h3[text() = 'Opening a new window']")).getText());


	}

}





public static void main(String[] args) {



// TODO Auto-generated method stub





System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");

WebDriver driver=new ChromeDriver();



driver.get("http://the-internet.herokuapp.com/");



driver.findElement(By.linkText("Nested Frames")).click();



driver.switchTo().frame("frame-top");



driver.switchTo().frame("frame-middle");



System.out.println(driver.findElement(By.id("content")).getText());



}

}


