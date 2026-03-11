import java.util.HashMap;
import java.util.Map;

/**
 * Handles read-only room search operations.
 */
public class RoomSearchService {

    private RoomInventory inventory;

    public RoomSearchService(RoomInventory inventory) {
        this.inventory = inventory;
    }

    public void searchAvailableRooms(Room[] rooms) {

        System.out.println("\nAvailable Rooms:");

        HashMap<String, Integer> inv = inventory.getAllInventory();

        for (Room room : rooms) {

            int available = inv.getOrDefault(room.getType(), 0);

            if (available > 0) {
                room.displayDetails();
                System.out.println("Available: " + available);
                System.out.println("--------------------------");
            }
        }
    }
}