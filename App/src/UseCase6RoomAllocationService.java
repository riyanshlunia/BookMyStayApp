/**
 * Use Case 6: Reservation Confirmation & Room Allocation
 *
 * Processes booking requests and assigns rooms safely
 * while preventing double booking.
 *
 * Version: 6.1
 */
public class UseCase6RoomAllocationService {

    public static void main(String[] args) {

        System.out.println("Book My Stay - Hotel Booking System v6.1");
        System.out.println("-----------------------------------------");

        RoomInventory inventory = new RoomInventory();

        BookingRequestQueue queue = new BookingRequestQueue();

        // Guest booking requests
        queue.addRequest(new Reservation("Alice", "Single Room"));
        queue.addRequest(new Reservation("Bob", "Double Room"));
        queue.addRequest(new Reservation("Charlie", "Suite Room"));

        RoomAllocationService allocator = new RoomAllocationService(inventory);

        // Process queue
        while (!queue.isEmpty()) {

            Reservation request = queue.getNextRequest();

            allocator.allocateRoom(request);
        }

        inventory.displayInventory();
    }
}