package Step;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	

	WebDriver driver;

	@Given("Open chrome browser and url of the appliction")
	public void open_chrome_browser_and_url_of_the_appliction() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\software\\Eclipse Mars\\eclipse\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.myhcl.com/bprhome/Home/Index");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When("Enter username and password and click on login button")
	public void enter_username_and_password_and_click_on_login_button() {

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sathish.ak@hcl.com");// sendkeys
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.id("i0118")).sendKeys("Model@k33");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();

	}

	@Then("Click approve button and Successfully login to the account")
	public void click_approve_button_and_successfully_login_to_the_account() {

		driver.findElement(By.id("idBtn_Back")).click();
		System.out.println("Logged in Successfully");

	}

	@Given("Open chrome and url of myhcl")
	public void open_chrome_and_url_of_myhcl() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\software\\Eclipse Mars\\eclipse\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
        Thread.sleep(5000);
		driver.get("https://www.myhcl.com/bprhome/Home/Index");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	}

	@When("Enter username1 and password1 and click on login button")
	public void enter_username1_and_password1_and_click_on_login_button() {

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sathish.ak@hcl.com");// sendkeys
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.id("i0118")).sendKeys("Model@k33");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();

	}

	@Then("Click approve button1 and login Successfully")
	public void click_approve_button1_and_login_successfully() {

		driver.findElement(By.id("idBtn_Back")).click();
		System.out.println("Logged in Successfully");

	}

	@And("Enter itime in text search box")
	public void enter_itime_in_text_search_box() throws InterruptedException {
		
		WebElement txt = driver.findElement(By.id("txtSearch"));
		txt.click();
		txt.sendKeys("iTime (Time Sheet Management System)");

		driver.findElement(By.xpath("/html/body/ul/li/table/tbody/tr/td[1]/a")).click();

		Thread.sleep(3000);
		System.out.println("Entered text Successfully");

	}

	@And("Enter time in timesheet")
	public void enter_time_in_timesheet() throws InterruptedException {
		
		
		WebElement TimeEnter=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div[4]/div[1]/div/div/div/div[2]/div/div[1]/span/div[2]/div/div/div/div/div/div[2]/div/div/div/div/input"));
		Thread.sleep(5000);
		TimeEnter.click();
		Thread.sleep(5000);
		TimeEnter.sendKeys("09:00");
		System.out.println("Time Entered Successfully");
		

	}

	@And("Save the time")
	public void save_the_time() {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(300,800)","");
		driver.findElement(By.id("le_apply")).click();
		
		System.out.println("Time Saved Successfully");
	}
	
}