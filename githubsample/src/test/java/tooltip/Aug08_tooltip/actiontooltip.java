package tooltip.Aug08_tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actiontooltip {

	public void tooltip()

	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\software\\Eclipse Mars\\eclipse\\chromedriver_win32\\chromedriver.exe");

		WebDriver wb = new ChromeDriver();

		

		wb.get("https://news.google.com/topstories?hl=en-IN&gl=IN&ceid=IN:en");

		wb.manage().window().maximize();

		WebElement E1 = wb.findElement(By.id("sdgBod"));

		Actions a = new Actions(wb);

		a.moveToElement(E1).perform();

		WebElement E2 = wb.findElement(By.id("sdgBod"));

		String s2 = E2.getText();

		System.out.println(s2);

	}
}
