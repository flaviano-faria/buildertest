# BuilderTest Project

## Overview
This project demonstrates the **Builder Design Pattern** in Java. It provides a simple implementation for constructing `Person` objects using a builder, which is especially useful for creating objects with multiple optional parameters.

## Project Structure
```
main/
  java/
    com/
      buildertest/
        builder/
          Person.java   # The Person class with a static Builder
        app/
          Main.java     # Application entry point and usage example
```

## Builder Design Pattern Explained
The **Builder Pattern** is a creational design pattern that separates the construction of a complex object from its representation. It allows you to create different representations of an object using the same construction process. The pattern is particularly useful when an object can be constructed with many optional parameters or when the construction process is complex.

### Key Benefits
- **Readability:** Code that creates objects is more readable and maintainable.
- **Immutability:** The built object can be made immutable if setters are omitted.
- **Flexibility:** You can add optional parameters without creating many constructors.

### Pattern Structure
- **Builder Class:** Contains methods for setting each property and a `build()` method to create the object.
- **Product Class:** The main class to be built (e.g., `Person`).
- **Director (optional):** Orchestrates the building process (not used in this simple example).

## Example from This Project
Below is a simplified version of the code from this project:

```java
// Person.java
public class Person {
    private int age;
    private String name;
    private String documentNumber;

    Person(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.documentNumber = builder.documentNumber;
    }

    public static class Builder {
        private int age;
        private String name;
        private String documentNumber;

        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder documentNumber(String documentNumber) {
            this.documentNumber = documentNumber;
            return this;
        }
        public Person build() {
            return new Person(this);
        }
    }
}
```

### Usage Example
```java
// Main.java
public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
            .age(10)
            .documentNumber("1234")
            .build();
        System.out.println(person.getAge() + " " + person.getDocumentNumber());
    }
}
```

## How to Run
1. Compile the Java files:
   ```sh
   javac main/java/com/buildertest/builder/Person.java main/java/com/buildertest/app/Main.java
   ```
2. Run the application:
   ```sh
   java -cp main/java com.buildertest.app.Main
   ```

## Summary
This project is a minimal demonstration of the builder pattern, which is ideal for constructing objects with many optional parameters in a readable and maintainable way. 