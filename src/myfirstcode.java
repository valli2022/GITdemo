import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myfirstcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sakam\\Downloads\\Compressed\\chromedriver.exe");
	driver.get("https://www.facebook.com/googlechrome/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	//driver.quit();
	}

}
 