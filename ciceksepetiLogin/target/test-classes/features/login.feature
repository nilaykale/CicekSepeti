Feature: Test login feature

  Scenario Outline: Login Success

    Given User navigates to login page
    Then User enters <email> and <password>
    Then Click on "Accepted" button
    Then Click on "Sign In" button
    Then User navigates to home page

    Examples:
      | email                      | password  |
      | nilay_kale8991@hotmail.com | nilay1676 |


  Scenario Outline: Email wrong Password true

    Given User navigates to login page
    Then User enters <email> and <password>
    Then User should see the Password True
    Then User should see the error message and close it

    Examples:
      | email                      | password      |
      | dummyfortesting8@gmail.com | dummyTestAcc7 |



  Scenario Outline: Invalid Email Format

    Given User navigates to login page
    Then User enters <email> and <password>
    Then User should see the EmailError Messages

    Examples:
      | email                     | password      |
      | dummyfortesting8gmail.com | dummyTestAcc7 |


  Scenario Outline: Invalid Password Format

    Given User navigates to login page
    Then User enters <email> and <password>
    Then Click on "Accepted" button
    Then Click on "Sign In" button
    Then User should see the PasswordError Messages

    Examples:
      | email                     | password      |
      | dummyfortesting7@gmail.com | ab |