# Book My Stay App

## Use Case 1: Application Entry & Welcome Message

This project demonstrates the design and implementation of a Hotel Booking Management System using Core Java and fundamental data structures. The system is developed incrementally, with each use case introducing a specific concept that addresses common software engineering challenges such as fair request handling, inventory consistency, and prevention of double booking.

---

## Goal

The goal of this use case is to establish a clear and predictable starting point for the Hotel Booking application by demonstrating how a Java program begins execution and prints a welcome message.

---

## Actor

User

The user runs the application from the command line or from an Integrated Development Environment (IDE).

---

## Flow of Execution

1. The user runs the application.
2. The Java Virtual Machine (JVM) invokes the `main()` method.
3. The application prints a welcome message along with the application name and version.
4. The application terminates.

---

## Key Java Concepts Used

### Class

Every Java application must be defined inside a class. The class acts as a container for the application behavior.

### main() Method

The `main()` method is the entry point of every standalone Java application.

```java
public static void main(String[] args)
```

The JVM looks for this method signature to begin execution.

### static Keyword

The `main()` method is declared static so that it can run without creating an object of the class.

### Console Output

`System.out.println()` is used to print output to the console.

### String Literals

Text enclosed in double quotes such as `"Hotel Booking System v1.0"` is treated as a String literal.

### Method Invocation

Calling `println()` on `System.out` demonstrates how methods are invoked on objects in Java.

### Application Flow

Execution proceeds sequentially from top to bottom inside the `main()` method.

### JavaDoc Comments

JavaDoc comments are used to document the class and its purpose, helping developers understand the functionality of the code.

---

## Key Requirements

* Create a Java class that represents the application entry point
* Implement the `main()` method with the correct signature
* Print a welcome message to the console
* Display the application name and version
* Include JavaDoc documentation
* Ensure the program executes without errors

---

## How to Run the Program

### Step 1: Compile the Program

```bash
javac UseCase1HotelBookingApp.java
```

### Step 2: Run the Program

```bash
java UseCase1HotelBookingApp
```

---

## Example Output

```
=================================
 Welcome to Book My Stay
 Hotel Booking System v1.0
=================================
Application started successfully.
```

---

## Benefits of This Use Case

* Clear and predictable application startup behavior
* Single well-defined execution entry point
* Improved debuggability during early development
* Provides a foundation for building more complex system features

---

## Future Extensions

Future use cases will introduce additional system features including:

* Room inventory management
* Booking request processing
* Prevention of double booking
* Data structure based request handling
* Booking confirmation logic
