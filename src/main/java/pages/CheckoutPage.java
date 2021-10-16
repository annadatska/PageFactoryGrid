package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy(xpath = "//span[contains(@class,'start-edit-cart-btn')]")
    private WebElement shoppingCartEditButton;

    @FindBy(xpath = "//button[@class='more']")
    private WebElement productQuantityIncreaseButton;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void clickShoppingCartEditButton() {
        shoppingCartEditButton.click();
    }

    public WebElement getProductQuantityIncreaseButton() {
        return productQuantityIncreaseButton;
    }

}
