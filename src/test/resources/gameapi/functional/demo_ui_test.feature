Feature: Demo UI test

  Scenario: Check textbox only accepts positive number
    * def locator = '#txtPositiveNumber'
    * def ui = call read('classpath:common/ui-helper.js')
    * call ui.validatePositiveNumberTextBox('#txtPositiveNumber')
