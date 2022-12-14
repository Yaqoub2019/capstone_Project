Feature: Retail Home Page

  Background: 
    Given User is on retail website

  @AllSection
  Scenario: Verify Shop by Department siderbar
    When User click on All section
    Then below option are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @AllDepartment
  Scenario Outline: Verify department sidebar options
    Given User is on retail website
    When User click on All department
    And User on '<department>'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automotive  | Automative Parts & Accessories | MotorCycle & Powersports |

  @AddToCard
  Scenario: Verify User can add an item to cart
    When User click on Sign in option
    And User enter email 'ghafor@gmail.com' and password 'Ghafor@123'
    And User click on login button
    Then User should be logged in into Account
    
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'

  @placeAnOrder
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    When User click on Sign in option
    And User enter email 'ghafor@gmail.com' and password 'Ghafor@123'
    And User click on login button
    Then User should be logged in into Account
    
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And user fill new address form with below information
      | country     | fullName       | phoneNumber | streetAddress | apt  | city  | state | zipCode |
      | Afghanistan | Ferdows Akbary |  8179443582 | Khair-khana   | 5800 | Mazar | Logar |   76137 |
    And User click on Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard  | expirationMonth | expirationYear | securityCode |
      | 1010121214532323 | zaib hakimi |              12 |           2028 |          123 |
    And User click on Add your card button
    And User click on Place Your Order
    Then a message should be displayed Order Placed, Thanks

  @Order
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    When User click on Sign in option
    And User enter email 'ghafor@gmail.com' and password 'Ghafor@123'
    And User click on login button
    Then User should be logged in into Account
    
    And User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on item
    And User select quantity '5'
    And User click add to Cart button
    Then the cart icon quantity should change to '5'
    
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a message should be displayed Order Placed, Thanks
