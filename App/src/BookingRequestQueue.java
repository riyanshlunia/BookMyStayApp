import java.util.LinkedList;
import java.util.Queue;

/**
 * Manages incoming booking requests using FIFO queue.
 */
public class BookingRequestQueue {

    private Queue<Reservation> requestQueue;

    public BookingRequestQueue() {
        requestQueue = new LinkedList<>();
    }

    /**
     * Add booking request to queue
     */
    public void addRequest(Reservation reservation) {
        requestQueue.add(reservation);
        System.out.println("Booking request added for " + reservation.getGuestName());
    }

    /**
     * Display all queued requests
     */
    public void displayRequests() {

        System.out.println("\nCurrent Booking Queue:");

        for (Reservation r : requestQueue) {
            r.displayReservation();
        }
    }
}