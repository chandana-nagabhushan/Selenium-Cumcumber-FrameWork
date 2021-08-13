package StepDefinations;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObject.CalculatorPage;
import utilities.BaseClass;

@RunWith(Cucumber.class)
public class StepDefination extends BaseClass {
	CalculatorPage pageObject;

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {

		openBrowser();
		wait = new WebDriverWait(driver,10);
		pageObject = new CalculatorPage(driver);

	}

	@Then("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_something_site(String url) throws Throwable {

		driver.get(appUrl + url);
		waitForPageLoad();

	}

	@And("^Verify that borrow amount is \"([^\"]*)\" $")
	public void verify_that_borrow_amount_is_something(String strArg1) throws Throwable {
		System.out.print("reached" + strArg1);

	}

	@And("^Select application type as \"([^\"]*)\"$")
	public void select_application_type_as(String input) throws Throwable {

		if (input.equalsIgnoreCase("Single")) {
			click(pageObject.getApplicationType_single());
		} else
			click(pageObject.getApplicationType_joint());
	}

	@And("^Select property to live in as \"([^\"]*)\"$")
	public void select_property_to_live_in_as(String input) throws Throwable {
		if (input.equalsIgnoreCase("Home to Live in")) {
			click(pageObject.getBorrow_type_home());
		} else
			click(pageObject.getBorrow_type_investment());
	}

	@And("^Select  \"([^\"]*)\" dependants from Dropdown$")
	public void select_something_dependants_from_dropdown(String input) throws Throwable {
		if (isPresentAndDisplayed(pageObject.getDependant_selectionBox())) {
			Select ele = new Select(pageObject.getDependant_selectionBox());
			ele.selectByVisibleText(input);
		}

	}

	@And("^Enter  \"([^\"]*)\" in Your income \\(before tax\\) input field$")
	public void enter_something_in_your_income_before_tax_input_field(String input) throws Throwable {
		enterData(pageObject.getIncome_textBox(), input);

	}

	@And("^Enter  \"([^\"]*)\" in Your Other income input field$")
	public void enter_something_in_your_other_income_input_field(String input) throws Throwable {
		enterData(pageObject.getOtherIncome_textBox(), input);

	}

	@And("^Enter  \"([^\"]*)\" in  Living expenses input field$")
	public void enter_something_in_living_expenses_input_field(String input) throws Throwable {
		enterData(pageObject.getLivingExpense_textBox(), input);

	}

	@And("^Enter  \"([^\"]*)\" in  Current home loan repayments  input field$")
	public void enter_something_in_current_home_loan_repayments_input_field(String input) throws Throwable {
		enterData(pageObject.getHomeLoan_textBox(), input);

	}

	@And("^Enter  \"([^\"]*)\" in  Other loan repayments input field$")
	public void enter_something_in_other_loan_repayments_input_field(String input) throws Throwable {
		enterData(pageObject.getLoan_repayments_textBox(), input);

	}

	@And("^Enter  \"([^\"]*)\" in  Other commitments input field$")
	public void enter_something_in_other_commitments_input_field(String input) throws Throwable {
		enterData(pageObject.getOther_commitments_textBox(), input);

	}

	@And("^Enter  \"([^\"]*)\" in  Total credit card limits input field$")
	public void enter_something_in_total_credit_card_limits_input_field(String input) throws Throwable {
		enterData(pageObject.getCreditCard_textBox(), input);

	}

	@Then("^Verify that borrow amount is \"([^\"]*)\"$")
	public void verify_that_borrow_amount_is(String expected) throws Throwable {
		// wait until text changes
		wait.until(ExpectedConditions.textToBePresentInElement(pageObject.getBorrowResultTextAmount(), expected));
		System.out.println("Actual" + getText(pageObject.getBorrowResultTextAmount()));
		assertText(pageObject.getBorrowResultTextAmount(), expected, "Borrow ammount shown on UI is not as expected");
	}

	@When("^User submits the details$")
	public void user_submits_the_details() throws Throwable {
		click(pageObject.getBorrowCalculator_button());
	}

	@When("^User Clicks on ‘start over’ button$")
	public void user_Clicks_on_start_over_button() throws Throwable {
		click(pageObject.getReset_button());
	}

	@And("^form is cleared$")
	public void form_is_cleared() throws Throwable {

		Assert.assertTrue(getText(pageObject.getIncome_textBox()).isBlank());
		Assert.assertTrue(getText(pageObject.getOtherIncome_textBox()).isBlank());
		Assert.assertTrue(getText(pageObject.getLivingExpense_textBox()).isBlank());
		Assert.assertTrue(getText(pageObject.getHomeLoan_textBox()).isBlank());
		Assert.assertTrue(getText(pageObject.getLoan_repayments_textBox()).isBlank());
		Assert.assertTrue(getText(pageObject.getOther_commitments_textBox()).isBlank());
		Assert.assertTrue(getText(pageObject.getCreditCard_textBox()).isBlank());

		if (isPresentAndDisplayed(pageObject.getDependant_selectionBox())) {
			Select ele = new Select(pageObject.getDependant_selectionBox());
			Assert.assertEquals("0", ele.getFirstSelectedOption().getText());
		}
	}

	@Then("^Verify the Error Message is \"([^\"]*)\"$")
	public void verify_the_Error_Message_is(String expected) throws Throwable {
		assertText(pageObject.getBorrow__error__text(), expected, "Error Message is not as Expected");
	}

}
