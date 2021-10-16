package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ComparisonPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'compare-block-col')]//a[@class='remove-item']")
    private WebElement removeItemButton;

    public ComparisonPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getRemoveItemButton() {
        return removeItemButton;
    }

}
