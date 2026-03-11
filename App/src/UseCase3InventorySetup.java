/**
 * Use Case 3: Centralized Room Inventory Management
 *
 * Demonstrates the use of a HashMap to maintain a centralized
 * inventory of room availability.
 *
 * Version: 3.1
 */
public class UseCase3InventorySetup {

    public static void main(String[] args) {

        System.out.println("Book My Stay - Hotel Booking System v3.1");
        System.out.println("------------------------------------------");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Display current inventory
        inventory.displayInventory();

        // Retrieve availability
        System.out.println("\nChecking availability for Double Room:");
        int doubleRooms = inventory.getAvailability("Double Room");
        System.out.println("Available Double Rooms: " + doubleRooms);

        // Update availability
        System.out.println("\nUpdating availability for Double Room...");
        inventory.updateAvailability("Double Room", doubleRooms - 1);

        // Display updated inventory
        inventory.displayInventory();

        System.out.println("\nApplication terminated.");
    }
}