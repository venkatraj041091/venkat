@booking
Feature: Verify the adatin hotel page and booking the hotel

  @scenario10
  Scenario Outline: Verifying the Book A Hotel page and book the hotel with enter all fields
    Given User is on the hotel page
    When User should enter login "<username>" and "<password>"
    Then User should verfied the login page sucess message "Hello venkatraj027!"
    When User should enter "<location>","<hotels>","<roomtype>","<noofrooms>","<checkin>","<checkout>","<adultsperroom>" and "<childerperroom>"
    Then User should verfied login page sucess message "Select Hotel"
    And User should select hotel and click the continue button
    Then User should verfied the select hotel sucess message "Book A Hotel"
    And User should book hotel "<First Name>","<Last Name>" and "<Billing Address>"
      | Credit Card No   | Credit Card Type | select month | select year | CVV Number |
      | 1234567890123456 | VISA             | June         |        2022 |       0123 |
      | 4789652456456655 | Master Card      | October      |        2022 |       0258 |
    Then User should verfied the booking sucess message "Booking Confirmation" and save the order id

    Examples: 
      | username     | password    | location | hotels         | roomtype | noofrooms | checkin    | checkout   | adultsperroom | childerperroom | First Name | Last Name   | Billing Address |
      | venkatraj027 | harinathraj | Brisbane | Hotel Sunshine | Double   | 4 - Four  | 28/11/2022 | 29/11/2022 | 3 - Three     | 4 - Four       | prabhakara | subramanian | karapakam       |

  @scenario11
  Scenario Outline: Verifying the Book A Hotel page without enter any fields and click book button
    Given User is on the hotel page
    When User should enter login "<username>" and "<password>"
    Then User should verfied the login page sucess message "Hello venkatraj027!"
    When User should enter "<location>","<hotels>","<roomtype>","<noofrooms>","<checkin>","<checkout>","<adultsperroom>" and "<childerperroom>"
    Then User should verfied login page sucess message "Select Hotel"
    And User should select hotel and click the continue button
    Then User should verfied the select hotel sucess message "Book A Hotel"
    And User should click book now button
    Then User should verfied the book a hotel page with error message "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Use 16 digit Dummy Data","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | username     | password    | location | hotels         | roomtype | noofrooms | checkin    | checkout   | adultsperroom | childerperroom |
      | venkatraj027 | harinathraj | Brisbane | Hotel Sunshine | Double   | 4 - Four  | 28/11/2022 | 29/11/2022 | 3 - Three     | 4 - Four       |
