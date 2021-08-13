package org.serg.framework.pages;

import io.qameta.allure.Step;
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

    @FindBy(xpath = "//div[@class='product-buy__price']")
    private WebElement rememberPrice;

    @FindBy(xpath = "//div[contains(@class,'additional')][contains(text(),'Гарантия')]")
    private WebElement clickWarranty;

    @FindBy(xpath = "//input[@name='product-warranty'][@value='1']/..")
    private WebElement clickWarrantyAddTwo;

    @FindBy(xpath = "//div[@class='product-card-top__buy']//div[contains(@class,'price_active')]")
    private WebElement rememberNewPrice;

    @FindBy(xpath = "//div[@class='product-card-top__buy']//button[contains(@class,'button-ui_passive')]")
    private WebElement clickBuy;

    @FindBy(xpath = "//form[@class='presearch']//input[@type='search']")
    private WebElement clickSearchDet;


    @Step("Проверка страницы ноутбук")
    public LaptopPage checkingPage() {
        Assertions.assertEquals("15.6\" Ноутбук MSI GF65 10UE-065XRU черный"
                , checkingThePage.getText(), "Не та страница");
        return this;
    }


    @Step("Запоминаем цену ноутбука")
    public LaptopPage rememberPrice() {
        price = rememberPrice.getAttribute("innerText");
        return this;
    }

    @Step("Переходим в гарантию")
    public LaptopPage clickWarranty() {
        waitUtilElementToBeClickable(clickWarranty);
        clickWarranty.click();
        return this;
    }

    @Step("Выбираем два года гарантии")
    public LaptopPage clickWarrantyAddTwo() {
        waitUtilElementToBeVisible(clickWarrantyAddTwo);
        waitUtilElementToBeClickable(clickWarrantyAddTwo);
        clickWarrantyAddTwo.click();
        return this;
    }

    @Step("Запоминаем новую цену игры")
    public LaptopPage rememberNewPrice() {
        newPrice = rememberNewPrice.getAttribute("innerText");
        return this;
    }

    @Step("Покупаем товар")
    public LaptopPage clickBuy() {
        waitUtilElementToBeClickable(clickBuy);
        clickBuy.click();
        return this;
    }

    @Step("Вбиваем в поиск '{nameProductDet}' и переходим на страницу списка товаров")
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
