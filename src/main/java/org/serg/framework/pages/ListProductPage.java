package org.serg.framework.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.serg.framework.base.BasePage;

public class ListProductPage extends BasePage {



    @FindBy(xpath = "//span[contains(text(),'Ноутбук MSI GF65 10UE-065XRU')]")
    private WebElement clickProduct;


    @FindBy(xpath = "//span[contains(text(),'Игра Detroit')]")
    private WebElement clickProductDet;


    @Step("Переходим на страницу LaptopPage")

    public LaptopPage clickProduct() {
        waitUtilElementToBeClickable(clickProduct);
        // actions.click(clickProduct);
        clickProduct.click();



        return pageManager.getLaptopPage();
    }


    @Step("Переходим на страницу DetroitPage")
    public DetroitPage clickProductDet() {
        waitUtilElementToBeClickable(clickProductDet);
        //actions.click(clickProductDet);
        clickProductDet.click();
        return pageManager.getDetroitPage();
    }


}
