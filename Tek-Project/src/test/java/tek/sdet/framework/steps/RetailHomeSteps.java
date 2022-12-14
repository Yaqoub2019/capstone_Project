package tek.sdet.framework.steps;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailHomeSteps extends CommonUtility{
	POMFactory factory = new POMFactory();
     

	
	
	//@AllSection
	//Scenario: Verify Shop by Department sidebar
	
	@When("User click on All section")
	public void userClickedOnAllSection() {
		click(factory.homePage().All);
		logger.info("User clicked on All Section successfully");
		
	}
	
	
	@Then("below option are present in Shop by Department sidebar")
    public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable options) {
        List<List<String>> optionsToDisplay = options.asLists(String.class);
        Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//span[text() = '" + optionsToDisplay.get(0).get(0) + "']" ))));
               logger.info("options Electronics, Computers, Smart Home, Sports and Automative are present");
    }
	
@When("User click on All department")
public void hamburgerBtn() {
	click(factory.homePage().All);
	logger.info("User clicked on all department");
}



@When("User on {string}")
public void userOnElectronics(String department) {
 Assert.assertTrue(isElementDisplayed(factory.homePage().shopByDepartment));
 logger.info("User is on "+department); 
}


@Then("below options are present in department")
public void belowOptionsArePresentInDepartment(DataTable dataTable) {
List<List<String>> list = dataTable.asLists(String.class);

String electronic ="Electronics";
String computer = "Computers";
String smartHome = "Smart Home";
String sports="Sports";
String automative="Automotive";

	if(electronic.equals(getElementText(factory.homePage().electronics))) {
		click(factory.homePage().electronics);
	if(list.get(0).get(0).equals(getElementText(factory.homePage().TvAndVideo))
	&& list.get(0).get(1).equals(getElementText(factory.homePage().VideoGames))) {
	 Assert.assertTrue(true);
		}
	}

	else if(computer.equals(getElementText(factory.homePage().computer))) {
	click(factory.homePage().computer);
		if(list.get(1).get(0).equals(getElementText(factory.homePage().Accessories))
		 && list.get(1).get(1).equals(getElementText(factory.homePage().Networking))) {
		 Assert.assertTrue(true);
	}
} 
	
	else if(smartHome.equals(getElementText(factory.homePage().smarthome))) {
	click(factory.homePage().computer);
	if(list.get(2).get(0).equals(getElementText(factory.homePage().smarthomelightning))
	&& list.get(2).get(1).equals(getElementText(factory.homePage().plugsandoutlets))) {
		Assert.assertTrue(true);
	}
} 
	
	else if(sports.equals(getElementText(factory.homePage().Sports))) {
	click(factory.homePage().computer);
	if(list.get(3).get(0).equals(getElementText(factory.homePage().AthleticClothing))
	&& list.get(3).get(1).equals(getElementText(factory.homePage().ExerciseFitness))) {
		Assert.assertTrue(true);
	}
} 
	
else if(automative.equals(getElementText(factory.homePage().Automative))) {
	click(factory.homePage().computer);
	if(list.get(4).get(0).equals(getElementText(factory.homePage().Automative))
			  && list.get(4).get(1).equals(getElementText(factory.homePage().MotorCyclePowersports))) {
		 Assert.assertTrue(true);
	}
} else {
	Assert.assertTrue(false);
	
}
	logger.info("below options are present in department");
	
}


@And("User change the category to {string}")
public void userChangeTheCategoryTo(String string) {
	selectByVisibleText(factory.homePage().allDepartments,string);
	logger.info("user can slect to the SmartHome button");

}
@And("User search for an item {string}")
public void userSearchForAnItem(String string) {
	sendText(factory.homePage().searchInputField,string);
    logger.info("user can add the Item ");
}
@And("User click on Search icon")
public void userClickOnSearchIcon() {
	 click(factory.homePage().searchButton);
	    logger.info("user can click on searchButton");
}
@And("User click on item")
public void userClickOnItem() {
   click(factory.homePage().Itemavialble);
   logger.info("user click on item");
}
@And("User select quantity {string}")
public void userSelectQuantity(String string) {
   sendText(factory.homePage().Quantity,string);
   logger.info("user select to quantity");
}
@And("User click add to Cart button")
public void userClickAddToCartButton() {
    click(factory.homePage().AddToCard);
    logger.info("user can click to the cart button");
   
}
@Then("the cart icon quantity should change to {string}")
public void theCartIconQuantityShouldChangeTo(String string) {
	Assert.assertTrue(isElementDisplayed(factory.homePage().Quntity2));
	logger.info("cart icone changed to '2' ");
  slowDown();
}


@And("User click on Cart option")
public void userClickOnCartOption() {
   click(factory.homePage().cardBtn);
   logger.info("user can click on cart option");
}
@And("User click on Proceed to Checkout button")
public void userClickOnProceedToCheckoutButton() {
   click(factory.homePage().proceedBtn);
   logger.info("user can click on procceed check out");
}
@Then("User click Add a new address link for shipping address")
public void userClickAddANewAddressLinkForShippingAddress() {
    click(factory.homePage().AddArddress);
    logger.info("user can click add new address");
}

@Then("User click Add a credit card or Debit Card for Payment method")
public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
  click(factory.homePage().addPaymentBtn);
  logger.info("user can click to add credit or debit card for Payment");
}

@Then("User click on Place Your Order")
public void userClickOnPlaceYourOrder() {
    click(factory.homePage().placeOrderBtn);
    logger.info("user click on place Order");
}
@Then("a message should be displayed Order Placed, Thanks")
public void aMessageShouldBeDisplayedOrderPlacedThanks() {
	Assert.assertTrue(isElementDisplayed(factory.homePage().OrderdPlacedMessage));
	logger.info("Order Placed, Thanks ");
  slowDown();
}

}