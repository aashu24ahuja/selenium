package redbuspagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewBuses {

	public void explicitWaitWrapper(WebDriverWait impwait, WebElement element) {
		impwait.until(ExpectedConditions.visibilityOf(element));
	}

	@FindBy(how = How.XPATH, using = "//li[@class='clearfix bus-item'][1]//button[@class='view-seats button to-be-hidden']")
	public WebElement viewSeatsButton;

}
