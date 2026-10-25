# Parking Fee Calculator - Strategy Pattern (Java)

Assignment #5, Software Design Patterns.

- Strategy: `ParkingFeeStrategy`
- Concrete strategies: `HourlyFeeStrategy`, `DailyFlatFeeStrategy`, `StudentDiscountFeeStrategy`, `WeekendFeeStrategy`
- Context: `ParkingTicket` (strategy can be switched at runtime via `setFeeStrategy`)
- Client: `Main`

## Clean Code principles
1. Polymorphism instead of if/switch on strategy type
2. Intention-revealing names
3. Single Responsibility per strategy
4. Algorithm-agnostic Context (depends only on the interface)
5. Open/Closed: new strategy added without touching existing classes
6. No magic numbers (named constants)
7. Small functions

## Run
```
cd src
javac *.java
java Main
```
