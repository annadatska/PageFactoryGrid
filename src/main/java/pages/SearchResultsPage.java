package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//div[@class='products-listing grid']//button[@data-action='buyProduct']")
    private List<WebElement> searchResultsBuyButtonList;

    @FindBy(xpath = "//a[@class='js-close-popup']")
    private WebElement continueShoppingButton;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickBuyButtonOfFirstElementOfSearchList() {
        searchResultsBuyButtonList.get(0).click();
    }

    public void clickContinueShoppingButton() {
        continueShoppingButton.click();
    }

    public WebElement getContinueShoppingButton() {
        return continueShoppingButton;
    }
}
