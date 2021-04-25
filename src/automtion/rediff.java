package automtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh.konda\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.rediff.com");
		
driver.findElement(By.cssSelector("a[title*='Sign in']")).click();//regular
driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");//own
driver.findElement(By.cssSelector("input#password")).sendKeys("good bye");
driver.findElement(By.xpath("//input[contains(@name, 'procee') ]")).click();//regular



	
	}


	Complete the Assignment and Post the code here

	import java.util.Iterator;



	import java.util.List;



	import java.util.Set;



	import org.openqa.selenium.By;



	import org.openqa.selenium.WebDriver;



	import org.openqa.selenium.WebElement;



	import org.openqa.selenium.chrome.ChromeDriver;



	public class A1 {



	public static void main(String[] args) {



	// TODO Auto-generated method stub


	System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");



	WebDriver driver=new ChromeDriver();



	driver.get("http://the-internet.herokuapp.com/");



	driver.findElement(By.linkText("Multiple Windows")).click();



	driver.findElement(By.cssSelector("a[href*='windows']")).click();



	Set<String> abc=driver.getWindowHandles();



	Iterator<String> it=abc.iterator();



	String parentWindow=it.next();



	driver.switchTo().window(it.next());



	System.out.println(driver.findElement(By.xpath("//div/h3")).getText());

	driver.switchTo().window(parentWindow);



	System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());





	}

	}
	
	
	Complete the Assignment and Post the code here



	public class frame_exercise {



	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\manu-\\Documents\\Selenium files\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	//access web site

	driver.get("http://the-internet.herokuapp.com/");

	//click on nested frames link

	driver.findElement(By.cssSelector("a[href*='nested_frames']")).click();

	//switch to middle frame

	driver.switchTo().frame("frame-top");

	driver.switchTo().frame("frame-middle");

	//print middle frame text

	System.out.println(driver.findElement(By.id("content")).getText());

	//switch back to default content

	driver.switchTo().defaultContent();

	}



	}









