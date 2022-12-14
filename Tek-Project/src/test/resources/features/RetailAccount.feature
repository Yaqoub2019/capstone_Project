Feature: Retail Account page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'ghafor@gmail.com' and password 'Ghafor@123'
    And User click on login button
    Then User should be logged in into Account
    When User click on Account option

  @UpdetInformation
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'karim' and Phone '1245879653'
    And User click on Update button
    Then user profile information should be updated

  @PasswordUpdate
  Scenario: Verify User can Update password
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Ghafor@1234      | Ghafor@123  | Ghafor@123      |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'

  @AddPaymentCard
  Scenario: Verify User can edit Debit or Credit card
    When User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 6547896541254786 | nabi       |              12 |           2025 |          500 |
    And User click on Add your card button
    Then a message should be displayed Payment Method added successfully

  @EditCard
  Scenario: Verify User can edit Debit or Credit card
    When User click on added card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 0122333404000788 | zabih      |              12 |           2028 |          444 |
    And user click on Update Your Card button
    Then a message should be displayed Payment Method updated Successfully

  @removeCard
  Scenario: Verify User can remove Debit or Credit card
    And User select the payment Card
    And User click on remove option of card section
    Then payment details should be removed

  @addAddress
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
      | country     | fullName       | phoneNumber | streetAddress | apt  | city  | state | zipCode |
      | Afghanistan | Ferdows Akbary |  8179443582 | Khair-khana   | 5800 | Mazar | Logar |   76137 |
    And User click on Add Your Address button
    Then a message should be displayed Address Added Successfully

  @EditAddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information there
      | country | fullName | phoneNumber | streetAddress | apt | city     | state | zipCode |
      | China   | Akbary   |   4584587854 | 12 street     |   5 | Maryland | geln  |   76137 |
    And User click update Your Address button
    Then a message should be displayed Address Updated Successfully
    
    @RemoveAddress
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
