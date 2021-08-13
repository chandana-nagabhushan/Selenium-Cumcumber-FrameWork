package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
    WebDriver driver;
	public CalculatorPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "label[for='application_type_single']")
	WebElement applicationType_single;

	@FindBy(css = "label[for='application_type_joint']")
	WebElement applicationType_joint;

	@FindBy(css = "label[for='borrow_type_home']")
	WebElement borrow_type_home;

	@FindBy(css = "label[for='borrow_type_investment']")
	WebElement borrow_type_investment;

	@FindBy(css = ".borrow__error__text")
	WebElement borrow__error__text;

	@FindBy(xpath = "//lable[@for=‘borrow_type_home']/ancestor::li")
	WebElement borrowType_home;

	@FindBy(xpath = "//input[@aria-labelledby='q3q1']")
	WebElement livingExpense_textBox;

	@FindBy(xpath = "//div[@class='borrow__question__answer borrow__question__answer--select']/select")
	WebElement dependant_selectionBox;

	@FindBy(css = ".borrow__question__answer.borrow__question__answer--select")
	WebElement dependant_box;

	@FindBy(xpath = "//input[@aria-labelledby='q3q2']")
	WebElement homeLoan_textBox;

	@FindBy(xpath = "//input[@aria-labelledby='q2q1']")
	WebElement income_textBox;

	@FindBy(xpath = "//input[@aria-labelledby='q2q2']")
	WebElement otherIncome_textBox;

	@FindBy(xpath = "//input[@aria-labelledby='q3q3']")
	WebElement loan_repayments_textBox;

	@FindBy(xpath = "//input[@aria-labelledby='q3q4']")
	WebElement other_commitments_textBox;

	@FindBy(xpath = "//input[@aria-labelledby='q3q5']")
	WebElement creditCard_textBox;

	@FindBy(id = "btnBorrowCalculater")
	WebElement borrowCalculator_button;

	@FindBy(xpath = "//div[@class='borrow__result text--white clearfix']//button[@class='start-over']")
	WebElement reset_button;

	@FindBy(id = "borrowResultTextAmount")
	WebElement borrowResultTextAmount;
	
	
	public WebElement getApplicationType_single() {
		return applicationType_single;
	}

	public WebElement getDependant_selectionBox() {
		return dependant_selectionBox;
	}

	public WebElement getBorrowType_home() {
		return borrowType_home;
	}

	public WebElement getIncome_textBox() {
		return income_textBox;
	}

	public WebElement getOtherIncome_textBox() {
		return otherIncome_textBox;
	}

	public WebElement getLoan_repayments_textBox() {
		return loan_repayments_textBox;
	}

	public WebElement getOther_commitments_textBox() {
		return other_commitments_textBox;
	}

	public WebElement getCreditCard_textBox() {
		return creditCard_textBox;
	}

	public WebElement getBorrowCalculator_button() {
		return borrowCalculator_button;
	}

	public WebElement getReset_button() {
		return reset_button;
	}

	public WebElement getLivingExpense_textBox() {
		return livingExpense_textBox;
	}

	public WebElement getHomeLoan_textBox() {
		return homeLoan_textBox;
	}

	public WebElement getBorrowResultTextAmount() {
		return borrowResultTextAmount;
	}

	public WebElement getApplicationType_joint() {
		return applicationType_joint;
	}

	public WebElement getBorrow_type_home() {
		return borrow_type_home;
	}

	public WebElement getBorrow__error__text() {
		return borrow__error__text;
	}

	public WebElement getBorrow_type_investment() {
		return borrow_type_investment;
	}

	public WebElement getDependant_box() {
		return dependant_box;
	}

	

}
