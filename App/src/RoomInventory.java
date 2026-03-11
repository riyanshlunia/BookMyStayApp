import java.util.HashMap;
import java.util.Map;

/**
 * RoomInventory
 *
 * Manages the centralized inventory of hotel rooms.
 * Availability for each room type is stored in a HashMap.
 *
 * Version: 3.1
 */
public class RoomInventory {

    private HashMap<String, Integer> inventory;

    /**
     * Constructor initializes the inventory with default room counts.
     */
    public RoomInventory() {
        inventory = new HashMap<>();

        inventory.put("Single Room", 10);
        inventory.put("Double Room", 5);
        inventory.put("Suite Room", 2);
    }

    /**
     * Get availability of a specific room type.
     */
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    /**
     * Update availability of a specific room type.
     */
    public void updateAvailability(String roomType, int newCount) {
        inventory.put(roomType, newCount);
    }

    /**
     * Display current inventory state.
     */
    public void displayInventory() {
        System.out.println("\nCurrent Room Inventory:");

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " -> Available: " + entry.getValue());
        }
    }
}