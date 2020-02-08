package com.cucumber.StepDefinitions;

import com.cucumber.Selenium.SeleniumFunctions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDef {
	
	SeleniumFunctions sf=new SeleniumFunctions(); 


@Given("^User is on HomePage$")
public void user_is_on_HomePage() throws Throwable {
	sf.createDriver();
  
}

@Given("^User Click on signIn Button$")
public void user_Click_on_signIn_Button() throws Throwable {
	sf.clickSinginLink();
	
}



@Then("^logout from portal$")
public void logout_from_portal() throws Throwable {
  sf.closeDriver();
  
   }

}

