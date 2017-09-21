package redbustest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import redbuspagefactory.RedBusHomePage;
import redbuspagefactory.ViewBuses;

public class RedBusHomePageTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		RedBusHomePage homepage = PageFactory.initElements(driver, RedBusHomePage.class);
		homepage.explicitWaitWrapper(wait, homepage.source);
		homepage.inputSource("Mumbai");
		homepage.explicitWaitWrapper(wait, homepage.destination);
		homepage.inputDestination("Pune");
		homepage.explicitWaitWrapper(wait, homepage.fromDate);
		homepage.inputFromDate("23");
		homepage.explicitWaitWrapper(wait, homepage.fromDate);
		homepage.inputToDate("25");
		homepage.explicitWaitWrapper(wait, homepage.searchButton);
		homepage.searchButton.click();

		ViewBuses viewBuses = PageFactory.initElements(driver, ViewBuses.class);
		viewBuses.explicitWaitWrapper(wait, viewBuses.viewSeatsButton);
		viewBuses.viewSeatsButton.click();
	}

}
