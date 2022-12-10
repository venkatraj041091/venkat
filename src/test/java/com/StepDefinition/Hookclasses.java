package com.StepDefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hookclasses extends Baseclass{
	
	@Before
	public void afterclass() throws FileNotFoundException, IOException {
		getDriver1(getpropertyFileValue("browser"));
		enterApplyUrl(getpropertyFileValue("url"));
		maximizewindow();
		implicitywait();	
	
		

	}
@After
public void afterclasses(Scenario scenario) {
	
	if (scenario.isFailed()) {
		scenario.attach(screenshort(),"images/png","Scenario has failed");	
	}
	quitwindow();

}
	
	
	
}
