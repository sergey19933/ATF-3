package org.serg.framework.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.serg.framework.base.BasePage;

public class HomePage extends BasePage {


    @FindBy(xpath = "//a[@class='btn btn-additional']")
    private WebElement clickCity;

    public HomePage clickCity() {
        try {
            waitUtilElementToBeVisible(clickCity);
            waitUtilElementToBeClickable(clickCity);
            clickCity.click();
            return this;
        } catch (Exception e) {

        }

        return this;
    }


    @FindBy(xpath = "//form[@class='presearch']//input[@type='search']")
    private WebElement clickSearch;

    public ListProductPage clickSearchProduct(String nameProduct) {
        waitUtilElementToBeClickable(clickSearch);
        actions.click(clickSearch)
                .sendKeys(nameProduct, Keys.ENTER)
                .build()
                .perform();
        //  clickSearch.click();
        //String nameProduct = "ноутбук msi";
        // clickSearch.sendKeys(nameProduct,Keys.ENTER);
        return pageManager.getListProductPage();
    }


}
