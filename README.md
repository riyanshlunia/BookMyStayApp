# Book My Stay App

## Use Case 4: Room Search & Availability Check

This use case introduces the ability for guests to search and view available rooms without modifying the system state. The goal is to provide a safe and controlled way to retrieve information from the system while maintaining a clear separation between read-only operations and inventory updates.

The search functionality retrieves room availability from the centralized inventory and displays only those room types that currently have available rooms.

---

## Goal

Enable guests to view available rooms and their details without modifying the system state. This reinforces safe data access and separation of responsibilities.

---

## Actors

Guest
Initiates a room search to view available room options.

Search Service
Handles read-only access to inventory and room information.

---

## Flow of Execution

1. The guest initiates a room search request.
2. The system retrieves availability data from the centralized inventory.
3. Room details and pricing are obtained from room objects.
4. Room types with zero availability are filtered out.
5. Available rooms and their details are displayed.
6. The system state remains unchanged.

---

## Key Java Concepts Used

### Read-Only Access

Search operations only read data from the inventory. No updates are performed during search operations, ensuring system stability.

---

### Defensive Programming

The search logic verifies that only room types with availability greater than zero are displayed.

---

### Separation of Concerns

Search functionality is separated from inventory updates and booking logic. Searching only retrieves information and does not affect system state.

---

### Inventory as State Holder

The inventory component stores the current availability of rooms and provides access to that data.

---

### Domain Model Usage

Room objects contain descriptive information such as room type, number of beds, and pricing. This prevents duplication of room data across system components.

---

### Validation Logic

Room types with zero availability are filtered out so guests only see rooms that can actually be booked.

---

## Key Requirements

* Retrieve room availability from the centralized inventory
* Display only room types with availability greater than zero
* Show room details and pricing using room objects
* Ensure inventory data is not modified during search operations
* Maintain a clear boundary between search and booking logic

---

## How to Compile and Run

Compile the program:

```bash
javac UseCase4RoomSearch.java
```

Run the program:

```bash
java UseCase4RoomSearch
```

---

## Example Output

```
Book My Stay - Hotel Booking System v4.1

Available Rooms:

Room Type: Single Room
Beds: 1
Price per night: $100.0
Available: 10
--------------------------

Room Type: Double Room
Beds: 2
Price per night: $180.0
Available: 5
--------------------------

Search completed. No inventory changes were made.
```

---

## Key Benefits

* Guests can view accurate room availability
* Inventory state remains protected from accidental modification
* Clear separation between read-only and write operations
* Improves system reliability and maintainability

---

## Drawbacks of Previous Use Case

Use Case 3 introduced centralized inventory management but did not explicitly separate read and write access. Without this separation, inventory could potentially be modified during search operations, leading to unintended system behavior.
