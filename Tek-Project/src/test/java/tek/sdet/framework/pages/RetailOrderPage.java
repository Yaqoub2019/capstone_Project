package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	
	public RetailOrderPage() {
        PageFactory.initElements(getDriver(), this);
    }

	@FindBy(id="orderLink")
	public WebElement orderBtn;
	
	@FindBy(xpath="//p[text()='Show Details']")
	public WebElement ShowDetails;
	
	@FindBy(id = "cancelBtn")
	public WebElement cancelBtn;
	
	@FindBy(id="reasonInput")
	public WebElement reasonInput;
	
	@FindBy(id= "orderSubmitBtn")
	public WebElement ordercancel;
	
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	public WebElement cancelOrderMessage;
	//----------------------------------return
	@FindBy(id="returnBtn")
	public WebElement returnBtn;
	
	@FindBy(xpath="//option[text()='Item damaged']")
	public WebElement ItemDamaged;
	
	@FindBy(id="dropOffInput")
	public WebElement FedEx;
	
	@FindBy(id="orderSubmitBtn")
	public WebElement ordersSubmitBtn;
	
	@FindBy(xpath="//p[text()='Return was successfull']")
	public WebElement retutnMessage;
	//------------------------------Review
	@FindBy(id="reviewBtn")
	public WebElement reviewBtn;
	
	@FindBy(id="headlineInput")
	public WebElement headline;
	
	@FindBy(id="descriptionInput")
	public WebElement description;
	
	@FindBy(id="reviewSubmitBtn")
	public WebElement review;
	
	@FindBy(xpath="//div[text()='Your review was added successfully']")
	public WebElement Popup;
}
