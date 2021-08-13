package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.support.ThreadGuard;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	public WebDriver initializeBrowser() {

		WebDriver driver = null;
		try {
			if (BaseClass.browserName.equalsIgnoreCase("chrome")) {
				ChromeOptions options = new ChromeOptions();
				options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

				WebDriverManager.chromedriver().setup();
				driver = ThreadGuard.protect(new ChromeDriver(options));

			} else if (BaseClass.browserName.equalsIgnoreCase("ie")) {

				InternetExplorerOptions options = new InternetExplorerOptions();
				options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

				WebDriverManager.iedriver().setup();
				driver = ThreadGuard.protect(new InternetExplorerDriver());

			} else if (BaseClass.browserName.equalsIgnoreCase("firefox")) {

				FirefoxOptions options = new FirefoxOptions();
				options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

				WebDriverManager.firefoxdriver().setup();
				driver = ThreadGuard.protect(new FirefoxDriver(options));

			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return driver;

	}

}
