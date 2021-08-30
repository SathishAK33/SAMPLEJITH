package tooltip.Aug08_tooltip;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class tooltip {
	// @Test
	public void tip() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\software\\Eclipse Mars\\eclipse\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		WebElement clck = driver.findElement(By.name("q"));
		String s = clck.getAttribute("title");
		System.out.println(s);
		
	}

	@Test
	public void Action_tip() throws InterruptedException, IOException

	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\software\\Eclipse Mars\\eclipse\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement clck = driver.findElement(By.xpath("//*[@id='gbwa']/div/a"));
		Actions actions = new Actions(driver);
		
		

		actions.moveToElement(clck).perform();
		WebElement toolTip1 = driver.findElement(By.xpath("//*[@id='gbwa']/div/a"));
		String toolTip =toolTip1.getText();
		
		System.out.println(toolTip);
		TakesScreenshot ts =(TakesScreenshot)driver;
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrFile,new File ("C:\\Users\\sathish.ak\\Desktop\\reports\\pics.jpg"));
		
		
		
	}
}
