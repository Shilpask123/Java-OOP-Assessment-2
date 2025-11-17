# Java-OOP-Assessment-2

---
## ✅ Overview

This repository contains Java programs demonstrating important Object-Oriented Programming (OOP) concepts:

- super Keyword using Inheritance
- Access Modifiers in Java (public, private, protected, default)
- Encapsulation using Student class
- Abstract Class with Abstract Methods
- Abstract Class without Abstract Methods

Each program is created to help understand core Java OOP principles with simple examples.

---

### 1. . Program: Access Modifiers in Java
This program explains all four access modifiers:

| Modifier  | Accessible Within Class | Within Package | Subclass | Outside Package          |
| --------- | ----------------------- | -------------- | -------- | ------------------------ |
| public    | ✔                       | ✔              | ✔        | ✔                        |
| private   | ✔                       | ✖              | ✖        | ✖                        |
| protected | ✔                       | ✔              | ✔        | ✖ (only via inheritance) |
| default   | ✔                       | ✔              | ✖        | ✖                        |

**Concepts Covered:**
✔ public
✔ private
✔ protected
✔ default
✔ Package creation
✔ Access through inheritance and objects

---

### 2. Program: Encapsulation using Student Class

This program demonstrates Encapsulation, where:
- The variables name, age, and roll_no are private
- Public getter and setter methods are used to access and modify them

**Concepts Covered:**
```bash
✔ Private data members
✔ Getters & Setters
✔ Data hiding
✔ Secure access to variables
```
---

### 3. Program: super Keyword using Inheritance

This program demonstrates how the super keyword is used to:
- Call parent class constructor
- Call parent class method
- Access parent class variables

**Concepts Covered:**
✔ Inheritance
✔ super()
✔ Method overriding

---

### 4. Program: Abstract Class with Abstract Methods

This program shows:
- How to create an abstract class
- How to define abstract methods
- How a subclass implements the abstract methods

**Concepts Covered:**
✔ Abstract class
✔ Abstract method
✔ Method implementation in child class

---

### 5. Program: Abstract Class without Abstract Methods

This program demonstrates that:
- An abstract class can exist without any abstract methods
- It cannot be instantiated
- It can contain normal methods

**Concepts Covered:**
✔ Abstract class
✔ Concrete methods
✔ Inheritance

---

##📂 Folder Structure

```bash
Java-OOP-Assessment-2/
├── JavaAssessment-2/
│    └── src/
│         ├── Package1/
│         │     ├── Supper.java
│         │     └── Sub.java
│         ├── Package2/
│         │     ├── InnerSub.java
│         │     └── AccessModifiers.java
│         ├── Encapsulation/
│         │     └── Student.java
│         ├── AbstractWithMethods/
│         │     └── (files for abstract class with abstract methods)
│         └── AbstractWithoutMethods/
│               └── (files for abstract class without abstract methods)
└── README.md
```
---

## ▶️ How to Run the Programs

**1. Clone the repository:**
```bash
git clone https://github.com/Shilpask123/Java-OOP-Assessment-2.git
```
**2. Open the project in IntelliJ IDEA, Eclipse, or any Java IDE.**

**3. Navigate to the required file:**
```bash
Java-OOP-Assessment-2/JavaAssessment-2/src/
```

**4. Run the program**

---

## 🎯 Purpose of This Task

This task helps build strong understanding of:
- Inheritance
- Access control
- Encapsulation
- Abstraction
- super keyword
- Java class structure
