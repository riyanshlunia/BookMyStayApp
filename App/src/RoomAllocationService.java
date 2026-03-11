import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Handles reservation confirmation and room allocation.
 */
public class RoomAllocationService {

    private RoomInventory inventory;

    // Map room type -> allocated room IDs
    private HashMap<String, Set<String>> allocatedRooms;

    public RoomAllocationService(RoomInventory inventory) {

        this.inventory = inventory;
        allocatedRooms = new HashMap<>();

        allocatedRooms.put("Single Room", new HashSet<>());
        allocatedRooms.put("Double Room", new HashSet<>());
        allocatedRooms.put("Suite Room", new HashSet<>());
    }

    public void allocateRoom(Reservation reservation) {

        String type = reservation.getRoomType();

        int available = inventory.getAvailability(type);

        if (available <= 0) {
            System.out.println("No rooms available for " + type);
            return;
        }

        // Generate unique room ID
        String roomID = UUID.randomUUID().toString().substring(0, 8);

        Set<String> allocatedSet = allocatedRooms.get(type);

        // Ensure uniqueness
        while (allocatedSet.contains(roomID)) {
            roomID = UUID.randomUUID().toString().substring(0, 8);
        }

        allocatedSet.add(roomID);

        // Update inventory
        inventory.decrementRoom(type);

        System.out.println("Reservation confirmed for " + reservation.getGuestName());
        System.out.println("Room Type: " + type);
        System.out.println("Allocated Room ID: " + roomID);
        System.out.println("-----------------------------");
    }
}