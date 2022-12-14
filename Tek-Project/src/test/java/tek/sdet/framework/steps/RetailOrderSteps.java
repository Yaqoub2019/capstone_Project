package tek.sdet.framework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{
	POMFactory factory = new POMFactory(); 
	//-----------------------------------ordercancel
	@And("User click on Orders section")
	public void userClickOnOrdersSection() {
		  click(factory.orderPage().orderBtn);
		  logger.info("user can click on order Section");
	}
	@And("User click on first order in list")
	public void userClickOnFirstOrderInList() {
	    click (factory.orderPage().ShowDetails);
	    logger.info("user can click on first order list");
	}
	@And("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
	    click (factory.orderPage().cancelBtn);
	}
	@And("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String string) {
	   selectByVisibleText(factory.orderPage().reasonInput,string);
	   logger.info("user can select the Bought wrong item reason");
	}
	@And("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
	    click(factory.orderPage().ordercancel);
	    logger.info("user can click on cancel order button");
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String string) {
	Assert.assertTrue(isElementDisplayed(factory.orderPage().cancelOrderMessage));
		logger.info("a cancelation message should be displayed");
	  slowDown();
	}
//------------------------------------Return
	@And("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
	 click(factory.orderPage().returnBtn);
	 logger.info("user can click on return But");
	}
	@And("User select the Return {string}")
	public void userSelectTheReturn(String string) {
	    selectByVisibleText(factory.orderPage().reasonInput,string);
	    logger.info("user can select the return reason");
	}
	@And("User select the drop off service {string}")
	public void userSelectTheDropOffService(String string) {
		selectByVisibleText(factory.orderPage().FedEx,string);
		logger.info("user can select the drop of service");
	}
	    
	@And("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
	   click(factory.orderPage().ordersSubmitBtn);
	   logger.info("user can click on return order");
	   
	}
	@Then("a cancelation message should be displayed Return was successful")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful() {
    Assert.assertTrue(isElementDisplayed(factory.orderPage().retutnMessage));
		logger.info("a cancelation message should be displayed Return was successful");
	}

	    
	//--------------------------------------Review
	@And("User click on Review button")
	public void userClickOnReviewButton() {
	   click(factory.orderPage().reviewBtn);
	   logger.info("user can click on review button");
	}
	@And("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String string, String string2) {
		sendText(factory.orderPage().headline,string);
		sendText(factory.orderPage().description,string);
		logger.info("User can wirte his review ");
	  
	}
	@And("User click Add your Review button")
	public void userClickAddYourReviewButton() {
	   click(factory.orderPage().review);
	   logger.info("user can click to add the review button");
	   
	}
	@Then("a review message should be displayed Your review was added successfully")
	public void aReviewMessageShouldBeDisplayed() {
		slowDown();
	   Assert.assertTrue(isElementDisplayed(factory.orderPage().Popup));
	   logger.info("a review message should be displayed");
	}

}

