package org.serg.framework.pages;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.serg.framework.base.BasePage;

public class DetroitPage extends BasePage {

    private String allSum;
    private String priceDet;


    @FindBy(xpath = "//h1")
    private WebElement checkingThePageDet;

    @FindBy(xpath = "//div[@class='product-buy__price']")
    private WebElement rememberPriceDet;

    @FindBy(xpath = "//div[@class='product-card-top__buy']//button[contains(@class,'button-ui_passive')]")
    private WebElement clickBuyDet;

    @FindBy(xpath = "//span[@class='cart-link__price']")
    private WebElement allSumBasket;

    @FindBy(xpath = "//span[@class='cart-link__price']")
    private WebElement goBasket;






    @Step("Проверка страницы с игрой")
    public DetroitPage checkingThePageDet() {
        Assertions.assertEquals("Игра Detroit: Стать человеком (PS4)", checkingThePageDet.getText(), "Не та страница");
        return this;
    }


    @Step("Запоминаем цену игры")
    public DetroitPage rememberPriceDet() {
        priceDet=rememberPriceDet.getAttribute("innerText");
        return this;
    }



    @Step("Покупаем товар")
    public DetroitPage clickBuyDet() {
        waitUtilElementToBeClickable(clickBuyDet);
        clickBuyDet.click();
        actions.pause(2000).build().perform();
        return this;
    }


    @Step("Запоминаем цену")
    public DetroitPage allSum() {
        waitUtilElementToBeClickable(allSumBasket);
        allSum = allSumBasket.getAttribute("innerText");
        return this;
    }

    @Step("Проверка суммы корзины ")
    public DetroitPage allSumBasket() {
        waitUtilElementToBeClickable(allSumBasket);
        sum(pageManager.getLaptopPage().getNewPrice(), priceDet, allSum);

        return this;
    }


    @Step("Переход на страницу корзина")
    public BasketPage goBasket() {
        waitUtilElementToBeVisible(goBasket);
        waitUtilElementToBeClickable(goBasket);
        goBasket.click();
        return pageManager.getBasketPage();
    }


    /**
     * @param priceLaptop-цена  ноутбука
     * @param priceDetroit-цена игры
     * @param sumAll-общая      сумма покупки
     */
    private void sum(String priceLaptop, String priceDetroit, String sumAll) {
        int priceLaptopInt = Integer.parseInt(priceLaptop.replaceAll("\\D*", ""));
        int priceDetroitInt = Integer.parseInt(priceDetroit.replaceAll("\\D*", ""));
        int allPrice = Integer.parseInt(sumAll.replaceAll("\\D*", ""));
        int sum = priceLaptopInt + priceDetroitInt;
        System.out.println(allPrice + "Цена всей суммы");
        System.out.println("Вся цена:" + allPrice + "||" + "Сумма:" + sum);

        Assertions.assertEquals(sum, allPrice, "Не совпадает");
    }


    public String getAllSum() {
        return allSum;
    }

    public String getPriceDet() {
        return priceDet;
    }
}



