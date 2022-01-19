Feature: Login

@login
  Scenario: Login validation with valid credentials
    Given I am on the Home page "http://solar.schoolnewgen.com/websolar/"
    When  I enter user name in the user name field as "admin2@gmail.com"
    And   I enter password in the password field as "secret"
    And   I click on sign in button
    Then  I should be able to login successfully