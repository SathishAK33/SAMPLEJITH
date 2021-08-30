package tooltip.Aug08_tooltip;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class tooltip1 {

	public class Capturetooltip {
@Test
		public void tip() throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\software\\Eclipse Mars\\eclipse\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			

			driver.manage().window().maximize();
			driver.get("https://www.provartesting.com/documentation/using-provar/tooltip-testing/");
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebElement element = driver.findElement(By.linkText("Let's Talk"));
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();
			//File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			//FileHandler.copy(scrFile, new File("C:\\Users\\sathish.ak\\Desktop\\tooltip.jpg"));

			
		}

	}

}
