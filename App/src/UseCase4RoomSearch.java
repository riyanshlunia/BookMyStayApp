/**
 * Use Case 4: Room Search & Availability Check
 *
 * Demonstrates safe read-only access to inventory while
 * displaying room information.
 *
 * Version: 4.1
 */
public class UseCase4RoomSearch {

    public static void main(String[] args) {

        System.out.println("Book My Stay - Hotel Booking System v4.1");
        System.out.println("------------------------------------------");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Initialize rooms
        Room[] rooms = {
                new SingleRoom(),
                new DoubleRoom(),
                new SuiteRoom()
        };

        // Search service
        RoomSearchService searchService = new RoomSearchService(inventory);

        // Perform search
        searchService.searchAvailableRooms(rooms);

        System.out.println("\nSearch completed. No inventory changes were made.");
    }
}