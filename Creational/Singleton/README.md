# Singleton Design Pattern in Java

## Overview

The Singleton Design Pattern ensures that only one instance of a class is created throughout the application lifecycle and provides a global access point to that instance.

Singleton is one of the most commonly used Creational Design Patterns in Java.

---

## Features

* Ensures only one object is created
* Provides global access to the object
* Saves memory by reusing the same instance
* Useful for shared resources like:

    * Database connections
    * Logging
    * Configuration management
    * Caching

---

## Project Structure

```text
Singleton/
│
├── Singleton.java
└── Main.java
```

---

## Implementation

### Singleton.java

```java
package Singleton;

public class Singleton {

    private static Singleton instance;

    // Private constructor prevents object creation from outside
    private Singleton(){}

    // Global access method
    public static Singleton getInstance(){

        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
```

---

### Main.java

```java
package Singleton;

public class Main {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
    }
}
```

---

## Output

```text
true
```

The output is `true` because both references point to the same object.

---

## How It Works

1. Constructor is made `private` so objects cannot be created using `new`.
2. A static variable stores the single object instance.
3. `getInstance()` checks:

    * If object does not exist → create it
    * Otherwise → return existing object

---

## Advantages

* Controlled access to a single instance
* Memory efficient
* Easy global accessibility
* Prevents unnecessary object creation

---

## Disadvantages

* Can create issues in multithreaded environments if not synchronized
* Makes unit testing harder in some cases
* Violates Single Responsibility Principle in some scenarios

---

## Thread-Safe Singleton Version

```java
public static synchronized Singleton getInstance(){

    if(instance == null){
        instance = new Singleton();
    }

    return instance;
}
```

---

## Real-World Use Cases

* Logger classes
* Database connection pools
* Configuration settings
* Cac


## Author

**Shubham Tiwari**

- Java Developer
- Spring Boot Developer
- Design Patterns Enthusiast

GitHub: https://github.com/shubhamktiwari2004
LinkedIn: https://www.linkedin.com/in/shubham-tiwari-aa948b284
