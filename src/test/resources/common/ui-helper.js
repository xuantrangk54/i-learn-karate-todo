function validatePositiveNumberTextBox(locator) {
  karate.log('Validating textbox at', locator);
  click(locator);
  input(locator, '123');
  var v1 = value(locator);
  if (v1 != '123') karate.fail('Textbox did not accept valid number');

  input(locator, 'abc!@#');
  var v2 = value(locator);
  if (v2 != v1) karate.fail('Textbox accepted invalid characters');
}