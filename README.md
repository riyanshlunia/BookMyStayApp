# Book My Stay App

## Use Case 8: Booking History & Reporting

This use case introduces historical tracking of confirmed bookings to provide operational visibility, enable audits, and support reporting. The system maintains booking history in memory while treating it as persistent data for analysis purposes.

The booking history stores confirmed reservations, and a reporting service generates summaries and insights without modifying stored data.

---

## Goal

Maintain a history of confirmed bookings and generate reports to support administrative analysis and operational visibility.

---

## Actors

Admin  
Reviews booking history and generates reports.

Booking History  
Stores confirmed reservations in chronological order.

Booking Report Service  
Generates summaries and reports from stored booking data.

---

## Flow of Execution

1. A booking is successfully confirmed.
2. The reservation is added to booking history.
3. Booking history maintains records in insertion order.
4. Admin requests booking history or reports.
5. Stored reservations are retrieved and displayed.

---

## Key Java Concepts Used

### List Data Structure

A `List<Reservation>` is used to store confirmed bookings.

```java
List<Reservation> history = new ArrayList<>();