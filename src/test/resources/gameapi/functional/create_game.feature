Feature: Create a new game
Background:
    * url   baseUrl + '/api/games'
    * def gameBody = {name: 'Zedla', genre: 'Adventure', price: 59.99}
    
Scenario: Create a new game successfully
    Given request gameBody
    When method post
    Then status 200
