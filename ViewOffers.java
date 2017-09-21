package redbuspagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewOffers {
	
	public void explicitWaitWrapper(WebDriverWait impwait, WebElement element) {
		impwait.until(ExpectedConditions.visibilityOf(element));
	}

@FindBy (how = HOW.XPATH, using="")
}
