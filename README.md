# Book My Stay App

## Use Case 2: Basic Room Types and Static Availability

This use case extends the Hotel Booking Management System by introducing **object-oriented domain modeling**. The goal is to demonstrate how inheritance, abstraction, and polymorphism can be used to represent different room types in a hotel system before introducing more complex data structures for inventory management.

The system defines different types of hotel rooms and displays their details along with their current availability using simple variables.

---

## Goal

Introduce object modeling through inheritance and abstraction so that students can focus on **domain design** before implementing data structures for optimization.

---

## Actor

User

The user runs the application from the command line or an IDE to view predefined room types and their availability.

---

## Flow of Execution

1. The user runs the application.
2. Room objects representing different room types are created.
3. Availability for each room type is stored using simple variables.
4. Room details and availability are printed to the console.
5. The application terminates.

---

## Key Java Concepts Used

### Abstract Class

An abstract class named `Room` represents the generalized concept of a room.
It defines common attributes and behavior shared by all room types and cannot be instantiated directly.

### Inheritance

Concrete room classes such as `SingleRoom`, `DoubleRoom`, and `SuiteRoom` extend the abstract `Room` class.
This allows shared properties to be reused while allowing each room type to define its own characteristics.

### Polymorphism

Room objects are referenced using the `Room` type.
This allows different room implementations to be handled uniformly.

### Encapsulation

Room attributes such as room type, number of beds, and price are encapsulated within the `Room` class and accessed through defined methods.

### Static Availability Representation

Room availability is stored using individual variables instead of data structures.
This highlights the limitations of static state management and prepares the system for future improvements.

### Separation of Domain and State

Room objects represent **what a room is**, while availability variables represent **the current system state**.

---

## Key Requirements

* Define an abstract `Room` class with common attributes.
* Create concrete classes for:

    * `SingleRoom`
    * `DoubleRoom`
    * `SuiteRoom`
* Initialize room objects in the application entry point.
* Store room availability using simple variables.
* Display room details and availability to the console.

---

## How to Compile and Run

### Compile the Program

```bash
javac UseCase2RoomInitialization.java
```

### Run the Program

```bash
java UseCase2RoomInitialization
```

---

## Example Output

```
Book My Stay - Hotel Booking System v2.1

Single Room Details:
Room Type: Single Room
Beds: 1
Price per night: $100.0
Available Rooms: 10

Double Room Details:
Room Type: Double Room
Beds: 2
Price per night: $180.0
Available Rooms: 5

Suite Room Details:
Room Type: Suite Room
Beds: 3
Price per night: $300.0
Available Rooms: 2
```

---

## Benefits of This Use Case

* Demonstrates abstraction and inheritance in a real-world scenario
* Introduces structured domain modeling for hotel rooms
* Prepares the system for scalable inventory management in later use cases
* Establishes a clean separation between domain objects and application state

---

## Drawbacks of Previous Use Case

Use Case 1 focused only on application startup and execution flow.
No domain modeling or business logic was introduced, limiting the realism of the system.
