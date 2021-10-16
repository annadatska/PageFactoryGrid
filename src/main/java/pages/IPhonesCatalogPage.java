package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class IPhonesCatalogPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'list')]//a[@class='image-inner']")
    private List<WebElement> iPhonesList;

    public IPhonesCatalogPage(WebDriver driver) {
        super(driver);
    }

    public String iPhonesListSize() {
        return String.valueOf(iPhonesList.size());
    }

    public void clickFirstElementOfIPhonesList() {
        iPhonesList.get(0).click();
    }
}
