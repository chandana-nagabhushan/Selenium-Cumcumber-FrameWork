$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("calculatorPage.feature");
formatter.feature({
  "line": 1,
  "name": "Borrow Calculator Validation",
  "description": "",
  "id": "borrow-calculator-validation",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Navigate to \"/personal/home-loans/calculators-tools/much-borrow/\" Site",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.initialize_the_browser_with_chrome()"
});
formatter.result({
  "duration": 2057388260,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/personal/home-loans/calculators-tools/much-borrow/",
      "offset": 13
    }
  ],
  "location": "StepDefination.navigate_to_something_site(String)"
});
formatter.result({
  "duration": 4916359522,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Validate if borrow calculator returns expected results",
  "description": "",
  "id": "borrow-calculator-validation;validate-if-borrow-calculator-returns-expected-results",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Select application type as \"Single\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Select property to live in as \"Home to Live in\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Select  \"0\" dependants from Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Enter  \"80000\" in Your income (before tax) input field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Enter  \"10000\" in Your Other income input field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Enter  \"500\" in  Living expenses input field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Enter  \"0\" in  Current home loan repayments  input field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Enter  \"100\" in  Other loan repayments input field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Enter  \"0\" in  Other commitments input field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Enter  \"10000\" in  Total credit card limits input field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User submits the details",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Verify that borrow amount is \"$507,000\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Single",
      "offset": 28
    }
  ],
  "location": "StepDefination.select_application_type_as(String)"
});
formatter.result({
  "duration": 158828906,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Home to Live in",
      "offset": 31
    }
  ],
  "location": "StepDefination.select_property_to_live_in_as(String)"
});
formatter.result({
  "duration": 144647936,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 9
    }
  ],
  "location": "StepDefination.select_something_dependants_from_dropdown(String)"
});
formatter.result({
  "duration": 75366890,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "80000",
      "offset": 8
    }
  ],
  "location": "StepDefination.enter_something_in_your_income_before_tax_input_field(String)"
});
formatter.result({
  "duration": 196552203,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10000",
      "offset": 8
    }
  ],
  "location": "StepDefination.enter_something_in_your_other_income_input_field(String)"
});
formatter.result({
  "duration": 166895680,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 8
    }
  ],
  "location": "StepDefination.enter_something_in_living_expenses_input_field(String)"
});
formatter.result({
  "duration": 145511227,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 8
    }
  ],
  "location": "StepDefination.enter_something_in_current_home_loan_repayments_input_field(String)"
});
formatter.result({
  "duration": 123544446,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 8
    }
  ],
  "location": "StepDefination.enter_something_in_other_loan_repayments_input_field(String)"
});
formatter.result({
  "duration": 129268613,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 8
    }
  ],
  "location": "StepDefination.enter_something_in_other_commitments_input_field(String)"
});
formatter.result({
  "duration": 134795743,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10000",
      "offset": 8
    }
  ],
  "location": "StepDefination.enter_something_in_total_credit_card_limits_input_field(String)"
});
formatter.result({
  "duration": 229619282,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_submits_the_details()"
});
formatter.result({
  "duration": 141761005,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$507,000",
      "offset": 30
    }
  ],
  "location": "StepDefination.verify_that_borrow_amount_is(String)"
});
formatter.result({
  "duration": 1104330348,
  "status": "passed"
});
formatter.after({
  "duration": 167218267,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Navigate to \"/personal/home-loans/calculators-tools/much-borrow/\" Site",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.initialize_the_browser_with_chrome()"
});
formatter.result({
  "duration": 984371022,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/personal/home-loans/calculators-tools/much-borrow/",
      "offset": 13
    }
  ],
  "location": "StepDefination.navigate_to_something_site(String)"
});
formatter.result({
  "duration": 5182245600,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Validate if Entering only $1 for Living expenses, and leaving all other fields as zero, clicking",
  "description": "‘Work out how much I could borrow’ returns expected message",
  "id": "borrow-calculator-validation;validate-if-entering-only-$1-for-living-expenses,-and-leaving-all-other-fields-as-zero,-clicking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "Enter  \"1\" in  Living expenses input field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User submits the details",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Verify the Error Message is \"Based on the details you\u0027ve entered, we\u0027re unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 8
    }
  ],
  "location": "StepDefination.enter_something_in_living_expenses_input_field(String)"
});
formatter.result({
  "duration": 129751631,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_submits_the_details()"
});
formatter.result({
  "duration": 219196769,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Based on the details you\u0027ve entered, we\u0027re unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.",
      "offset": 29
    }
  ],
  "location": "StepDefination.verify_the_Error_Message_is(String)"
});
formatter.result({
  "duration": 22069629,
  "status": "passed"
});
formatter.after({
  "duration": 90969823,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Navigate to \"/personal/home-loans/calculators-tools/much-borrow/\" Site",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.initialize_the_browser_with_chrome()"
});
formatter.result({
  "duration": 892558667,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/personal/home-loans/calculators-tools/much-borrow/",
      "offset": 13
    }
  ],
  "location": "StepDefination.navigate_to_something_site(String)"
});
formatter.result({
  "duration": 4692656574,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Validate if Clicking the ‘start over’ button clears the form.",
  "description": "",
  "id": "borrow-calculator-validation;validate-if-clicking-the-‘start-over’-button-clears-the-form.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "Enter  \"80000\" in Your income (before tax) input field",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Enter  \"10,000\" in Your Other income input field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Enter  \"500\" in  Living expenses input field",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Enter  \"0\" in  Current home loan repayments  input field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Enter  \"100\" in  Other loan repayments input field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Enter  \"0\" in  Other commitments input field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Enter  \"10000\" in  Total credit card limits input field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User submits the details",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "80000",
      "offset": 8
    }
  ],
  "location": "StepDefination.enter_something_in_your_income_before_tax_input_field(String)"
});
formatter.result({
  "duration": 162458160,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10,000",
      "offset": 8
    }
  ],
  "location": "StepDefination.enter_something_in_your_other_income_input_field(String)"
});
formatter.result({
  "duration": 130630208,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 8
    }
  ],
  "location": "StepDefination.enter_something_in_living_expenses_input_field(String)"
});
formatter.result({
  "duration": 90961078,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 8
    }
  ],
  "location": "StepDefination.enter_something_in_current_home_loan_repayments_input_field(String)"
});
formatter.result({
  "duration": 72369463,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 8
    }
  ],
  "location": "StepDefination.enter_something_in_other_loan_repayments_input_field(String)"
});
formatter.result({
  "duration": 99270620,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 8
    }
  ],
  "location": "StepDefination.enter_something_in_other_commitments_input_field(String)"
});
formatter.result({
  "duration": 70233946,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10000",
      "offset": 8
    }
  ],
  "location": "StepDefination.enter_something_in_total_credit_card_limits_input_field(String)"
});
formatter.result({
  "duration": 106214110,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_submits_the_details()"
});
formatter.result({
  "duration": 86642336,
  "status": "passed"
});
formatter.after({
  "duration": 93638798,
  "status": "passed"
});
});