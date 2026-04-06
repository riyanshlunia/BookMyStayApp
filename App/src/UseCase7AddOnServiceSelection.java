import java.util.*;

// Represents an Add-On Service
class Service {
    private String serviceName;
    private double cost;

    public Service(String serviceName, double cost) {
        this.serviceName = serviceName;
        this.cost = cost;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return serviceName + " (₹" + cost + ")";
    }
}

// Manages Add-On Services for Reservations
class AddOnServiceManager {

    // Map<ReservationID, List of Services>
    private Map<String, List<Service>> reservationServices;

    public AddOnServiceManager() {
        reservationServices = new HashMap<>();
    }

    // Add service to a reservation
    public void addService(String reservationId, Service service) {
        reservationServices
                .computeIfAbsent(reservationId, k -> new ArrayList<>())
                .add(service);

        System.out.println("Service added: " + service.getServiceName() +
                " to Reservation ID: " + reservationId);
    }

    // Get services for a reservation
    public List<Service> getServices(String reservationId) {
        return reservationServices.getOrDefault(reservationId, new ArrayList<>());
    }

    // Calculate total cost of services
    public double calculateTotalServiceCost(String reservationId) {
        double total = 0;
        List<Service> services = getServices(reservationId);

        for (Service s : services) {
            total += s.getCost();
        }

        return total;
    }

    // Display services
    public void displayServices(String reservationId) {
        List<Service> services = getServices(reservationId);

        if (services.isEmpty()) {
            System.out.println("No add-on services selected.");
            return;
        }

        System.out.println("Add-On Services for Reservation ID: " + reservationId);
        for (Service s : services) {
            System.out.println("- " + s);
        }
    }
}

// Main Class
public class UseCase7AddOnServiceSelection {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AddOnServiceManager manager = new AddOnServiceManager();

        System.out.print("Enter Reservation ID: ");
        String reservationId = scanner.nextLine();

        // Sample services
        Service breakfast = new Service("Breakfast", 500);
        Service spa = new Service("Spa Access", 1500);
        Service airportPickup = new Service("Airport Pickup", 800);

        while (true) {
            System.out.println("\n--- Add-On Services Menu ---");
            System.out.println("1. Add Breakfast");
            System.out.println("2. Add Spa Access");
            System.out.println("3. Add Airport Pickup");
            System.out.println("4. View Services");
            System.out.println("5. Calculate Total Cost");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manager.addService(reservationId, breakfast);
                    break;

                case 2:
                    manager.addService(reservationId, spa);
                    break;

                case 3:
                    manager.addService(reservationId, airportPickup);
                    break;

                case 4:
                    manager.displayServices(reservationId);
                    break;

                case 5:
                    double total = manager.calculateTotalServiceCost(reservationId);
                    System.out.println("Total Add-On Cost: ₹" + total);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}