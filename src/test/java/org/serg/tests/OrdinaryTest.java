package org.serg.tests;

import org.junit.jupiter.api.Test;
import org.serg.tests.base.BaseTests;


public class OrdinaryTest extends BaseTests {
    /**
     * Заходим на страницу "ипотека"
     * Проверить что находимся именно на этой странице
     */

    @Test
    public void testScenario() {

        /**
         * Подтверждения города
         */

        app.getHomePage().clickCity()
                .clickSearchProduct("ноутбук msi")
                .clickProduct()
                .checkingPage()
                .rememberPrice()
                .clickWarranty()
                .clickWarrantyAddTwo()
                .rememberNewPrice()
                .clickBuy()
                .clickSearchDet("Detroit")
                .clickProductDet()
                .rememberPriceDet()
                .checkingThePageDet()
                .clickBuyDet()
                .allSum()
                .allSumBasket()
                .goBasket()
                .checkWarrantyLap()
                .checkPriceLap()
                .checkPriceDet()
                .checkSumBasket()
                .scrollDet()
                .deleteProductDet()
                .checkVisibleDetAndCheckPrice()
                .scrollPage()
                .addProduct()
                .scrProduct()
                .checkPrice3xProductM()
                .returnDeleteProduct()
                .assertVisibleDetroit()
                .checkAllSumNewBasketFinal();


        /**
         * Вбиваем в поиск
         * Вводим название товара
         */
//        homePage.clickSearch();

//-------------------------------------
//        /**
//         * Заходим в товар
//         */
//        String clickProductXPath = "//span[contains(text(),'Ноутбук MSI GF65 10UE-065XRU')]";
//        WebElement clickProduct = driver.findElement(By.xpath(clickProductXPath));
//        waitUtilElementToBeClickable(clickProduct);
//        clickProduct.click();

        //  listProductPage.clickProduct();


//-------------------------------------
//        /**
//         * Проверить что находимся именно на странице с товаром
//         */
//        String checkingThePageXPath = "//h1";
//        WebElement checkingThePage = driver.findElement(By.xpath(checkingThePageXPath));
//        Assertions.assertEquals("15.6\" Ноутбук MSI GF65 10UE-065XRU черный", checkingThePage.getText(), "Не та страница");

        //  laptopPage.checkingPage();
//-------------------------------------
//        /**
//         * Запоминаем цену на товар
//         */
//        String rememberPriceXPath = "//div[@class='product-buy__price']";
//        WebElement rememberPrice = driver.findElement(By.xpath(rememberPriceXPath));
//        String price = rememberPrice.getAttribute("innerText");

        //  laptopPage.rememberPrice();

//--------------------------------------
//        /**
//         * Кликнуть гарантия
//         */
//        String clickWarrantyXPath = "//div[contains(@class,'additional')][contains(text(),'Гарантия')]";
//        WebElement clickWarranty = driver.findElement(By.xpath(clickWarrantyXPath));
//        waitUtilElementToBeClickable(clickWarranty);
//        clickWarranty.click();
//        time();

        //   laptopPage.clickWarranty();


//--------------------------------------
//        /**
//         * Выбрать Доп.гарантия - выбрать 2 года
//         */
//        String clickWarrantyAddTwoXPath = "//input[@name='product-warranty'][@value='1']/..";
//        WebElement clickWarrantyAddTwo = driver.findElement(By.xpath(clickWarrantyAddTwoXPath));
//        waitUtilElementToBeVisible(By.xpath(clickWarrantyAddTwoXPath));
//        waitUtilElementToBeClickable(clickWarrantyAddTwo);
//        clickWarrantyAddTwo.click();

        // laptopPage.clickWarrantyAddTwo();

//--------------------------------------
//        /**
//         * Запоминаем новую цену на товар
//         */
//        String rememberNewPriceXPath = "//div[@class='product-card-top__buy']//div[contains(@class,'price_active')]";
//        WebElement rememberNewPrice = driver.findElement(By.xpath(rememberNewPriceXPath));
//        String newPrice = rememberNewPrice.getAttribute("innerText");

        // laptopPage.rememberNewPrice();

//--------------------------------------
//        /**
//         * Кликнуть купить
//         */
//        String clickBuyXPath = "//div[@class='product-card-top__buy']//button[contains(@class,'button-ui_passive')]";
//        WebElement clickBuy = driver.findElement(By.xpath(clickBuyXPath));
//        waitUtilElementToBeClickable(clickBuy);
//        clickBuy.click();

        //   laptopPage.clickBuy();
//--------------------------------------
        //работа с детройт
//--------------------------------------

//        /**
//         * Заходим в поиск
//         * Вводим название товара detr
//         */
//        String clickSearchDetXPath = "//form[@class='presearch']//input[@type='search']";
//        WebElement clickSearchDet = driver.findElement(By.xpath(clickSearchDetXPath));
//        waitUtilElementToBeVisible(By.xpath(clickSearchDetXPath));
//        waitUtilElementToBeClickable(clickSearchDet);
//        clickSearchDet.click();
//        String nameProductDet = "Detroit";
//        clickSearchDet.sendKeys(nameProductDet, Keys.ENTER);

        // laptopPage.clickSearch();

//-------------------------------------
//        /**
//         * Заходим в товар dert
//         */
//        String clickProductDetXPath = "//span[contains(text(),'Игра Detroit')]";
//        WebElement clickProductDet = driver.findElement(By.xpath(clickProductDetXPath));
//        waitUtilElementToBeClickable(clickProductDet);
//        clickProductDet.click();

        //  listProductPage.clickProductDet();
//-------------------------------------
//        /**
//         * Проверить что находимся именно на странице с товаром dert
//         */
//        String checkingThePageDetXPath = "//h1";
//        WebElement checkingThePageDet = driver.findElement(By.xpath(checkingThePageDetXPath));
//        Assertions.assertEquals("Игра Detroit: Стать человеком (PS4)", checkingThePageDet.getText(), "Не та страница");
        // detroitPage.checkingThePageDet();

//-------------------------------------
//        /**
//         * Запоминаем цену на товар detr
//         */
//        String rememberPriceDetXPath = "//div[@class='product-buy__price']";
//        WebElement rememberPriceDet = driver.findElement(By.xpath(rememberPriceDetXPath));
//        String priceDet = rememberPriceDet.getAttribute("innerText");

        // detroitPage.rememberPriceDet();

//--------------------------------------
//        /**
//         * Кликнуть купить detr
//         */
//        String clickBuyDetXPath = "//div[@class='product-card-top__buy']//button[contains(@class,'button-ui_passive')]";
//        WebElement clickBuyDet = driver.findElement(By.xpath(clickBuyDetXPath));
//        waitUtilElementToBeClickable(clickBuyDet);
//        clickBuyDet.click();

        // detroitPage.clickBuyDet();

//--------------------------------------

        /**
         * Проверка цены
         */
//        Actions actions = new Actions(driver);
//        actions.pause(2000).build().perform();
//
//        String allSumBasketXPath = "//span[@class='cart-link__price']";
//        WebElement allSumBasket = driver.findElement(By.xpath(allSumBasketXPath));
//        String allSum = allSumBasket.getAttribute("innerText");
//        System.out.println("Цена кор" + allSum);
//        //проверка
//        sum(newPrice, priceDet, allSum);

        //  detroitPage.allSumBasket(laptopPage.getPrice(), detroitPage.getPrice());


//--------------------------------------
        // корзина
//--------------------------------------
//        /**
//         * Перейти в корзину
//         */
//        String goBasketDetXPath = "//span[@class='cart-link__price']";
//        WebElement goBasketDet = driver.findElement(By.xpath(goBasketDetXPath));
//        waitUtilElementToBeVisible(By.xpath(goBasketDetXPath));
//        waitUtilElementToBeClickable(goBasketDet);
//        goBasketDet.click();

        //  detroitPage.goBasket();
//--------------------------------------
//        /**
//         * Проверить гарантию на 2 года
//         * Если ссылки нет, то гарантия не выбрана и тест провален
//         */
//        String checkWarrantyLapXPath = "//div[contains(@class,'warranties-row__radio')]//span[contains(@class,'icon_checked')]";
//        Assertions.assertFalse(driver.findElements(By.xpath(checkWarrantyLapXPath)).size() == 0, "Гарантия не выбрана");
        //  basketPage.checkWarrantyLap();
//--------------------------------------
//        /**
//         * Проверить все цены в корзине
//         */
//        //Ноутбука
//        String checkPriceLapXPath = "//a[contains(text(),'MSI GF65 10UE-065XRU')]//../../../..//..//span[@class='price__current']";
//        WebElement checkPriceLap = driver.findElement(By.xpath(checkPriceLapXPath));
//        String checkPriceLapS=checkPriceLap.getAttribute("innerText");
//        //проверка

        //basketPage.checkPriceLap(laptopPage.getPrice());
//--------------------------------------


//
//        //Детройт
//        String checkPriceDetXPath = "//a[contains(text(),'Игра Detroit: Стать человеком (PS4)')]//../../../..//..//span[@class='price__current']";
//        WebElement checkPriceDet = driver.findElement(By.xpath(checkPriceDetXPath));
//        scrollToElementJs(checkPriceDet);
//        //проверка
//        checkPriceProduct(priceDet, checkPriceDet);
        // basketPage.checkPriceDet(detroitPage.getPrice());

//        //Проверить сумму
//        String checkSumBasketXPath = "//div[@class='total-amount']//span[@class='price__current']";
//        WebElement checkSumBasket = driver.findElement(By.xpath(checkSumBasketXPath));
//        //проверка
//       checkPriceProduct(allSum, checkSumBasket);

        //basketPage.checkSumBasket(detroitPage.getAllSum());

//--------------------------------------
//        /**
//         * скролл до детройта
//         */
//        String scrollDetXPath = "//div[@class='accessories__slider-wrapper']";
//        WebElement scrollDet = driver.findElement(By.xpath(scrollDetXPath));
//        scrollToElementJs(scrollDet);
        //  basketPage.scrollDet();
//--------------------------------------
//        /**
//         * Удалить детройт
//         */
//        String deleteProductDetXPath = "//a[contains(text(),'Игра Detroit')]/../..//button[text()='Удалить']";
//        WebElement deleteProductDet = driver.findElement(By.xpath(deleteProductDetXPath));
//        waitUtilElementToBeVisible(By.xpath(deleteProductDetXPath));
//        waitUtilElementToBeClickable(deleteProductDet);
//        deleteProductDet.click();
//        Actions wait = new Actions(driver);
//        wait.pause(2000).build().perform();

        //basketPage.deleteProductDet();
        //--------------------------------------
//        /**
//         * проверить что Detroit нет больше в корзине и что сумма уменьшилась на цену Detroit
//         *
//         */
//        wait.pause(2000).build().perform();
//        //проверка что нет товара
//        elementIsNotPresent("//a[contains(text(),'Игра Detroit')]");
//
//        //проверка что ценна вычлась
//        WebElement allSumNewBasket = driver.findElement(By.xpath("//span[@class='cart-link__price']"));
//        wait.pause(2000).build().perform();
//        difference(allSumNewBasket, priceDet, allSum);

        // basketPage.checkVisibleDetAndCheckPrice(detroitPage.getPrice(), detroitPage.getAllSum());

//--------------------------------------
//        /**
//         * скролл до верха страницы
//         */
//        String scrollPageXPath = "//h1[text()='Корзина']";
//        WebElement scrollPage = driver.findElement(By.xpath(scrollPageXPath));
//        scrollToElementJs(scrollPage);
//        waitUtilElementToBeVisible(By.xpath(scrollPageXPath));

        //basketPage.scrollPage();
//--------------------------------------
//        /**
//         * добавить еще два ноута
//         */
//        Actions actionsLap = new Actions(driver);
//        actionsLap.pause(5000).build().perform();
//
//        String addProductXPath = "//button[contains(@class,'button_plus')]";
//        WebElement addProduct = driver.findElement(By.xpath(addProductXPath));
//        waitUtilElementToBeClickable(addProduct);
//        addProduct.click();
//        actionsLap.pause(5000).build().perform();
//        addProduct.click();

        // basketPage.addProduct();
//--------------------------------------

//        /**
//         * скролл до вверха
//         */
//        String scrXPath = "//div[@class='header-top']";
//        WebElement scrProduct = driver.findElement(By.xpath(scrXPath));
//        scrollToElementJs(scrProduct);
//        waitUtilElementToBeVisible(By.xpath(scrXPath));

        // basketPage.scrProduct();

//--------------------------------------
//        /**
//         * Проверить что сумма равно трем товарам
//         */
//        WebElement price3xProduct = driver.findElement(By.xpath("//div[@class='total-amount']//span[@class='price__current']"));
//        actionsLap.pause(4000).build().perform();
//        checkPrice3xProduct(newPrice, price3xProduct);

        //   basketPage.checkPrice3xProductM(laptopPage.getPrice());
//--------------------------------------

//        /**
//         * Вернуть удаленый товар
//         */
//        String returnDeleteProductXPath = "//button[contains(@class,'item_print-basket')]/..//span[@class='restore-last-removed']";
//        WebElement returnDeleteProduct = driver.findElement(By.xpath(returnDeleteProductXPath));
//        actionsLap.pause(1000).build().perform();
//        returnDeleteProduct.click();

        // basketPage.returnDeleteProduct();

//проверка что товар появился
        //   Assertions.assertFalse(driver.findElements(By.xpath("//a[contains(text(),'Игра Detroit')]")).size() == 0, "Товар не найден");

        //  basketPage.assertVisibleDetroit();

        // actionsLap.pause(1000).build().perform();
//        WebElement allSumNewBasketFinal = driver.findElement(By.xpath("//span[@class='cart-link__price']"));
//        //проверка цены что добавлен товар
//        differenceDetr(allSumNewBasketFinal, newPrice, priceDet);

        //  basketPage.checkAllSumNewBasketFinal(laptopPage.getNewPrice(), detroitPage.getPrice());

//--------------------------------------


    }
}
