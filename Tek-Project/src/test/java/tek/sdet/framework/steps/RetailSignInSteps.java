package tek.sdet.framework.steps;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
public class RetailSignInSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expected = "React App";
		String actual = getTitle();
		Assert.assertEquals(expected, actual);
		logger.info(expected+" is equal to "+actual);
	}
	@When("User click on Sign in option") 
	public void userClickOnSignInOption() {
		click(factory.homePage().signIn);
		logger.info("user clicked on sign in option succefully");
		slowDown();
	}
	
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword (String email,String password) {
		sendText(factory.signInPage().emailField,email);
		sendText(factory.signInPage().passwrodField,password);
		logger.info("user entered email" + email + "and password" + password);
		slowDown();	
	}
	
	@And("User click on login button")
	public void userClickOnLoginButton () {
		click(factory.signInPage().logIn);
		logger.info("user clicked on login button");
		slowDown();	
	}
	
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount () {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountDisplay));
		logger.info("User could login successfully");
		slowDown();
	}
	
	@And("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton () {
		click(factory.signInPage().CreateAccount);
		logger.info("User clicked on Create New Account succefully");
		slowDown();
	}
	
	


@And("User fill the signUp information with below data")
	public void userEnteredTheGivenData (DataTable data) {
		List<Map<String, String>> signUpData=data.asMaps(String.class,String.class);
		sendText(factory.signInPage().nameField,signUpData.get(0).get("name"));
		sendText(factory.signInPage().emailfield,signUpData.get(0).get("email"));
		sendText(factory.signInPage().passField,signUpData.get(0).get("password"));
		sendText(factory.signInPage().confirmPass,signUpData.get(0).get("confirmPassword"));
		logger.info("user could enter the data successfully");
		slowDown();
		
	}

	@And("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().signUp);
		logger.info("User clicked on SignUp Button");
	}
	
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountDisplay));
		logger.info("User successfully logged into account page");
		
	}
	}
	

