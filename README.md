# 🚀 Java Exception Handling - Complete Guide

---

## 📌 What is Exception?
An **exception** is an event that occurs during program execution that disrupts the normal flow of instructions.

### 🔹 Examples:
- Division by zero
- Accessing invalid array index
- File not found

---

## 📌 Types of Exceptions

### ✅ 1. Checked Exceptions (Compile-time)
- Checked at compile time
- Must be handled using `try-catch` or `throws`

**Examples:**
- IOException
- SQLException
- FileNotFoundException

---

### ✅ 2. Unchecked Exceptions (Runtime)
- Occur during execution
- Not mandatory to handle

**Examples:**
- ArithmeticException
- NullPointerException
- ArrayIndexOutOfBoundsException

---

## 📌 Exception Hierarchy
Throwable
├── Error
└── Exception
├── Checked Exceptions
└── RuntimeException (Unchecked)

---


---

## 📌 Keywords in Exception Handling

| Keyword  | Description |
|----------|------------|
| try      | Block of code that may throw exception |
| catch    | Handles exception |
| finally  | Always executes |
| throw    | Used to throw exception manually |
| throws   | Declares exception |

---

## 📌 Basic Syntax

```java
try {
    // risky code
} catch(Exception e) {
    // handling code
} finally {
    // always executed
}
