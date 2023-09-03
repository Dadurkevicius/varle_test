package lt.arnoldas.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class Driver {
    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static void setEdge() {
        WebDriverManager.edgedriver().setup();
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--force-device-scale-factor=0.5");

        webDriver.set(new EdgeDriver(options));
        webDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public static void setFirefox() {
        WebDriverManager.firefoxdriver().setup();
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        FirefoxOptions optionsFirefox = new FirefoxOptions();

        webDriver.set(new FirefoxDriver(optionsFirefox));
        webDriver.get().manage().window().maximize();
        webDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

    }

    public static WebDriver getInstance() {
        return webDriver.get();
    }

    public static void quitWebDriver() {
        webDriver.get().quit();
    }
}
