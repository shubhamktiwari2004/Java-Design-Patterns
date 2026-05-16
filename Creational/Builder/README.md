# Builder Design Pattern in Java

## Overview

The Builder Design Pattern is a Creational Design Pattern used to create complex objects step by step.

It helps improve:
- Readability
- Maintainability
- Flexibility of object creation

Instead of using large constructors with multiple parameters, the Builder Pattern allows object creation using method chaining.

---

## Project Structure

```text
Builder/
│
├── Car.java
├── Main.java
└── README.md
```

---

## Problem Without Builder Pattern

Suppose a `Car` object contains multiple fields:

- Name
- Price
- Engine

Using constructors for all combinations becomes difficult and confusing.

Example:

```java
Car car = new Car("BMW", 20000000, "V12");
```

As the number of fields increases, constructor management becomes harder.

---

## Solution Using Builder Pattern

The Builder Pattern creates objects step by step.

Example:

```java
Car car = new Car.Builder()
        .setName("BMW")
        .setPrice(20000000)
        .setEngine("V12")
        .build();
```

This approach is:
- Cleaner
- More readable
- Easier to maintain

---

## Implementation Details

### Car Class

The `Car` class contains:
- `name`
- `price`
- `engine`

### Builder Class

The static `Builder` class:
- Sets values step by step
- Returns the same Builder object using `return this`
- Creates the final object using `build()`

---

## Method Chaining

The Builder Pattern uses Method Chaining.

Example:

```java
new Car.Builder()
    .setName("BMW")
    .setPrice(20000000)
    .setEngine("V12")
    .build();
```

Each setter method returns the Builder object itself.

---

## Code Flow

1. Create Builder object
2. Set required values
3. Call `build()`
4. Receive final `Car` object

---

## Output

```text
BMW V12 20000000
```

---

## Advantages

- Improves code readability
- Avoids constructor overloading
- Supports optional parameters
- Easier object creation
- Clean and maintainable code

---

## Disadvantages

- More code compared to simple constructors
- Slightly complex for small objects

---

## Real-World Use Cases

Builder Pattern is commonly used in:
- Spring Framework
- Lombok `@Builder`
- StringBuilder
- Configuration Objects
- DTO Creation
- API Request Objects

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Design Patterns

---

## Conclusion

The Builder Design Pattern provides a clean and scalable way to create objects in Java.

It is one of the most important and commonly asked design patterns in Java interviews and is heavily used in enterprise applications.