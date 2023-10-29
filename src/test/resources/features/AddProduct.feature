Feature: Add product to shopping cart
  As user
  I want to enter the Exito page
  To select a product and add it to the shopping cart

@Successful
  Scenario: Add product to shopping cart successfully
    Given The user opens the Success page and searches for any product.
    When The user clicks the Add to Cart button.
    Then The user validates that the selected product has been successfully added