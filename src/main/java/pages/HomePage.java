package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@class='search-field']")
    private WebElement searchField;

    @FindBy(xpath = "//button[@class='search-button']")
    private WebElement searchButton;

    @FindBy(xpath = "//button[@class='cart-button js-action']")
    private WebElement shoppingCartPopupButton;

    @FindBy(xpath = "//button[@class='catalog-button js-megamenu']")
    private WebElement productsCatalogButton;

    @FindBy(xpath = "//a[contains(@class,'flaticon-apple')]")
    private WebElement appleProductsPopupCatalogButton;

    @FindBy(xpath = "//a[@title='iPhone'][@class='category-title']")
    private WebElement iPhonesCatalogButton;

    @FindBy(xpath = "//div[@class='bottom-profile']//button[@data-action='tocompare']")
    private WebElement compareProductsButton;

    private final Actions actions = new Actions(driver);

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSearchField() {
        searchField.click();
    }

    public void enterTextToSearchField(final String searchText) {
        searchField.clear();
        searchField.sendKeys(searchText);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickShoppingCartPopupButton() {
        shoppingCartPopupButton.click();
    }

    public void clickProductsCatalogButton() {
        productsCatalogButton.click();
    }

    public void moveToAppleProductsPopupCatalogButton() {
        actions.moveToElement(appleProductsPopupCatalogButton).build().perform();
    }

    public void moveToIPhonesCatalogButton() {
        actions.moveToElement(iPhonesCatalogButton).build().perform();
    }

    public void clickIPhoneCatalogButton() {
        iPhonesCatalogButton.click();
    }

    public WebElement getAppleProductsPopupCatalogButton() {
        return appleProductsPopupCatalogButton;
    }

    public WebElement getIPhonesCatalogButton() {
        return iPhonesCatalogButton;
    }

    public void clickCompareProductsButton() {
        compareProductsButton.click();
    }


}
