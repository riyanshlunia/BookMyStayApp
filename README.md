# Book My Stay App

## Use Case 7: Add-On Service Selection

This use case extends the reservation system by allowing guests to select optional add-on services such as breakfast, spa access, and airport pickup. The system ensures that these services are linked to existing reservations without affecting room allocation or inventory state.

The add-on service manager handles the association between reservations and selected services, while cost calculation is performed independently of the core booking process.

---

## Goal

Enable guests to attach optional services to a reservation while maintaining separation from core booking and inventory logic.

---

## Actors

Guest  
Selects one or more optional services for an existing reservation.

Add-On Service  
Represents an individual optional offering with a name and cost.

Add-On Service Manager  
Maintains mapping between reservations and selected services and calculates additional costs.

---

## Flow of Execution

1. The guest selects one or more add-on services.
2. Selected services are stored in a list.
3. The list is mapped to the corresponding reservation ID.
4. Additional cost is calculated based on selected services.
5. Core booking and inventory remain unchanged.

---

## Key Java Concepts Used

### Map and List Combination

A `Map<String, List<Service>>` is used to map reservation IDs to selected services.

```java
Map<String, List<Service>> reservationServices = new HashMap<>();