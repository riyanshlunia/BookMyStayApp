# Book My Stay App

## Use Case 6: Reservation Confirmation & Room Allocation

This use case introduces the reservation confirmation process where booking requests are processed and rooms are allocated safely. The system ensures that each confirmed reservation receives a unique room ID while maintaining inventory consistency.

The booking service processes requests from the queue and performs controlled allocation by validating availability and updating inventory immediately.

---

## Goal

Confirm booking requests by assigning rooms safely while ensuring inventory consistency and preventing double booking under all circumstances.

---

## Actors

Booking Service
Processes queued booking requests and performs room allocation.

Inventory Service
Maintains and updates room availability state.

---

## Flow of Execution

1. A booking request is removed from the request queue.
2. The system checks availability for the requested room type.
3. A unique room ID is generated.
4. The room ID is recorded to prevent reuse.
5. Inventory count is updated immediately.
6. Reservation is confirmed.

---

## Key Java Concepts Used

### Set Data Structure

A `Set<String>` is used to store allocated room IDs.

```java
Set<String> allocatedRooms = new HashSet<>();
```

Sets enforce uniqueness, preventing duplicate room assignments.

---

### HashMap Mapping

A `HashMap<String, Set<String>>` maps each room type to its allocated room IDs.

This allows grouped tracking of assigned rooms.

---

### FIFO Queue Processing

Booking requests are processed in FIFO order using a queue.

This ensures fairness and predictable processing order.

---

### Atomic Allocation Logic

Room allocation and inventory updates occur together as one logical unit, preventing partial system updates.

---

### Inventory Synchronization

Inventory is updated immediately after allocation to maintain accurate availability.

---

## Key Requirements

* Retrieve booking requests from the queue in FIFO order
* Generate a unique room ID for every confirmed reservation
* Prevent reuse of room IDs
* Update inventory immediately after allocation
* Maintain consistent system state

---

## How to Compile and Run

Compile the program:

```
javac UseCase6RoomAllocationService.java
```

Run the program:

```
java UseCase6RoomAllocationService
```

---

## Key Benefits

* Guaranteed uniqueness of room assignments
* Immediate synchronization between booking and inventory
* Prevention of double booking scenarios
* Consistent and reliable reservation processing

---

## Drawbacks of Previous Use Case

Use Case 5 introduced booking request ordering but did not confirm reservations or assign rooms. Without allocation and uniqueness enforcement, queued requests could still result in conflicting assignments.
