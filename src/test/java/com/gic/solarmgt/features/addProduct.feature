Feature: Verify Add Product feature
  As a user
  I should be able to add Products.

  # AC1 : verify Product Add feature allows to add products when we provide valid product details.
@addProducts
  Scenario: Verify Add Product feature with valid Product details
    Given I am on the Home page "http://solar.schoolnewgen.com/websolar/"
    When  I enter user name in the user name field as "admin2@gmail.com"
    And   I enter password in the password field as "secret"
    And   I click on sign in button
    And  I should be able to login successfully
    And I click on Products link
    And I click on Add Product option
    And Product Add page should be loaded
    And I select category option from dropdown menu
    And I enter Product Sku in the Product Sku field as"179"
    And I enter Product Name in the Product Name field as " Solar Sun Panel2"
    And I enter Product description in the Product description field as "convert solar energy to electrical energy"
    And I select Unit value from Unit dropdown menu
    And I enter Unit Price in the Unit Price field as "2000"
    And I enter installation charge in the installation charge field as "500"
    And I enter Product Warranty Details in the Product Warranty Details field as "3 years"
    And I select Product Image in the Product Image field
    And I click on Create Product button
    Then Product should be added successfully