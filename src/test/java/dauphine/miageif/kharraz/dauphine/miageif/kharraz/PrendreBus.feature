#Author: Kharraz & Laabassi & Boubakhla & Oukhouya
#Scenario: Le robot prend un bus

Feature: F03_Prendre_bus
  En tant que robot, je prend un bus.

  Scenario Outline: Le robot prend le bus pour se déplacer d une place à une autre
    Given Robot se deplace vers la station
    When bus a prendre de la <statActName> situe a <xStatAct> et <yStatAct>
    And se dirige vers <statDstName> situe a <xStatDst> et <yStatDst>
    And  robot est dans <robotPosX> et <robotPosY>
    Then robot prend le bus

    	Examples: 
      	| statActName | xStatAct | yStatAct | statDstName | xStatDst | yStatDst | robotPosX | robotPosY |
        | "A"         | 20       |  25      |   "B"       | 75       |  75      |   5       |   5       |
        | "F"         | 120      |  50      |   "O"       | 15       |  35      |   98      |   9       |