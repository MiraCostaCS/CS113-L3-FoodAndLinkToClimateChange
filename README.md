# Lab #3 - Food and the Link to Climate Change

## Objective
Practice using your `SinglyLinkedList` class to store and manipulate objects representing the environmental impacts of different diets. You will work with two lists: one for meat-heavy diets and one for vegetarian/vegan diets.

## Preparation
-  Ensure you have your `SinglyLinkedList` class from your in-class work. Copy and paste it into your project.

## Steps to Complete the Exercise:
1.  **Create a `SinglyLinkedList` for meat impacts:**
  *   Instantiate a `SinglyLinkedList` named `meatImpacts`.
  *   Add the following `Impact` objects using `addLast()`:
    *   "High Water Use" - "Beef requires thousands of liters of water per kilogram."
    *   "Deforestation" - "Forests are cleared for cattle ranching and animal feed crops."
    *   "Methane Pollution" - "Cows emit methane, a powerful greenhouse gas."
    *   "High Carbon Footprint" - "Meat has a much larger footprint per calorie compared to plants."
2.  **Create a `SinglyLinkedList` for plant-based impacts:**
  *   Instantiate a `SinglyLinkedList` named `plantImpacts`.
  *   Add the following `Impact` objects using `addLast()`:
    *   "Lower Water Use" - "Lentils and beans need far less water than beef."
    *   "Reduced Deforestation" - "Less land is required for crops compared to cattle feed."
    *   "Minimal Methane Emissions" - "Plants do not produce methane like cows."
    *   "Smaller Carbon Footprint" - "Plant-based diets greatly reduce greenhouse gas emissions."
3.  **Print the lists:**
  *   Use the `printList()` method to display both lists.

Output should look something like this:
```
🌍 Impacts of Beef & Meat-heavy Diets on Climate Change:
High Water Use
Deforestation
Methane Pollution
High Carbon Footprint

🌱 Benefits of Vegetarian/Vegan Diets on Climate Change:
Lower Water Use
Reduced Deforestation
Minimal Methane Emissions
Smaller Carbon Footprint

Number of meat impacts listed: 4
Number of plant-based benefits listed: 4

Removing the first meat impact: High Water Use
Updated meat impact list:
Deforestation
Methane Pollution
High Carbon Footprint
```
