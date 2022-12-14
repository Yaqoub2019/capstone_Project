package tek.sdet.framework.steps;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{
	POMFactory factory = new POMFactory();
	@When("User click on Account option") 
	public void userClickOnAccountOption() {
   click(factory.homePage().accountDisplay);
   logger.info("user click on accont option" );
	    
	}
	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue , String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().namefiled);
		sendText(factory.accountPage().namefiled,nameValue);
		clearTextUsingSendKeys(factory.accountPage().phonefiled);
		sendText(factory.accountPage().phonefiled,phoneValue);
		logger.info("user updated name and phone");
	}
	@And("User click on Update button")
	public void userClickOnUpdateButton() {
	  click (factory.accountPage().updateButton);
	  logger.info("user click on update butten");
	    
	}
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalinformationUpdated);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalinformationUpdated));
		logger.info("user profile information is updated");
	}

	@Then("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {
     List<Map<String,String>>passwordInformation = dataTable.asMaps(String.class, String.class);
     sendText(factory.accountPage().prevousPsswordField,passwordInformation.get(0).get("previousPassword"));
     sendText(factory.accountPage().newPasswordField,passwordInformation.get(0).get("newPassword"));
     sendText(factory.accountPage().confirmPasswordField,passwordInformation.get(0).get("confirmPassword"));
     logger.info("user inter password infromation");
     
    	

}
	@Then("User click on Change Password button")
	public void userClickOnChangePasswordButton() { 
    click(factory.accountPage().changePasswordButton);
    logger.info("user clicked on change Password Button");
    	
    }
    
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMessage ) {
		slowDown();
    	Assert.assertEquals(expectedMessage, factory.accountPage().passwordUpdatedSuccessfullyMessage.getText());
    	logger.info(expectedMessage + "is displayed" );
    	
    	
    }
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		 click(factory.accountPage().addPaymentMethodLink);
		 logger.info("user click on add a payment method link");  
	}	
	
	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>>paymentInformation = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberInputField, paymentInformation.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardField, paymentInformation.get(0).get("nameOnCard"));
		sendText(factory.accountPage().expiratiOnMonthField, paymentInformation.get(0).get("expirationMonth"));
		sendText(factory.accountPage().expirationYearField,paymentInformation.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCodeField,paymentInformation.get(0).get("securityCode"));
		logger.info("user intered the card information");
	}
    
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().paymentSubmitButton);
		logger.info("user can click on add your car button");
	}
	@Then("a message should be displayed Payment Method added successfully")
	public void aMsgShouldBeDisplayed() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodUpdatedSuccessfully));
		logger.info("Payment Method added successfully");
	}
	@When("User click on added card")
	public void userClickedOnAddedCard() {
		click(factory.accountPage().ClickOnCardToEdit);
		logger.info("User click on added card");
	}
	
	
	@And("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
	    click(factory.accountPage().Edit);
	    logger.info("User clicked on login button");
	}
	@And("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
	   List<Map<String,String>> map = dataTable.asMaps(String.class, String.class);
	   clearText(factory.accountPage().cardNumberInputField);
	   sendText(factory.accountPage().cardNumberInputField, map.get(0).get("cardNumber"));
	   clearText(factory.accountPage().nameOnCardField);
	   sendText(factory.accountPage().nameOnCardField, map.get(0).get("nameOnCard"));
	   selectByVisibleText(factory.accountPage().expiratiOnMonthField,map.get(0).get("expirationMonth"));
	   selectByVisibleText(factory.accountPage().expirationYearField, map.get(0).get("expirationYear"));
	   clearText(factory.accountPage().securityCodeField);
	   sendText(factory.accountPage().securityCodeField, map.get(0).get("securityCode"));
	   logger.info("User entered the following information");
	}
	@And("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
	
	   click(factory.accountPage().paymentSubmitButton);
	   logger.info("User clicked on updated button");
	}
	@Then("a message should be displayed Payment Method updated Successfully")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
     	slowDown();
		String actual = "Payment Method updated Successfully";
		String expect = getElementText(factory.accountPage().cardupdatedPopUp);
	    Assert.assertEquals(actual, expect);
	    logger.info("Message was displayed successfully");
	}
	
	@And ("User select the payment Card")
	public void userSelectThePaymentCard () {
		click(factory.accountPage().ClickOnCardToEdit);
	}
	
	
	
	
    @And ("User click on remove option of card section")
    public void userClickOnRemoveOptionOfCardSection () {
    	click (factory.accountPage().removeCard);
    	logger.info("user clicked on remove option");
    	slowDown();
    }
    @Then ("payment details should be removed")
    public void paymentDetailsShuldBeRemoved() {
    	Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentSubmitButton));
    	logger.info("Card was removed");
    }
	//------------------------------------------------Add Address
    
    @And ("User click on Add address option")
    public void userClickOnAddAddressOption () {
    	click(factory.accountPage().addAddress);
    	logger.info("user Clicked In AddAddress Option" );
    }
    
    @And("user fill new address form with below information")
    public void userFillNewAddressFormWithBelowInformation (DataTable data) {
    	List<Map<String,String>> fillAddress  = data.asMaps(String.class, String.class);
    	selectByVisibleText(factory.accountPage().contryDrop,fillAddress.get(0).get("country"));
    	sendText(factory.accountPage().fullnameInput,fillAddress.get(0).get("fullName"));
    	sendText(factory.accountPage().phoneNumber,fillAddress.get(0).get("phoneNumber"));
    	sendText(factory.accountPage().streetAdd,fillAddress.get(0).get("streetAddress"));
    	sendText(factory.accountPage().apartementAdd,fillAddress.get(0).get("apt"));
    	sendText(factory.accountPage().cityField,fillAddress.get(0).get("city"));
    	sendText(factory.accountPage().state,fillAddress.get(0).get("state"));
    	sendText(factory.accountPage().zipCode,fillAddress.get(0).get("zipCode"));
        logger.fatal("user fill the fiel");
        slowDown();	
    	
    }
    
    @And("User click on Add Your Address button")
    public void userClickOnAddYourAddressButton() {
    	click(factory.accountPage().addressButton);
    	logger.info("User clicked on add address button");
    }
    
    @Then("a message should be displayed Address Added Successfully")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
	    
		String actual = "Address Added Successfully";
		String expect = getElementText(factory.accountPage().addressAddedPopUp);
	    Assert.assertEquals(actual, expect);
	    logger.info("Message was displayed successfully");
    }
    
    //-----------------------------------------Edit Address
    
    @When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		waitTillPresence(factory.accountPage().editAddress);
	    click(factory.accountPage().editAddress);
	    logger.info("User clicked on edit address option");
	}
    
    @And("user fill new address form with below information there")
    public void userFillNewAddressFormWithBelowInformationThere (DataTable data) {
    	List<Map<String,String>> fillAddress  = data.asMaps(String.class, String.class);
    	selectByVisibleText(factory.accountPage().contryDrop,fillAddress.get(0).get("country"));
    	clearTextUsingSendKeys(factory.accountPage().fullnameInput);
    	sendText(factory.accountPage().fullnameInput,fillAddress.get(0).get("fullName"));
    	clearTextUsingSendKeys(factory.accountPage().phoneNumber);
    	sendText(factory.accountPage().phoneNumber,fillAddress.get(0).get("phoneNumber"));
    	clearTextUsingSendKeys(factory.accountPage().streetAdd);
    	sendText(factory.accountPage().streetAdd,fillAddress.get(0).get("streetAddress"));
    	clearTextUsingSendKeys(factory.accountPage().apartementAdd);
    	sendText(factory.accountPage().apartementAdd,fillAddress.get(0).get("apt"));
    	clearTextUsingSendKeys(factory.accountPage().cityField);
    	sendText(factory.accountPage().cityField,fillAddress.get(0).get("city"));
    	clearTextUsingSendKeys(factory.accountPage().state);
    	sendText(factory.accountPage().state,fillAddress.get(0).get("state"));
    	clearTextUsingSendKeys(factory.accountPage().zipCode);
    	sendText(factory.accountPage().zipCode,fillAddress.get(0).get("zipCode"));
        logger.fatal("user fill the fiel");
        slowDown();	 
    }
    
    @And ("User click update Your Address button")
    public void userClickUpdateYourAddressButton() {
    	click(factory.accountPage().updateAddress);
    	logger.info("user clicked update address");
    }
    
    @Then("a message should be displayed Address Updated Successfully")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() { 
    	slowDown();
	Assert.assertTrue(isElementDisplayed(factory.accountPage().addressUpdatesuccessfully));   
	logger.info("Message was displayed successfully");
	}

    //------------------------------------Removed Address

    @And("User click on remove option of Address section")
	public void userClickedOnRemoveOption() {
		click(factory.accountPage().removeAddress);
		logger.info("User clicked on remove button");
		
	}
	
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		//Assert.assertTrue(isElementDisplayed(factory.accountpage().Account)); There is no msg to validate.
		logger.info("User removed the address");

	}

		}
		

	


