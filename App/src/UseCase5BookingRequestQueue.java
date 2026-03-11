/**
 * Use Case 5: Booking Request Queue
 *
 * Demonstrates handling booking requests using
 * a FIFO queue structure.
 *
 * Version: 5.1
 */
public class UseCase5BookingRequestQueue {

    public static void main(String[] args) {

        System.out.println("Book My Stay - Hotel Booking System v5.1");
        System.out.println("-----------------------------------------");

        BookingRequestQueue queue = new BookingRequestQueue();

        // Guests submit booking requests
        Reservation r1 = new Reservation("Alice", "Single Room");
        Reservation r2 = new Reservation("Bob", "Double Room");
        Reservation r3 = new Reservation("Charlie", "Suite Room");

        // Add requests to queue
        queue.addRequest(r1);
        queue.addRequest(r2);
        queue.addRequest(r3);

        // Display queue
        queue.displayRequests();

        System.out.println("\nRequests are waiting for allocation.");
    }
}