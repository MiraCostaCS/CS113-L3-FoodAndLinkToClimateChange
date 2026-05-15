public class MyProgram {
    public static void main(String[] args) {

        // TODO: Create a SinglyLinkedList to store the negative impacts of beef & meat on climate change.
        // Example impacts to add:
        // - High Water Use: "Beef requires thousands of liters of water per kilogram."
        // - Deforestation: "Forests are cleared for cattle ranching and animal feed crops."
        // - Methane Pollution: "Cows emit methane, a powerful greenhouse gas."
        // - High Carbon Footprint: "Meat has a much larger footprint per calorie compared to plants."
        SingleLinkedList<Impact> meatImpacts = new SingleLinkedList<>();
        // Students: Use addLast() to add these Impact objects into the list.


        // TODO: Create another SinglyLinkedList to store the positive impacts of vegetarian/vegan diets.
        // Example impacts to add:
        // - Lower Water Use: "Lentils and beans need far less water than beef."
        // - Reduced Deforestation: "Less land is required for crops compared to cattle feed."
        // - Minimal Methane Emissions: "Plants do not produce methane like cows."
        // - Smaller Carbon Footprint: "Plant-based diets greatly reduce greenhouse gas emissions."
        SingleLinkedList<Impact> plantImpacts = new SingleLinkedList<>();
        // Students: Use addLast() to add these Impact objects into the list.


        // TODO: Print both lists using printList().
        // First print the meatImpacts list with a title:
        // "🌍 Impacts of Beef & Meat-heavy Diets on Climate Change:"
        // Then print the plantImpacts list with a title:
        // "🌱 Benefits of Vegetarian/Vegan Diets on Climate Change:"


        // TODO: Use size() to print how many impacts are in each list.


        // TODO: Call removeFirst() on the meatImpacts list to remove the first item,
        // print what was removed, and then print the updated list.


        // EXTRA CHALLENGE (Optional):
        // - Use contains() to check if a specific impact is in the list.
        // - Use get(index) to retrieve and print a specific impact by position.
    }
}
