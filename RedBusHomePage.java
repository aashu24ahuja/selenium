package redbuspagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBusHomePage {

	WebDriver driver;
	List<WebElement> sourceList;
	List<WebElement> tdList;

	public RedBusHomePage(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(how = How.ID, using = "src")
	public WebElement source;
	@FindBy(how = How.ID, using = "dest")
	public WebElement destination;
	@FindBy(how = How.ID, using = "onward_cal")
	public WebElement fromDate;
	@FindBy(how = How.ID, using = "return_cal")
	public WebElement toDate;
	@FindBy(how = How.ID, using = "search_btn")
	public WebElement searchButton;

	public void explicitWaitWrapper(WebDriverWait impwait, WebElement element) {
		impwait.until(ExpectedConditions.visibilityOf(element));
	}

	public void inputSource(String s) {
		sourceList = driver.findElements(By.tagName("li"));
		source.sendKeys(s);
		for (WebElement x : sourceList) {
			if (x.getText().equals(s)) {
				x.click();
				break;
			}
		}

	}

	public void inputDestination(String d) {
		destination.sendKeys(d);
		for (WebElement x : sourceList) {
			if (x.getText().equals(d)) {
				x.click();
				break;
			}
		}
	}

	public void inputFromDate(String d) {
		fromDate.sendKeys(d);
		tdList = driver.findElements(By.tagName("td"));
		for (WebElement x : tdList) {
			if (x.getText().equals(d)) {
				x.click();
				break;
			}
		}
	}

	public void inputToDate(String d) {
		toDate.sendKeys(d);
		tdList = driver.findElements(By.tagName("td"));
		for (WebElement x : tdList) {
			if (x.getText().equals(d)) {
				x.click();
				break;
			}
		}
	}

	public void searchBuses() {
		searchButton.click();
	}
}
