@cancel
Feature: Verify Booking Confirmation page as cancel the booking the hotel

  @scenario12
  Scenario Outline: Verifying the Booking Confirmation page cancel the booking
    Given User is on the hotel page
    When User should enter login "<Username>" and "<password>"
    Then User should verfied the login page sucess message "Hello venkatraj027!"
    When User should enter "<location>","<hotels>","<roomtype>","<noofrooms>","<checkin>","<checkout>","<adultsperroom>" and "<childerperroom>"
    Then User should verfied login page sucess message "Select Hotel"
    And User should select hotel and click the continue button
    Then User should verfied the select hotel sucess message "Book A Hotel"
    And User should book hotel "<First Name>","<Last Name>" and "<Billing Address>"
      | Credit Card No   | Credit Card Type | select month | select year | CVV Number |
      | 1234567890123456 | VISA             | June         |        2024 |       0123 |
      | 4789652456456655 | Master Card      | October      |        2022 |       0258 |
    Then User should verfied the booking sucess message "Booking Confirmation" and save the order id
    And User should cancel order id in Booked Itinerary page
    Then User should after cancel oder id sucess message "The booking has been cancelled."

    Examples: 
      | Username     | password    | location | hotels         | roomtype | noofrooms | checkin    | checkout   | adultsperroom | childerperroom | First Name | Last Name   | Billing Address |
      | venkatraj027 | harinathraj | Brisbane | Hotel Sunshine | Double   | 4 - Four  | 29/11/2022 | 30/11/2022 | 3 - Three     | 4 - Four       | prabhakara | subramanian | karapakam       |

  @scenario13
  Scenario Outline: Verifying the Booked Itinerary page cancel the existing order id
    Given User is on the hotel page
    When User should enter login "<Username>" and "<password>"
    Then User should verfied the login page sucess message "Hello venkatraj027!"
    And User should cancel the existing order id in Booked Itinerary page "<order id>"
    Then User should after cancel oder id sucess message "The booking has been cancelled."

    Examples: 
      | Username     | password    | order id   |
      | venkatraj027 | harinathraj | J853D14A33 |
