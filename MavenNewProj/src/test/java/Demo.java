import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {

	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		}
	
	@Test
	public void demo() {
		WebElement jewel = driver.findElement(By.xpath("(//a[contains(text(),'Jewelry')])[1]"));
		WebElement giftCards = driver.findElement(By.xpath("(//a[@href=\"/gift-cards\"])[1]"));
		Assert.assertTrue(jewel.isDisplayed());
		Assert.assertTrue(giftCards.isDisplayed());
		WebElement newsletter = driver.findElement(By.xpath("//input[@id='newsletter-email']"));
		newsletter.sendKeys("abc");
		Assert.assertEquals("abcd", "newsletter");
		
		
		
		}
		
}
