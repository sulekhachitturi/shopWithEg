package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.DriverFactory;

public class Hooks {
	DriverFactory driverfactory=new DriverFactory(); 
	
	@Before
	public void Beforemethod() {
		driverfactory.init();
	}
	
	@After
	public void Aftermethod() {
		//DriverFactory.driver.quit();
	}

}
