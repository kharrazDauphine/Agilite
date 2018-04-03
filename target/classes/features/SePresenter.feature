#Author: Kharraz & Laabassi
#Scenario: Le robot se présente

Feature: F01_Se_présenter
  En tant que personne, je veux que mon robot puisse se présenter.

  Scenario Outline: Mike clique sur le bouton et le robot se présente
    Given Clique sur le bouton <btn> 
    When <energyLevel> supérieur ou égal à 25%
    Then Le robot se présente, le résultat de l'opération est <status>

    	Examples: 
      	| <btn	>				| energyLevel	| status  |
      	| Se présenter	|     30				| success |
    
  Scenario Outline: Mike clique sur le bouton et le robot ne peut pas se présenter
    Given Clique sur le bouton <btn> 
    When <energyLevel> inférieur à 25%
    Then Le robot ne peut pas se présenter, le résultat de l'opération est <status>

    	Examples: 
      	| <btn	>				| energyLevel	| status	|
      	| Se présenter	|     15				| fail 	|