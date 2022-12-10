@searchhotel
Feature: Verify the adatin hotel page and validate the datas in search hotel page

  Background: 
    Given User is on the hotel page

  @scenario4
  Scenario Outline: Verifying the search hotel page select all fields
    When User should enter login "<username>" and "<password>"
    Then User should verfied the login page sucess message "Hello venkatraj027!"
    When User should enter "<location>","<hotels>","<roomtype>","<noofrooms>","<checkin>","<checkout>","<adultsperroom>" and "<childerperroom>"
    Then User should verfied login page sucess message "Select Hotel"

    Examples: 
      | username     | password    | location | hotels         | roomtype | noofrooms | checkin    | checkout   | adultsperroom | childerperroom |
      | venkatraj027 | harinathraj | Brisbane | Hotel Sunshine | Double   | 4 - Four  | 28/11/2022 | 29/11/2022 | 3 - Three     | 4 - Four       |

  @scenario5
  Scenario Outline: Verifying the search hotel page and select manatory fields only
    When User should enter login "<username>" and "<password>"
    Then User should verfied the login page sucess message "Hello venkatraj027!"
    When User should enter manatory fieds only "<location>","<noofrooms>","<checkin>","<checkout>" and "<adultsperroom>"
    Then User should verfied login page sucess message "Select Hotel"

    Examples: 
      | username     | password    | location | noofrooms | checkin    | checkout    | adultsperroom |
      | venkatraj027 | harinathraj | Brisbane | 4 - Four  | 28/11/2022 | 29//11/2022 | 3 - Three     |

  @scenario6
  Scenario Outline: Verifying the search hotel page and verify the date checking
    When User should enter login "<username>" and "<password>"
    Then User should verfied the login page sucess message "Hello venkatraj027!"
    When User should enter "<location>","<hotels>","<roomtype>","<noofrooms>","<checkin>","<checkout>","<adultsperroom>" and "<childerperroom>"
    Then User should verfied the search page date with invalid date error message "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username     | password    | location | hotels         | roomtype | noofrooms | checkin    | checkout   | adultsperroom | childerperroom |
      | venkatraj027 | harinathraj | Brisbane | Hotel Sunshine | Double   | 4 - Four  | 27/11/2022 | 26/11/2022 | 3 - Three     | 4 - Four       |

  @scenario7
  Scenario Outline: Verifying the search hotel page without enter any field and click search
    When User should enter login "<username>" and "<password>"
    Then User should verfied the login page sucess message "Hello venkatraj027!"
    When User should enter search button without enter any field
    Then User should verfied the search page location with error message "Please Select a Location"

    Examples: 
      | username     | password    |
      | venkatraj027 | harinathraj |
