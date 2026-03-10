# Builder Design Pattern Practice

This exercise is intended to practice implementing the **Builder Design Pattern** in Java.

The goal is to design a flexible way to construct complex objects with many optional parameters while keeping the code readable and maintainable.

---

# Problem Statement

You are building a small **food ordering system for a cafe**.

Customers can create a `MealOrder` with a **required main item** and several **optional customizations**.

Because there are many optional fields, the **Builder Pattern** is a good solution to avoid large constructors and improve readability.

---

# MealOrder Requirements

## Required Field

Every order must contain:

- `mainItem`  
  Examples:
  - `"Veg Burger"`
  - `"Chicken Wrap"`
  - `"Pasta"`

---

## Optional Fields

Orders may optionally include:

- `drink`  
  Examples: `"Coke"`, `"Coffee"`, `"Orange Juice"`

- `side`  
  Examples: `"Fries"`, `"Salad"`, `"Garlic Bread"`

- `dessert`  
  Examples: `"Ice Cream"`, `"Brownie"`

- `extraCheese`  
  Boolean (`true` or `false`)

- `noOnion`  
  Boolean (`true` or `false`)

- `spiceLevel`  
  Possible values:
  - `"Mild"`
  - `"Medium"`
  - `"Hot"`

- `takeaway`  
  Boolean (`true` or `false`)

---

# Implementation Requirements

Implement a `MealOrder` class using the **Builder pattern**.

Your solution should include:

1. A **nested static `Builder` class**.
2. `mainItem` must be **required** in the Builder constructor.
3. All other fields should be **optional** and set using Builder methods.
4. Builder methods should return `this` to allow **method chaining**.
5. A `build()` method that returns the final `MealOrder` object.
6. A `toString()` method to print the order details nicely.

---

# Example Usage

Your implementation should allow object creation like this:

```java
MealOrder order1 = new MealOrder.Builder("Veg Burger")
        .drink("Coke")
        .side("Fries")
        .extraCheese(true)
        .spiceLevel("Hot")
        .takeaway(true)
        .build();