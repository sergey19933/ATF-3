package org.serg.framework.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.serg.framework.base.BasePage;

public class LaptopPage extends BasePage {

    private String price;
    private String newPrice;

    @FindBy(xpath = "//h1")
    private WebElement checkingThePage;


    public LaptopPage checkingPage() {
        Assertions.assertEquals("15.6\" Ноутбук MSI GF65 10UE-065XRU черный", checkingThePage.getText(), "Не та страница");
        return this;
    }

    @FindBy(xpath = "//div[@class='product-buy__price']")
    private WebElement rememberPrice;


    public LaptopPage rememberPrice() {
        price= rememberPrice.getAttribute("innerText");
        return this;
    }


    @FindBy(xpath = "//div[contains(@class,'additional')][contains(text(),'Гарантия')]")
    private WebElement clickWarranty;

    public LaptopPage clickWarranty() {
        waitUtilElementToBeClickable(clickWarranty);
        clickWarranty.click();
        return this;
    }

    @FindBy(xpath = "//input[@name='product-warranty'][@value='1']/..")
    private WebElement clickWarrantyAddTwo;

    public LaptopPage clickWarrantyAddTwo() {
        waitUtilElementToBeVisible(clickWarrantyAddTwo);
        waitUtilElementToBeClickable(clickWarrantyAddTwo);
        clickWarrantyAddTwo.click();
        return this;
    }

    @FindBy(xpath = "//div[@class='product-card-top__buy']//div[contains(@class,'price_active')]")
    private WebElement rememberNewPrice;


    public LaptopPage rememberNewPrice() {
        newPrice= rememberNewPrice.getAttribute("innerText");
        return this;
    }


    @FindBy(xpath = "//div[@class='product-card-top__buy']//button[contains(@class,'button-ui_passive')]")
    private WebElement clickBuy;

    public LaptopPage clickBuy() {
        waitUtilElementToBeClickable(clickBuy);
        clickBuy.click();
        return this;
    }


    @FindBy(xpath = "//form[@class='presearch']//input[@type='search']")
    private WebElement clickSearchDet;

    public ListProductPage clickSearchDet(String nameProductDet) {
        waitUtilElementToBeVisible(clickSearchDet);
        waitUtilElementToBeClickable(clickSearchDet);
        actions.click(clickSearchDet)
                .sendKeys(nameProductDet, Keys.ENTER)
                .build()
                .perform();
        // clickSearchDet.click();
        // String nameProductDet = "Detroit";
        //clickSearchDet.sendKeys(nameProductDet, Keys.ENTER);
        return pageManager.getListProductPage();
    }

    public String getPrice() {
        return price;
    }

    public String getNewPrice() {
        return newPrice;
    }
}
