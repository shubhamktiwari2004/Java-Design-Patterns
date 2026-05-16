# Observer Design Pattern in Java

## Overview

The Observer Design Pattern is a Behavioral Design Pattern used to establish a one-to-many relationship between objects.

When one object changes its state, all dependent objects are automatically notified.

This pattern is commonly used in:
- Notification systems
- YouTube subscriptions
- Event listeners
- News updates
- Messaging systems

---

## Features

* Establishes one-to-many dependency
* Automatically notifies subscribers
* Promotes loose coupling
* Easy to add or remove observers
* Useful for event-driven systems

---

## Project Structure

```text
Observer/
│
├── Observer.java
├── Subject.java
├── Subscriber.java
├── Youtube.java
└── Main.java
```

---

## Implementation

### Observer.java

```java
package Observer;

public interface Observer {

    void notification();
}
```

---

### Subject.java

```java
package Observer;

public interface Subject {

    void subscribe(Observer ob);
    void unsubscribe(Observer ob);
    void notification();
}
```

---

### Subscriber.java

```java
package Observer;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void notification() {
        System.out.println(name + " A new video is uploaded");
    }
}
```

---

### Youtube.java

```java
package Observer;

import java.util.ArrayList;
import java.util.List;

public class Youtube implements Subject {

    List<Observer> list = new ArrayList<>();

    @Override
    public void subscribe(Observer ob) {
        list.add(ob);
    }

    @Override
    public void unsubscribe(Observer ob) {
        list.remove(ob);
    }

    @Override
    public void notification() {

        for(Observer ob : list){
            ob.notification();
        }
    }
}
```

---

### Main.java

```java
import Observer.Subscriber;
import Observer.Youtube;

public class Main {

    public static void main(String[] args) {

        Subscriber aman = new Subscriber("Aman");
        Subscriber rahul = new Subscriber("Rahul");

        Youtube yt = new Youtube();

        yt.subscribe(aman);
        yt.subscribe(rahul);

        yt.notification();
    }
}
```

---

## Output

```text
Aman A new video is uploaded
Rahul A new video is uploaded
```

---

## How It Works

1. Subscribers subscribe to the YouTube channel.
2. YouTube maintains a list of subscribers.
3. When a new video is uploaded:
    - YouTube notifies all subscribers.
4. Each subscriber receives the notification.

---

## Advantages

* Promotes loose coupling
* Easy communication between objects
* Dynamic subscription handling
* Scalable notification system
* Supports event-driven programming

---

## Disadvantages

* Notification can become slow with many observers
* Difficult debugging in large systems
* Can increase memory usage

---

## Real-World Use Cases

* YouTube notifications
* News subscription systems
* Stock market updates
* Chat applications
* Event listeners in Java GUI

---

## Why Use Observer Pattern?

The Observer Pattern helps:
- Notify multiple users automatically
- Maintain clean architecture
- Build reactive systems
- Reduce dependency between classes

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Collections Framework
* Design Patterns

---

## Conclusion

The Observer Design Pattern provides an efficient way to implement communication between objects.

It is widely used in real-world applications where multiple users or systems need automatic updates when a change occurs.

---

## Author

**Shubham Tiwari**

- Java Developer
- Spring Boot Developer
- Design Patterns Enthusiast

GitHub: https://github.com/shubhamktiwari2004

LinkedIn: https://www.linkedin.com/in/shubham-tiwari-aa948b284