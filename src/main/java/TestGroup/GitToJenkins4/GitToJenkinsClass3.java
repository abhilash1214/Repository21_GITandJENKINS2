package TestGroup.GitToJenkins4;

import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GitToJenkinsClass3 {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethodTesting() {
		System.out.println("Before Method");
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Abilash PL\\Desktop\\SeleniumProjects\\drivers\\chromedriver.exe"
		 * );
		 * 
		 * driver = new ChromeDriver();
		 */
	}

	@Test
	public void testing1() {
		System.out.println("<<<<<<<TC3B>>>>>>>>");
		/*
		 * driver.navigate().to("http://www.javatpoint.com/");
		 * driver.manage().window().maximize(); JavascriptExecutor js =
		 * (JavascriptExecutor) driver; js.executeScript("scrollBy(0, 5000)");
		 * driver.findElement(By.linkText("Core Java")).click();
		 */
	}

	@Test
	public void main3() {
		AssertJUnit.assertEquals(true, false);
		System.out.println("<<<<<<<TC3B>>>>>>>>");
	}

	@Test
	public void main3B() {
		System.out.println(".....TC3C.....");

	}
}
