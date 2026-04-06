# Book My Stay App

## Use Case 9: Error Handling & Validation

This use case introduces structured validation and error handling to improve system reliability. The system ensures that invalid inputs and inconsistent states are detected early and handled gracefully without affecting overall application stability.

Validation logic is applied before processing bookings, and custom exceptions are used to represent domain-specific errors.

---

## Goal

Ensure system reliability by validating inputs, preventing invalid state changes, and handling errors gracefully.

---

## Actors

Guest  
Provides booking input that must be validated.

Invalid Booking Validator  
Validates input and system constraints before processing.

---

## Flow of Execution

1. Guest provides booking input.
2. System validates input values and constraints.
3. If validation fails, an error is raised immediately.
4. A meaningful error message is displayed.
5. The system continues running without crashing.

---

## Key Java Concepts Used

### Input Validation

Validation ensures incoming data follows expected rules before processing.

---

### Custom Exceptions

Custom exception `InvalidBookingException` is used to represent invalid scenarios.

```java
class InvalidBookingException extends Exception