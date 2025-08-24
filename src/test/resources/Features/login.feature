Feature: Add product in sample app automation

Scenario Outline: Complete checkout flow
  Given User is on login page
  When User enters valid "<username>" and "<password>"
  And User clicks login button
  Then User is navigate to the home page
  And User added products in cart
  And User clicks cart button
  Then Check user in your cart page
  And User clicks checkout button
  Then User is on your information page
  And User enters enters the following details "<firstname>" and "<lastname>" and "<postalcode>"
  And User clicks Continue
  Then User is on overview page
  And User clicks finish button
  Then User has completed the checkout process
  And User should see a success message confirming the order
  And Close the browser

Examples:
| username       | password     | firstname | lastname   | postalcode |
| standard_user  | secret_sauce | Gubera    | lakshmanan | 625017     |
