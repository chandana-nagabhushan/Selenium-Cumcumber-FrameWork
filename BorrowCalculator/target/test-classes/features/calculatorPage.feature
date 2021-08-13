Feature: Borrow Calculator Validation

  Background: 
    Given Initialize the browser with chrome
    Then Navigate to "/personal/home-loans/calculators-tools/much-borrow/" Site

  Scenario: Validate if borrow calculator returns expected results
    And Select application type as "Single"
    And Select property to live in as "Home to Live in"
    And Select  "0" dependants from Dropdown
    And Enter  "80000" in Your income (before tax) input field
    And Enter  "10000" in Your Other income input field
    And Enter  "500" in  Living expenses input field
    And Enter  "0" in  Current home loan repayments  input field
    And Enter  "100" in  Other loan repayments input field
    And Enter  "0" in  Other commitments input field
    And Enter  "10000" in  Total credit card limits input field
    When User submits the details
    Then Verify that borrow amount is "$507,000"

  Scenario: Validate if Entering only $1 for Living expenses, and leaving all other fields as zero, clicking
    ‘Work out how much I could borrow’ returns expected message

    And Enter  "1" in  Living expenses input field
    When User submits the details
    Then Verify the Error Message is "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500."

  Scenario: Validate if Clicking the ‘start over’ button clears the form.
    And Enter  "80000" in Your income (before tax) input field
    And Enter  "10,000" in Your Other income input field
    And Enter  "500" in  Living expenses input field
    And Enter  "0" in  Current home loan repayments  input field
    And Enter  "100" in  Other loan repayments input field
    And Enter  "0" in  Other commitments input field
    And Enter  "10000" in  Total credit card limits input field
    When User submits the details
