package org.serg.framework.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.serg.framework.base.BasePage;

public class BasketPage extends BasePage {

    private String priceLapBasket;
    private String priceDetBasket;
    private String sumBasketBasket;
    private String sumAllDiff;
    private String price3xProductStr;
    private String allSumNewBasketFinalS;


    @FindBy(xpath = "//div[contains(@class,'warranties-row__radio')]//span[contains(@class,'icon_checked')]")
    private WebElement checkWarrantyLap;

    public BasketPage checkWarrantyLap() {
        // Assertions.assertEquals("Игра Detroit: Стать человеком (PS4)", checkWarrantyLap.getText(), "Не та страница");
        Assertions.assertFalse(driverManager.getDriver().findElements(By.xpath("//div[contains(@class,'warranties-row__radio')]//span[contains(@class,'icon_checked')]")).size() == 0, "Гарантия не выбрана");
        return this;
    }

    @FindBy(xpath = "//a[contains(text(),'MSI GF65 10UE-065XRU')]//../../../..//..//span[@class='price__current']")
    private WebElement checkPriceLap;

    public BasketPage checkPriceLap() {
        priceLapBasket = checkPriceLap.getAttribute("innerText");
        checkPriceProduct(pageManager.getLaptopPage().getPrice(), priceLapBasket);
        return this;

    }


    @FindBy(xpath = "//a[contains(text(),'Игра Detroit: Стать человеком (PS4)')]//../../../..//..//span[@class='price__current']")
    private WebElement checkPriceDet;

    public BasketPage checkPriceDet() {
        scrollToElementJs(checkPriceDet);
        priceDetBasket = checkPriceDet.getAttribute("innerText");
        checkPriceProduct(pageManager.getDetroitPage().getPriceDet(), priceDetBasket);
        return this;
    }

    @FindBy(xpath = "//div[@class='total-amount']//span[@class='price__current']")
    private WebElement checkSumBasket;

    public BasketPage checkSumBasket() {
        sumBasketBasket = checkSumBasket.getAttribute("innerText");
        checkPriceProduct(pageManager.getDetroitPage().getAllSum(), sumBasketBasket);
        return this;
    }

    @FindBy(xpath = "//div[@class='accessories__slider-wrapper']")
    private WebElement scrollDet;

    public BasketPage scrollDet() {
        scrollToElementJs(scrollDet);
        return this;
    }

    @FindBy(xpath = "//a[contains(text(),'Игра Detroit')]/../..//button[text()='Удалить']")
    private WebElement deleteProductDet;

    public BasketPage deleteProductDet() {
        waitUtilElementToBeVisible(deleteProductDet);
        waitUtilElementToBeClickable(deleteProductDet);
       // deleteProductDet.click();
        actions.click(deleteProductDet).pause(2000).build().perform();
        return this;
    }

    @FindBy(xpath = "//span[@class='cart-link__price']")
    private WebElement checkVisibleDet;

    public BasketPage checkVisibleDetAndCheckPrice() {
        //actions.pause(2000).build().perform();
        //проверка что нет товара
        elementIsNotPresent("//a[contains(text(),'Игра Detroit')]");
        sumAllDiff = checkVisibleDet.getAttribute("innerText");

       // actions.pause(2000).build().perform();
        difference(sumAllDiff, pageManager.getDetroitPage().getPriceDet(), pageManager.getDetroitPage().getAllSum());
        return this;
    }


    @FindBy(xpath = "//h1[text()='Корзина']")
    private WebElement scrollPage;

    public BasketPage scrollPage() {
        scrollToElementJs(scrollPage);
        waitUtilElementToBeVisible(scrollPage);
      //  actions.pause(5000).build().perform();
        return this;
    }

    @FindBy(xpath = "//button[contains(@class,'button_plus')]")
    private WebElement addProduct;

    public BasketPage addProduct() {
        waitUtilElementToBeClickable(addProduct);
        // addProduct.click();
        actions.click(addProduct).pause(5000).build().perform();
        actions.click(addProduct).pause(5000).build().perform();
        //addProduct.click();
        return this;
    }


    @FindBy(xpath = "//div[@class='header-top']")
    private WebElement scrProduct;

    public BasketPage scrProduct() {
        scrollToElementJs(scrProduct);
        waitUtilElementToBeVisible(scrProduct);
        return this;
    }

    @FindBy(xpath = "//div[@class='total-amount']//span[@class='price__current']")
    private WebElement checkPrice3xProduct;

    public BasketPage checkPrice3xProductM() {
       // actions.pause(4000).build().perform();
        price3xProductStr = checkPrice3xProduct.getAttribute("innerText");

        checkPrice3xProduct(pageManager.getLaptopPage().getNewPrice(), price3xProductStr);
        return this;
    }

    @FindBy(xpath = "//button[contains(@class,'item_print-basket')]/..//span[@class='restore-last-removed']")
    private WebElement returnDeleteProduct;

    public BasketPage returnDeleteProduct() {
        actions.click(returnDeleteProduct).pause(2000).build().perform();

        return this;
    }

    @FindBy(xpath = "//a[contains(text(),'Игра Detroit')]")
    private WebElement assertVisibleDetroit;

    public BasketPage assertVisibleDetroit() {
        waitUtilElementToBeClickable(assertVisibleDetroit);
        Assertions.assertFalse(driverManager.getDriver().findElements(By.xpath("//a[contains(text(),'Игра Detroit')]")).size() == 0, "Товар не найден");
        actions.pause(2000).build().perform();
        return this;
    }

    @FindBy(xpath = "//span[@class='cart-link__price']")
    private WebElement allSumNewBasketFinal;

    public BasketPage checkAllSumNewBasketFinal() {
        allSumNewBasketFinalS = allSumNewBasketFinal.getAttribute("innerText");
        differenceDetr(allSumNewBasketFinalS, pageManager.getLaptopPage().getNewPrice(), pageManager.getDetroitPage().getPriceDet());
        return this;
    }


    /**
     * @param priceProduct-цена до корзины
     * @param elementBas-цена   в корзине
     */
    private void checkPriceProduct(String priceProduct, String elementBas) {
        int priceProductInt = Integer.parseInt(priceProduct.replaceAll("\\D*", ""));
        int priceLaptopIntBasket = Integer.parseInt(elementBas.replaceAll("\\D*", ""));
        Assertions.assertEquals(priceProductInt, priceLaptopIntBasket, "Не совпадает");
    }

    /**
     * @param sumAllDiff-общая  цена товара после удаления
     * @param priceDetroit-цена игры
     * @param sumAll-общая      сумма покупки до удаления
     */
    private void difference(String sumAllDiff, String priceDetroit, String sumAll) {
        int priceIntBasket = Integer.parseInt(sumAllDiff.replaceAll("\\D*", ""));
        int priceDetroitInt = Integer.parseInt(priceDetroit.replaceAll("\\D*", ""));
        int allPrice = Integer.parseInt(sumAll.replaceAll("\\D*", ""));
        int difference = allPrice - priceIntBasket;


        Assertions.assertEquals(difference, priceDetroitInt, "Не совпадает");
    }


    /**
     * @param priceProduct-цена         до корзины
     * @param priceProductBasket3x-цена в корзине
     */
    private void checkPrice3xProduct(String priceProduct, String priceProductBasket3x) {
        int priceProductInt = Integer.parseInt(priceProduct.replaceAll("\\D*", "")) * 3;
        int priceLaptopInt3x = Integer.parseInt(priceProductBasket3x.replaceAll("\\D*", ""));
        Assertions.assertEquals(priceProductInt, priceLaptopInt3x, "Не совпадает");
    }


    /**
     * @param checkAllSumNewBasketFinal-общая цена товара в корзине
     * @param priceDetroit-цена               игры
     * @param newPrice-цена                   трех товаров
     */
    private void differenceDetr(String checkAllSumNewBasketFinal, String newPrice, String priceDetroit) {
        int priceIntBasket = Integer.parseInt(checkAllSumNewBasketFinal.replaceAll("\\D*", ""));
        int newPriceInt = Integer.parseInt(newPrice.replaceAll("\\D*", "")) * 3;
        int priceDetroitInt = Integer.parseInt(priceDetroit.replaceAll("\\D*", ""));
        int difference = priceIntBasket - newPriceInt;


        Assertions.assertEquals(difference, priceDetroitInt, "Не совпадает");
    }


    public String getPriceLapBasket() {
        return priceLapBasket;
    }

    public String getPriceDetBasket() {
        return priceDetBasket;
    }

    public String getSumBasketBasket() {
        return sumBasketBasket;
    }

    public String getSumAllDiff() {
        return sumAllDiff;
    }

    public String getPrice3xProductStr() {
        return price3xProductStr;
    }

    public String getAllSumNewBasketFinalS() {
        return allSumNewBasketFinalS;
    }
}
