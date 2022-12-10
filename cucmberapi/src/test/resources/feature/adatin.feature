Feature: verify the adatin hotel login page

  Scenario Outline: verifying the hotel valid page
    Given user is on the hotel page
    When user should enter login "<username>","<password>"
    And hotel option should selected "<location>","<hotels>","<roomtype>","<noofrooms>","<checkin>","<checkout>","<adultsperroom>","<childerperroom">
    And select hotel and user should enter details adress and payment "<firstname>","<lastname>","<bill adress>","<cardno>","<cardtype>","<expiry month>","<expiry year>","<cvv>"
    Then user should get order no and successfull message "Search Hotel"

    Examples: 
      | username     | password    | location | hotels         | roomtype | noofrooms | adultsperroom | childerperroom | firstname | lastname | bill adress | cardno           | cardtype         | expiry month | expiry year | cvv  |  |
      | venkatraj027 | harinathraj | Brisbane | Hotel Sunshine | Double   | 4 - Four  | 3 - Three     | 4 - Four       | raj       | thiyagu  | karapakkam  | 1234567890123456 | American Express | February     |        2014 | 1234 |  |
      | venkatraj027 | harinathraj | Brisbane | Hotel Sunshine | Double   | 4 - Four  | 3 - Three     | 4 - Four       | raj       | hema     | karapakkam  | 1234567890123456 | American Express | February     |        2014 | 1234 |  |
      | venkatraj027 | harinathraj | Brisbane | Hotel Sunshine | Double   | 4 - Four  | 3 - Three     | 4 - Four       | raj       | dinesh   | karapakkam  | 1234567890123456 | American Express | February     |        2014 | 1234 |  |
      | venkatraj027 | harinathraj | Brisbane | Hotel Sunshine | Double   | 4 - Four  | 3 - Three     | 4 - Four       | raj       | thiyagu  | karapakkam  | 1234567890123456 | American Express | February     |        2014 | 1234 |  |
      | venkatraj027 | harinathraj | Brisbane | Hotel Sunshine | Double   | 4 - Four  | 3 - Three     | 4 - Four       | raj       | thiyagu  | karapakkam  | 1234567890123456 | American Express | February     |        2014 | 1234 |  |
      | venkatraj027 | harinathraj | Brisbane | Hotel Sunshine | Double   | 4 - Four  | 3 - Three     | 4 - Four       | raj       | naveen   | karapakkam  | 1234567890123456 | American Express | February     |        2014 | 1234 |  |
      | venkatraj027 | harinathraj | Brisbane | Hotel Sunshine | Double   | 4 - Four  | 3 - Three     | 4 - Four       | raj       | thiyagu  | karapakkam  | 1234567890123456 | American Express | February     |        2014 | 1234 |  |
      | venkatraj027 | harinathraj | Brisbane | Hotel Sunshine | Double   | 4 - Four  | 3 - Three     | 4 - Four       | raj       | thiyagu  | karapakkam  | 1234567890123456 | American Express | February     |        2014 | 1234 |  |
      | venkatraj027 | harinathraj | Brisbane | Hotel Sunshine | Double   | 4 - Four  | 3 - Three     | 4 - Four       | raj       | thiyagu  | karapakkam  | 1234567890123456 | American Express | February     |        2014 | 1234 |  |
      | venkatraj027 | harinathraj | Brisbane | Hotel Sunshine | Double   | 4 - Four  | 3 - Three     | 4 - Four       | raj       | thiyagu  | karapakkam  | 1234567890123456 | American Express | February     |        2014 | 1234 |  |
