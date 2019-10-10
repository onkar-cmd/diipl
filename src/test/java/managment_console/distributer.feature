#add distributer
@Add @smoke
Feature: Distributer add
  Scenario Outline: Test Add distributer
  Given Distributer add "<Dis_name>"
  Then close managment console.
  
  Examples:
  | Dis_name |
  |Distributer cucumber |
  
  
  
  

  

 
