Feature: Test login feature

  Scenario Outline: Try to login with different credentials

    Given User navigates to login page
    Then User enters <email> and <password>
    Then Click on "Sign In" button
    Then User navigates to home page

    Examples:
      | email                     | password      |
      | dummyfortesting7@gmail.com| dummyTestAcc7 |


  Scenario Outline: Email wrong Password true

    Given User navigates to login page
    Then User enters <email> and <password>
    Then Click on "Sign In" button
    Then User should see the error message

    Examples:
      | email                     | password      |
      | dummyfortesting8@gmail.com| dummyTestAcc7 |