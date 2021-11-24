# Solid Principles- Introduction
* Solid Principles are the design principles that enable us manage most of the software design problems.
* 5 Solid Principles to make software designs more understandable, flexible & maintainable.
* Author: **Robert C.Martin**

## 5 Solid Principles

### S : Single Responsibility Principle **[SRP]**
* A class should have only one reason to change.
* Every class or module should have responsibility over a single part of the functionality provided by the software & that responsibility should be entirely encapsulated by the class.

### O : Open-Closed Principle **[OCP]**
* Entities should be open for extension, but closed for modification.
* Design & writing of the code should be done in such a way that new functionality should be added with minimum changes in the existing code.

### L : Liskov Substitution Principle **[LSP]**
* Objects in a program should be replaceable with instances of their sub-types without altering the correctness of that program.
* If a module is using base class, then the reference to the Base class can be replaced with a derived class without affecting the functionality of the program module.
* Derived types must be able to be substituted for their base types.

### I : Interface Segregation Principle **[ISP]**
* Many client-specific interfaces are better than general-purpose interface.
* We should not enforce clients to implement interfaces that they don't use.
* Instead of creating one-big interface we can break down into smaller interfaces.

### D : Dependency Inversion Principle **[DIP]**
* One should depend upon abstractions, not **concretions**.
* Abstractions should not depend upon details whereas details should depend upon abstractions.
* High-level modules should not depend upon low-level modules.

## What if we don't follow SOLID?
* End up with tight coupling of the code with many other modules.
* Tight coupling causes time to implement any new requirement, features or any bug-fixes & sometimes, it creates unknown-issues.
* End up with a code, that is not easily testable.
* End up with duplication of code.
* End up creating new bug while fixing existing bug.
* End up with many unknown issues in application development cycle.

## Benefits of SOLID?
* Reduction in complexity of code.
* Increase readability, extensibility & maintenance. 
* Reduce error & implement ReUsability.
* Better testability.
* Reduce tight coupling.


    



