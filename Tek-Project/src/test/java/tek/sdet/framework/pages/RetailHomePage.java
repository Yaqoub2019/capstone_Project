package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup{
	public RetailHomePage() {
        PageFactory.initElements(getDriver(), this);
    }

	 @FindBy(xpath="//button[@id='hamburgerBtn']")
	    public WebElement All;

	 @FindBy(id="contentHeader")
		public WebElement shopByDepartment;
		
	@FindBy(id="signinLink")
	public WebElement signIn;
	
	@FindBy(id="accountLink")
	public WebElement accountDisplay;
    
    @FindBy(xpath="//span[text()='Electronics']")
    public WebElement electronics;
    
    
    @FindBy(xpath="//span[text()='Computers']")
    public WebElement computer;
    
    @FindBy(xpath="//span[text()='Smart Home']")
    public WebElement smarthome;
    
    @FindBy(xpath="//span[text()='Automative']")
    public WebElement Automative;
    
    @FindBy(xpath="//span[text()='Sports']")
    public WebElement Sports;
    
    @FindBy(xpath="//span[text()='TV & Video']")
    public WebElement TvAndVideo;
    
   @FindBy(xpath="//span[text()='Video Games']")
    public WebElement VideoGames;
    
    @FindBy(xpath="//span[text()='Accessories']")
    public WebElement Accessories;
    
    @FindBy(xpath="//span[text()='Networking']")
    public WebElement Networking;
    
    @FindBy(xpath="//span[text()='Smart Home Lightning']")
    public WebElement smarthomelightning;
    
    @FindBy(xpath="//span[text()='Plugs and Outlets']")
    public WebElement plugsandoutlets;
    
    @FindBy(xpath="//span[text()='Athletic Clothing']")
    public WebElement AthleticClothing;
    
    @FindBy(xpath="//span[text()='Exercise & Fitness']")
    public WebElement ExerciseFitness;
    
    @FindBy(xpath="//span[text()='Automative Parts & Accessories']")
    public WebElement AutomativePartsAccessories;
    
    @FindBy(xpath="//span[text()='MotorCycle & Powersports']")
    public WebElement MotorCyclePowersports;
    
    @FindBy(id = "search")
    public WebElement allDepartments;
    
    @FindBy(xpath="//p[@class='products__name']")
	public WebElement Itemavialble;
    
    @FindBy(id = "searchInput")
    public WebElement searchInputField;
    
    @FindBy(id = "searchBtn")
    public WebElement searchButton;
    
    @FindBy(xpath="//p[text()='Kasa Outdoor Smart Plug']")
    public WebElement SmartPlug;
    
    @FindBy(xpath= "//select[@class= 'product__select']")
    public WebElement Quantity;
    
    @FindBy(xpath="//option[text()= '2']")
    public WebElement Quntity2;
    
    @FindBy (id="addToCartBtn")
    public WebElement AddToCard;
    
    @FindBy(id="cartBtn")
    public WebElement cardBtn;
    
    @FindBy(id="proceedBtn")
    public WebElement proceedBtn;
    
    @FindBy(id="placeOrderBtn")
    public WebElement placeOrderBtn;
    
    @FindBy(xpath="//p[text()='Order Placed, Thanks']")
	public WebElement OrderdPlacedMessage;
	
	@FindBy(xpath="Apex Legends - 1,000 Apex Coins")
	public WebElement ApexItem;
    
	@FindBy(id="addAddressBtn")
	public WebElement AddArddress;
	
	@FindBy(id="addPaymentBtn")
	public WebElement addPaymentBtn;
	
	

}