package org.serg.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.serg.framework.base.BasePage;

public class ListProductPage extends BasePage {


    @FindBy(xpath = "//span[contains(text(),'Ноутбук MSI GF65 10UE-065XRU')]")
    private WebElement clickProduct;

    public LaptopPage clickProduct() {
        waitUtilElementToBeClickable(clickProduct);
        // actions.click(clickProduct);
        clickProduct.click();
        return pageManager.getLaptopPage();
    }


    @FindBy(xpath = "//span[contains(text(),'Игра Detroit')]")
    private WebElement clickProductDet;

    public DetroitPage clickProductDet() {
        waitUtilElementToBeClickable(clickProductDet);
        //actions.click(clickProductDet);
        clickProductDet.click();
        return pageManager.getDetroitPage();
    }


}
