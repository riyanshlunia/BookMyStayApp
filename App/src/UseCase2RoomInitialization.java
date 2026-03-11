/**
 * Abstract class representing a generic Room.
 * Defines common properties shared by all room types.
 */
abstract class UseCase2RoomInitialization {

    protected String roomType;
    protected int beds;
    protected double price;

    public UseCase2RoomInitialization(String roomType, int beds, double price) {
        this.roomType = roomType;
        this.beds = beds;
        this.price = price;
    }

    public void displayRoomDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + beds);
        System.out.println("Price per night: $" + price);
    }
}