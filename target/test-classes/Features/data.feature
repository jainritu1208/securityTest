Feature: feature to run Test

  Scenario Outline: Title of your scenario outline
    Given I want to launch websites using "<websites>"
    When Give value to search box "<s1>" "<s2>"
    Then close browser "<se1>"

    Examples: 
      | websites                           | s1                          | s2                |
      | http://stores.vmart.co.in          | '; exec master..xp_cmdshell | \\x27UNION SELECT |
      | https://www.dealer.india.ford.com/ | '; exec master..xp_cmdshell | \\x27UNION SELECT |