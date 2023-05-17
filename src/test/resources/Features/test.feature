Feature: login feature

  Background:
    Given user in login page

  @scenario1
  Scenario: test login 1
    When user enters uname and pass
    And user click submit
    Then user successfully login

  @scenario2
  Scenario: test login 2
    When user enters "raki.hasan" and "Abc!234"
    And user click submit
    Then user successfully login

  @outline
  Scenario Outline: login test with DDT
    When user enters "<username>" and "<password>"
    And user click submit
    Then user successfully login

    Examples:
      |username            |    password  |
      |rakihasanDDT        |    AbcDDT    |
      |AhmedurMahiDDT      |    MahiDDT   |




