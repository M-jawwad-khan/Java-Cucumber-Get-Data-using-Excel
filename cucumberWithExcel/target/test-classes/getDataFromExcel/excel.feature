Feature: Contact Us Feature

 @DDT
  Scenario Outline: Title of your scenario
    Given Open browser goto the login page
    When user fill thr form given sheetname <rownumber> and rownumber <columnnumber>
    And user click on send button
    Then it shows a successfull message   
    
    Examples:
     |rownumber|columnnumber|
     |1|0|
     |1|1|
     
