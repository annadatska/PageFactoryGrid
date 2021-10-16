package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SmokeTests extends BaseTest {
    private static final long DEFAULT_WAITING_TIME = 90;
    private static final String DEFAULT_AMOUNT_OF_IPHONES_ON_PAGE = "30";
    private static final String XIAOMI_SEARCH_QUERY = "xiaomi mi11 lite 5g";


    @Test
    public void checkAddedIPhoneAppearedOnComparisonPage() {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().clickProductsCatalogButton();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getHomePage().getAppleProductsPopupCatalogButton());
        getHomePage().moveToAppleProductsPopupCatalogButton();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getHomePage().getIPhonesCatalogButton());
        getHomePage().clickIPhoneCatalogButton();
        getIPhonesCatalogPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getIPhonesCatalogPage().clickFirstElementOfIPhonesList();
        getIPhonesCatalogPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getProductPage().clickAddToCompareButton();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().clickCompareProductsButton();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getComparisonPage().getRemoveItemButton());
        assertTrue(getComparisonPage().getRemoveItemButton().isDisplayed());
    }

    @Test
    public void checkAmountOfProductsOnIPhonesCatalogPage() {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().clickProductsCatalogButton();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getHomePage().getAppleProductsPopupCatalogButton());
        getHomePage().moveToAppleProductsPopupCatalogButton();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getHomePage().getIPhonesCatalogButton());
        getHomePage().moveToIPhonesCatalogButton();
        getHomePage().clickIPhoneCatalogButton();
        getIPhonesCatalogPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        assertEquals(getIPhonesCatalogPage().iPhonesListSize(), DEFAULT_AMOUNT_OF_IPHONES_ON_PAGE);
    }

    @Test
    public void checkEditCartOnCheckoutPage() {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().clickSearchField();
        getHomePage().enterTextToSearchField(XIAOMI_SEARCH_QUERY);
        getHomePage().clickSearchButton();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getSearchResultsPage().clickBuyButtonOfFirstElementOfSearchList();
        getSearchResultsPage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getSearchResultsPage().getContinueShoppingButton());
        getSearchResultsPage().clickContinueShoppingButton();
        getSearchResultsPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().clickShoppingCartPopupButton();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getCheckoutPage().clickShoppingCartEditButton();
        getCheckoutPage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getCheckoutPage().getProductQuantityIncreaseButton());
        assertTrue(getCheckoutPage().getProductQuantityIncreaseButton().isDisplayed());
    }
}
