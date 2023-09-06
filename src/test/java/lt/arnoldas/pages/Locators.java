package lt.arnoldas.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Varle {
        public static class VarleBasket{

            public static By removeItemButton = By.xpath("//a[@class='remove']");
        }


        public static class VarleLogin {
            public static By buttonRegister = By.xpath("//*[@class='register']");
            public static By fieldUserId = By.xpath("//*[@id='id_username']");
            public static By fieldUserPassword = By.xpath("//*[@id='id_password']");
            public static By buttonLogIn = By.xpath("//*[@class='button']");
        }

        public static class VarleSearch {
            public static By searchField = By.xpath("//input[@name='q']");
            public static By searchArrow = By.xpath("//*[@alt='search']");
            public static By itemsOfSearchResult = By.xpath("//div[@class='product-title']//a");
            public static By buttonToAddToBasket = By.xpath("(//*[@class='PRODUCT_ADD_TO_CART_BLOCK'])[1]");
            public static By buttonToBuy = By.xpath("//button[@class='primary-button']");
        }

        public static class VarleWishlist {

            public static By loginHeader = By.xpath("//*[@id='login_header']");
            public static By heartIcons = By.xpath("//*[@class='product-like ']");
            public static By favouritesButton = By.xpath("//*[@alt='wishlist']");
            public static By favoriteItemList = By.xpath("//*[@class='item']");
            public static By unfavouriteButton = By.xpath("//span[@class='cross wlist']");
        }
    }
}
