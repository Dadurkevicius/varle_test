package lt.arnoldas.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Varle{
        public static class VarleLogin{
            public static By buttonRegister = By.xpath("//*[@class='register']");
            public static By fieldUserId = By.xpath("//*[@id='id_username']");
            public static By fieldUserPassword = By.xpath("//*[@id='id_password']");
            public static By buttonLogIn = By.xpath("//*[@class='button']");
        }
    }
}
