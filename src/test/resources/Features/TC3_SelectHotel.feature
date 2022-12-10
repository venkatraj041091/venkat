@selecthotel
Feature: Verify the adatin hotel page and validate the datas in search hotel page and select the hotel in select hotel page

  @scenario8
  Scenario Outline: Verifying the select hotel page and click on the select hotel and then click on continue
    Given User is on the hotel page
    When User should enter login "<username>" and "<password>"
    Then User should verfied the login page sucess message "Hello venkatraj027!"
    When User should enter "<location>","<hotels>","<roomtype>","<noofrooms>","<checkin>","<checkout>","<adultsperroom>" and "<childerperroom>"
    Then User should verfied login page sucess message "Select Hotel"
    And User should select hotel and click the continue button
    Then User should verfied the select hotel sucess message "Book A Hotel"

    Examples: 
      | username     | password    | location | hotels         | roomtype | noofrooms | checkin    | checkout   | adultsperroom | childerperroom |
      | venkatraj027 | harinathraj | Brisbane | Hotel Sunshine | Double   | 4 - Four  | 28/11/2022 | 29/11/2022 | 3 - Three     | 4 - Four       |

  @scenario9
  Scenario Outline: Verifying the select hotel page and without select hotel and then click on continue
    Given User is on the hotel page
    When User should enter login "<username>" and "<password>"
    Then User should verfied the login page sucess message "Hello venkatraj027!"
    When User should enter "<location>","<hotels>","<roomtype>","<noofrooms>","<checkin>","<checkout>","<adultsperroom>" and "<childerperroom>"
    Then User should verfied login page sucess message "Select Hotel"
    And User should without select hotel and click the continue button
    Then User should verfied the select hotel page with error message "Please Select a Hotel"

    Examples: 
      | username     | password    | location | hotels         | roomtype | noofrooms | checkin    | checkout   | adultsperroom | childerperroom |
      | venkatraj027 | harinathraj | Brisbane | Hotel Sunshine | Double   | 4 - Four  | 28/11/2022 | 29/11/2022 | 3 - Three     | 4 - Four       |
