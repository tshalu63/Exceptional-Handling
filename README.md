# 🚀 Java Exception Handling

## 📖 Introduction

Exception Handling in Java is a mechanism used to handle runtime errors so that the normal flow of the application can be maintained.

An exception is an unexpected event that occurs during program execution and disrupts the normal flow of instructions.

### Common Examples

* Division by zero
* Accessing an invalid array index
* Null object access
* File not found
* Database connection failure

---

# 🎯 Why Exception Handling?

Without exception handling, a program terminates abnormally whenever an error occurs.

### Advantages

* Prevents abnormal program termination
* Maintains program flow
* Improves application reliability
* Separates error handling code from business logic
* Makes debugging easier

---

# 🌳 Exception Hierarchy

```text
Object
   |
Throwable
   |
   +-------------------+
   |                   |
 Error            Exception
                      |
               RuntimeException
```

## Error

Errors represent serious problems that applications generally cannot recover from.

### Examples

```java
OutOfMemoryError
StackOverflowError
VirtualMachineError
```

---

## Exception

Exceptions represent conditions that can be handled by the application.

### Examples

```java
IOException
SQLException
ClassNotFoundException
```

---

# 📂 Types of Exceptions

## 1. Checked Exceptions

Checked at compile time.

The compiler forces the programmer to handle these exceptions.

### Examples

```java
IOException
SQLException
FileNotFoundException
ClassNotFoundException
```

### Example

```java
import java.io.*;

class Demo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
```

---

## 2. Unchecked Exceptions

Occur during runtime.

The compiler does not force handling.

### Examples

```java
ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException
NumberFormatException
ClassCastException
```

### Example

```java
int result = 10 / 0;
```

Output:

```text
ArithmeticException
```

---

# 🔑 Exception Handling Keywords

| Keyword            | Description                      |
| ------------------ | -------------------------------- |
| try                | Contains risky code              |
| catch              | Handles exception                |
| finally            | Executes regardless of exception |
| throw              | Throws exception explicitly      |
| throws             | Declares exception               |
| try-with-resources | Automatic resource management    |

---

# 🧪 try Block

Used to enclose code that may generate an exception.

```java
try {
    int result = 10 / 0;
}
```

---

# 🧪 catch Block

Used to handle exceptions.

```java
try {
    int result = 10 / 0;
}
catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```

---

# 🧪 Multiple Catch Blocks

A single try block can have multiple catch blocks.

```java
try {
    int[] arr = new int[5];
    arr[10] = 100;
}
catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array Error");
}
catch (Exception e) {
    System.out.println("General Exception");
}
```

### Rule

Always write specific exceptions before general exceptions.

```java
catch(ArithmeticException e)
catch(Exception e)
```

---

# 🧪 Nested Try Block

A try block inside another try block.

```java
try {
    try {
        int a = 10 / 0;
    }
    catch (ArithmeticException e) {
        System.out.println(e);
    }
}
catch (Exception e) {
    System.out.println(e);
}
```

---

# 🧪 finally Block

The finally block always executes whether an exception occurs or not.

```java
try {
    int a = 10 / 0;
}
catch (Exception e) {
    System.out.println(e);
}
finally {
    System.out.println("Cleanup Code");
}
```

### Common Uses

* Closing files
* Closing database connections
* Releasing resources

---

# 🚀 throw Keyword

Used to explicitly throw an exception.

```java
throw new ArithmeticException("Invalid Operation");
```

### Example

```java
int age = 15;

if(age < 18){
    throw new ArithmeticException("Not Eligible");
}
```

---

# 🚀 throws Keyword

Used to declare exceptions in a method signature.

```java
void display() throws IOException {
}
```

### Example

```java
import java.io.*;

class Demo {

    static void readFile() throws IOException {
        FileReader fr = new FileReader("test.txt");
    }
}
```

---

# ⚡ Difference Between throw and throws

| throw                   | throws                          |
| ----------------------- | ------------------------------- |
| Used to throw exception | Used to declare exception       |
| Inside method body      | In method signature             |
| Throws one exception    | Can declare multiple exceptions |

---

# 🔄 Exception Propagation

When an exception is not handled in a method, it is passed to the calling method.

```java
class Demo {

    void m1() {
        int a = 10 / 0;
    }

    void m2() {
        m1();
    }

    void m3() {
        m2();
    }
}
```

Flow:

```text
m1 → m2 → m3
```

---

# 👤 User Defined Exception

Custom exceptions can be created by extending Exception.

```java
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}
```

Usage:

```java
if(age < 18){
    throw new InvalidAgeException("Not Eligible");
}
```

---

# 🔥 Custom Checked Exception

```java
class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message){
        super(message);
    }
}
```

---

# 🔥 Custom Unchecked Exception

```java
class InvalidAmountException extends RuntimeException {

    InvalidAmountException(String message){
        super(message);
    }
}
```

---

# 🆕 try-with-resources (Java 7)

Automatically closes resources after use.

```java
import java.io.*;

class Demo {

    public static void main(String[] args) {

        try(FileReader fr =
                new FileReader("test.txt")) {

            System.out.println("Reading File");

        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
```

### Advantages

* Automatic resource closing
* Cleaner code
* Prevents memory leaks

---

# 🛠 Important Exception Methods

## getMessage()

Returns exception message.

```java
e.getMessage();
```

---

## toString()

Returns exception name and message.

```java
e.toString();
```

---

## printStackTrace()

Prints complete exception details.

```java
e.printStackTrace();
```

---

# 📌 Common Runtime Exceptions

## ArithmeticException

```java
int a = 10 / 0;
```

---

## NullPointerException

```java
String str = null;
System.out.println(str.length());
```

---

## ArrayIndexOutOfBoundsException

```java
int arr[] = {1,2,3};
System.out.println(arr[10]);
```

---

## NumberFormatException

```java
Integer.parseInt("abc");
```

---

## ClassCastException

```java
Object obj = "Hello";
Integer num = (Integer)obj;
```

---

# ✅ Best Practices

### Do

* Catch specific exceptions
* Use meaningful error messages
* Close resources properly
* Use try-with-resources
* Create custom exceptions when needed

### Don't

* Ignore exceptions
* Use empty catch blocks
* Catch generic Exception unnecessarily

Bad Practice:

```java
catch(Exception e){
}
```

---

# 🎤 Interview Questions

### What is Exception Handling?

Exception Handling is a mechanism used to handle runtime errors and maintain normal application flow.

### Difference Between Error and Exception?

| Error                | Exception           |
| -------------------- | ------------------- |
| Serious issue        | Recoverable issue   |
| JVM related          | Application related |
| Difficult to recover | Can be handled      |

### Difference Between Checked and Unchecked Exceptions?

| Checked      | Unchecked            |
| ------------ | -------------------- |
| Compile Time | Runtime              |
| Must Handle  | Optional             |
| IOException  | NullPointerException |

### Can finally execute without catch?

Yes.

```java
try{
}
finally{
}
```

### What is Exception Propagation?

Passing an exception from one method to another until it is handled.

### Why use try-with-resources?

To automatically close resources and prevent resource leaks.

---

# 📚 Quick Revision

* Exception = Runtime abnormal event
* Throwable is parent class
* Error and Exception are subclasses of Throwable
* Checked Exceptions are compile-time exceptions
* Unchecked Exceptions are runtime exceptions
* try contains risky code
* catch handles exceptions
* finally always executes
* throw explicitly throws exception
* throws declares exception
* User Defined Exceptions are custom exceptions
* try-with-resources automatically closes resources

---

## ⭐ Topics Covered

* Introduction to Exceptions
* Exception Hierarchy
* Checked vs Unchecked Exceptions
* try, catch, finally
* Multiple Catch
* Nested Try
* throw vs throws
* Exception Propagation
* User Defined Exceptions
* Custom Checked & Unchecked Exceptions
* try-with-resources
* Important Exception Methods
* Runtime Exceptions
* Interview Questions
* Best Practices
