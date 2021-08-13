package utilities;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public Properties prop;
	static String path = "/Resources/Config.properties";
	public static String browserName = PropertyFileReader.getPropertyValue(path, "browser");
	public static String appUrl = PropertyFileReader.getPropertyValue(path, "url");
	public static WebDriver driver;
	public static WebDriverWait wait ;

	/**
	 * 
	 * Initialize Browser
	 * 
	 * @return
	 */

	public void openBrowser() {

		driver = new BrowserFactory().initializeBrowser();

	}

	/**
	 * waiting for the page to load
	 */
	public void waitForPageLoad() {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
						.equals("complete");
			}
		};
		try {
			wait.until(expectation);
		} catch (Throwable error) {
			// LOGGER.ERROR("Timeout waiting for Page Load Request to complete.");
		}
	}

	/**
	 * Function to check any element is present and displayed in UI
	 * 
	 * @param ele
	 * @return boolean
	 */
	public static boolean isPresentAndDisplayed(WebElement ele) {

		try {
			if (ele.isDisplayed())
				return true;
		} catch (NoSuchElementException e) {
			System.out.println(e.toString());
		} catch (StaleElementReferenceException e) {
			System.out.println(e.toString());
		}
		return false;
	}

	/**
	 * Function to check the element is selected
	 */
	public static boolean isPresentAndSelected(WebElement ele) {

		try {
			if (ele.isSelected())
				return true;
			else
				return false;
		} catch (NoSuchElementException e) {
			System.out.println(e.toString());
			return false;
		}

	}

	/**
	 * Function to check the element is selected if not select the element
	 */
	public static void click(WebElement ele) {

		if (!isPresentAndSelected(ele)) {
			if (isPresentAndDisplayed(ele)) {
				ele.click();

			}
		}

	}

	/**
	 * Function to check the element is selected if not select the element
	 */
	public static String getText(WebElement ele) {

		if (isPresentAndDisplayed(ele)) {
			return ele.getText();

		}
		return null;
	}

	/**
	 * Function to check the element is selected if not select the element
	 */
	public static void enterData(WebElement ele, String input) {

		if (isPresentAndDisplayed(ele)) {
			ele.sendKeys(input);

		}

	}

	/**
	 * Function to check if text in the element is as expected
	 */
	public static void assertText(WebElement ele, String expected, String message) {

		String Actual = ele.getText();
		Assert.assertEquals(expected, Actual.trim());

	}

}
