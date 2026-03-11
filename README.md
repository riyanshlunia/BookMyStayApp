# Book My Stay App

## Use Case 5: Booking Request (First-Come-First-Served)

This use case introduces a booking request intake mechanism that allows the system to collect guest booking requests before they are processed by the allocation system. The objective is to handle multiple booking requests fairly while preserving the order in which requests arrive.

A queue data structure is used to store booking requests, ensuring that they are processed in a First-Come-First-Served (FIFO) order.

---

## Goal

Handle multiple booking requests fairly by introducing a request intake mechanism that preserves arrival order, reflecting real-world booking behavior during peak demand.

---

## Actors

Reservation
Represents a guest's intention to book a specific room type.

Booking Request Queue
Manages incoming booking requests and maintains their order.

---

## Flow of Execution

1. A guest submits a booking request.
2. The request is added to the booking queue.
3. Requests are stored in arrival order.
4. Queued requests wait for processing by the allocation system.
5. No inventory mutation occurs at this stage.

---

## Key Java Concepts Used

### Queue Data Structure

A `Queue<Reservation>` is used to store booking requests.

Example:

```java
Queue<Reservation> requestQueue = new LinkedList<>();
```

Queues naturally model waiting lines where elements are processed sequentially.

---

### FIFO Principle

FIFO (First-Come-First-Served) ensures that the earliest booking request is processed first. This ensures fairness in booking request handling.

---

### Fairness

Using a queue guarantees that no request can bypass another request. All guests are treated equally based on arrival order.

---

### Request Ordering

The queue preserves insertion order automatically, eliminating the need for manual sorting or timestamp comparison.

---

### Decoupling Request Intake from Allocation

Booking requests are collected first and processed later. This separation allows the system to manage high demand and handle allocation more safely.

---

## Key Requirements

* Accept booking requests from guests
* Store requests in a queue structure
* Preserve request arrival order
* Avoid room allocation at this stage
* Prepare requests for later processing

---

## How to Compile and Run

Compile the program:

```bash
javac UseCase5BookingRequestQueue.java
```

Run the program:

```bash
java UseCase5BookingRequestQueue
```

---

## Example Output

```
Booking request added for Alice
Booking request added for Bob
Booking request added for Charlie

Current Booking Queue:
Guest: Alice | Requested Room: Single Room
Guest: Bob | Requested Room: Double Room
Guest: Charlie | Requested Room: Suite Room
```

---

## Key Benefits

* Fair booking request handling
* Predictable system behavior during peak demand
* Simplified coordination before allocation
* Maintains request order automatically

---

## Drawbacks of Previous Use Case

Use Case 4 allowed guests to view available rooms but did not handle booking intent. Without a request intake mechanism, simultaneous booking attempts could not be handled fairly.
