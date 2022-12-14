package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this );
	}
	// ------------------- personal information
	@FindBy(id = "nameInput")
	public WebElement namefiled;
	
	@FindBy(id = "personalPhoneInput")
	public WebElement phonefiled;
	
	@FindBy(id = "emailInput")
	public WebElement emailfield;
	
	@FindBy(xpath="//button[text() = 'Update']")
	public WebElement updateButton;
	
	@FindBy(xpath="//div[text()='Personal Information Updated Successfully']")
	public WebElement personalinformationUpdated;
	
	//----------------- password
	
	@FindBy(id = "previousPasswordInput")
	public WebElement prevousPsswordField;
	
	@FindBy(id = "newPasswordInput")
	public WebElement newPasswordField;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPasswordField;
	
	@FindBy (id = "credentialsSubmitBtn")
	public WebElement changePasswordButton;
	
	@FindBy(xpath="//div[text()='Password Updated Successfully']")
	public WebElement passwordUpdatedSuccessfullyMessage;
	
	//---------------------------------Add card
	
	@FindBy(xpath="//p[text()='Add a payment method']")
	public WebElement addPaymentMethodLink;
	
	@FindBy(id="cardNumberInput")
	public WebElement cardNumberInputField;
	
	@FindBy(id="nameOnCardInput")
	public WebElement nameOnCardField;
	
	@FindBy(id="expirationMonthInput")
	public WebElement expiratiOnMonthField;
	
	@FindBy(id="expirationYearInput")
	public WebElement expirationYearField;
	
	@FindBy(id="securityCodeInput")
	public WebElement securityCodeField;
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement paymentSubmitButton;
	
	@FindBy(xpath="//div[text()='Payment Method added sucessfully']")
	public WebElement paymentMethodUpdatedSuccessfully;
	
	//-------------------------------------------------Edit Payment card
	
	@FindBy(xpath="//div//child::p[@class='account__payment-sub-title']")
	public WebElement ClickOnCardToEdit;
	
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement Edit;
	
	@FindBy(xpath="//div[text()='Payment Method updated Successfully']")
	public WebElement cardupdatedPopUp;
	
	//---------------------------------Remove Card
	
	@FindBy (xpath="//button[text() = 'remove']")
	public WebElement removeCard;
	
	//---------------------------------Add address
	
	@FindBy(xpath="//p[text()='Add Address']")
	public WebElement addAddress;
	
	@FindBy(id="countryDropdown")
	public WebElement contryDrop;
	
	@FindBy(id = "fullNameInput")
	public WebElement fullnameInput;
	
	@FindBy(id="streetInput")
	public WebElement streetAdd;
	
	@FindBy(xpath = "//div[@class='account__address-new-padding']/*[@id='phoneNumberInput']")
	public WebElement phoneNumber;
	
	@FindBy (id="apartmentInput")
	public WebElement apartementAdd;
	
	@FindBy(id="cityInput")
	public WebElement cityField;
	
	@FindBy(xpath="//select[@name='state']")
	public WebElement state;
	
	@FindBy(id="zipCodeInput")
	public WebElement zipCode;
	
	@FindBy(id="addressBtn")
	public WebElement addressButton;
	
	@FindBy(xpath="//div[text()='Address Added Successfully']")
	public WebElement addressAddedPopUp;
	
	//---------------------------------------Edit Address 
	
    @FindBy(xpath="//button[text()='Edit']")
	
	public WebElement editAddress;
	
	@FindBy(xpath="//button[text()='Update Your Address']")
	public WebElement updateAddress;
	
	@FindBy(xpath="//div[text()='Address Updated Successfully']")
	public WebElement addressUpdatesuccessfully;
	
	//------------------------------------------------Removed Address
	
	@FindBy(xpath="//button[text()='Remove']")
	public WebElement removeAddress;

	
	
	
	
}
