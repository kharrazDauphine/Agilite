#Author: Kharraz & Laabassi
#Scenario: Le robot se charge

Feature: F01_Se_présenter
  En tant que personne, je met mon robot en charge.

  Scenario Outline: Mike charge son robot
    Given Mike charge son robot 
    When Mike branche son robot
    Then batterie augmente 
