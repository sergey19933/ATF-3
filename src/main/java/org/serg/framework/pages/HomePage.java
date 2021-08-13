package org.serg.framework.pages;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.serg.framework.base.BasePage;
import org.serg.framework.managers.DriverManager;

public class HomePage extends BasePage {


    @FindBy(xpath = "//a[@class='btn btn-additional']")
    private WebElement clickCity;


    @FindBy(xpath = "//form[@class='presearch']//input[@type='search']")
    private WebElement clickSearch;


    @Step("Подтверждение города")
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

    @Step("Вбиваем в поиск '{nameProduct}' и переходим на страницу списка товаров")
    public ListProductPage clickSearchProduct(String nameProduct) {
        waitUtilElementToBeClickable(clickSearch);


//        Allure.getLifecycle().addAttachment("Scrin", "image/png", null
//                , ((TakesScreenshot) DriverManager.getDriverManager())
//                        .getScreenshotAs(OutputType.BYTES));


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
