Feature: Video Game API
  As a user of the Video Game API
  I want to be able to perform CRUD operations on video game records
  So that I can manage my video game collection effectively

  Background:
    * url 'https://videogamedb.uk/api/v2'

  Scenario: Lấy danh sách tất cả video games
    Given path 'videogame'
    When method get
    Then status 200
    And match each response contains { id: '#number', name: '#string' }

  Scenario: Lấy thông tin 1 video game cụ thể
    Given path 'videogame', 1
    When method get
    Then status 200
    And match response.id == 1
    And match response.name == '#string'

  Scenario: Lấy thông tin video 2 cụ thể
    Given path 'videogame', 2
    When method get
    Then status 200
    And match response.id == 2
    And match response.name == '#string'