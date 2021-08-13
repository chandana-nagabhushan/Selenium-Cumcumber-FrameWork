package StepDefinations;

import cucumber.api.java.After;
import utilities.BaseClass;

public class Hooks extends BaseClass {

	@After()
	public void Aftervaldiation() {
		driver.quit();
	}

}
