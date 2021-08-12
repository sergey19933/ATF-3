package org.serg.framework.managers;

import org.serg.framework.pages.*;

public class PageManager {

    /**
     * Менеджер страничек
     */
    private static PageManager pageManager;

    /**
     * Стартовая страничка
     */
    private HomePage homePage;

    /**
     * Страничка с ноутбуком
     */
    private LaptopPage laptopPage;

    /**
     * Страничка списка товаров
     */
    private ListProductPage listProductPage;

    /**
     * Страничка корзины
     */
    private BasketPage basketPage;

    /**
     * Страничка игры
     */
    private DetroitPage detroitPage;

    /**
     * Конструктор специально был объявлен как private (singleton паттерн)
     *
     * @see PageManager#getPageManager()
     */
    private PageManager() {
    }

    /**
     * Ленивая инициализация PageManager
     *
     * @return PageManager
     */
    public static PageManager getPageManager() {
        if (pageManager == null) {
            pageManager = new PageManager();
        }
        return pageManager;
    }

    /**
     * Ленивая инициализация {@link HomePage}
     *
     * @return homePage
     */
    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    /**
     * Ленивая инициализация {@link LaptopPage}
     *
     * @return laptopPage
     */
    public LaptopPage getLaptopPage() {
        if (laptopPage == null) {
            laptopPage = new LaptopPage();
        }
        return laptopPage;
    }

    /**
     * Ленивая инициализация {@link ListProductPage}
     *
     * @return listProductPage
     */
    public ListProductPage getListProductPage() {
        if (listProductPage == null) {
            listProductPage = new ListProductPage();
        }
        return listProductPage;
    }

    /**
     * Ленивая инициализация {@link BasketPage}
     *
     * @return basketPage
     */
    public BasketPage getBasketPage() {
        if (basketPage == null) {
            basketPage = new BasketPage();
        }
        return basketPage;
    }
    /**
     * Ленивая инициализация {@link BasketPage}
     *
     * @return detroitPage
     */
    public DetroitPage getDetroitPage() {
        if (detroitPage == null) {
            detroitPage = new DetroitPage();
        }
        return detroitPage;
    }


}


