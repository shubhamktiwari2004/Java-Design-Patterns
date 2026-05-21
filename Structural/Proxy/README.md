# Proxy Design Pattern – Virtual Proxy Example

## Author
**Shubham Tiwari**

---

# Overview
This project demonstrates the **Proxy Design Pattern** using a simple image loading example in Java.

The proxy object controls access to the real object and creates it only when needed.

This implementation represents a **Virtual Proxy**, where object creation is delayed until the actual operation is performed.

---

# Project Structure

```text
Proxy/
│
├── Image.java
├── RealImage.java
├── ProxyImage.java
│
Main.java
```

---

# What is Proxy Design Pattern?

The **Proxy Pattern** is a **Structural Design Pattern** that provides a substitute or placeholder object for another object.

Instead of directly accessing the real object, the client interacts with the proxy object.

The proxy can:
- control access
- delay object creation
- improve performance
- add security
- add logging

---

# Type Used in This Project

## Virtual Proxy

A Virtual Proxy delays the creation of expensive objects until they are actually required.

In this project:
- `RealImage` is the expensive object
- `ProxyImage` creates it only when `display()` is called

---

# Source Code

## Image.java

```java
package Proxy;

public interface Image {
    void display();
}
```

---

## RealImage.java

```java
package Proxy;

public class RealImage implements Image{
    private String file;

    public RealImage(String file) {
        this.file=file;
        loadFromDisk(file);
    }

    private void loadFromDisk(String file) {
        System.out.println("loading "+file);
    }

    @Override
    public void display() {
        System.out.println("Displaying "+file);
    }
}
```

---

## ProxyImage.java

```java
package Proxy;

public class ProxyImage implements Image{

    private String file;
    private RealImage realImage;

    public ProxyImage(String file) {
        this.file=file;
    }

    @Override
    public void display() {

       if(realImage==null){
           realImage=new RealImage(file);
       }

        realImage.display();
    }
}
```

---

## Main.java

```java
import Proxy.Image;
import Proxy.ProxyImage;

public class Main {

    public static void main(String[] args) {

        Image image = new ProxyImage("Resume");

        image.display();
    }
}
```

---

# Output

```text
loading Resume
Displaying Resume
```

---

# How It Works

1. `Main` creates a `ProxyImage` object.
2. `RealImage` is NOT created immediately.
3. When `display()` is called:
    - proxy checks if `RealImage` exists
    - if not, creates it
4. Image is loaded and displayed.

---

# Internal Flow

```text
Client
   |
   v
ProxyImage
   |
   |-- checks RealImage
   |
   |-- creates RealImage if null
   |
   v
RealImage.display()
```

---

# Advantages

- Lazy loading
- Better performance
- Reduced memory usage
- Controlled object creation
- Cleaner client code

---

# Disadvantages

- Extra layer of abstraction
- Increased complexity
- More classes required

---

# Real-World Applications

- Hibernate Lazy Loading
- Spring Security Proxies
- Image loading systems
- Video streaming platforms
- API gateways
- Caching systems

---

# Proxy vs Decorator

| Proxy | Decorator |
|---|---|
| Controls access | Adds functionality |
| Can delay object creation | Enhances behavior |
| Focuses on optimization/security | Focuses on features |

---

# Key Concepts

- Structural Design Pattern
- Lazy Initialization
- Controlled Access
- Virtual Proxy

---

# Conclusion

This project demonstrates how the Proxy Design Pattern can optimize resource usage by delaying object creation until it is actually needed.

The `ProxyImage` acts as a lightweight substitute for `RealImage` and improves performance through lazy loading.