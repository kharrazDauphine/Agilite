#Author: Kharraz & Laabassi
#Scenario: Le robot se charge

Feature: F02_Se_charger
  En tant que personne, je met mon robot en charge.

  Scenario Outline: Mike charge son robot et le robot se charge
    Given Mike charge son robot 
    When <energy> moins de cent
    And  robot se charge de <power>
    Then chargement réussi

    	Examples: 
      	|	energy	|	power	|
    		|	30			|	50			|
    		|	20			|	90			|	

  Scenario Outline: Mike charge son robot et le robot est déjà chargé
    Given Mike charge son robot 
    When <energy> egal a cent
    And  essai de charger de <power>
    Then chargement echoue

    	Examples: 
      	|	energy	|	power	|
        |	100		|	50			|
    		
  