package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//div[@class='action-btns']//span[@data-action='compare-toggle']")
    private WebElement addToCompareButton;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCompareButton() {
        addToCompareButton.click();
    }
}
