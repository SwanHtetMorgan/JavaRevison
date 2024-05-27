# Java Exceptions: Checked vs. Unchecked

## Exception 

- Two types of exception exist in Java
- > Checked
- > UnChecked 


## Introduction

In Java, exceptions are used to handle errors and other exceptional events. Exceptions can be broadly categorized into two types: **checked exceptions** and **unchecked exceptions**. Understanding the differences between these two types of exceptions is crucial for designing robust Java applications.

## Checked Exceptions

### Definition
Checked exceptions are exceptions that are checked at compile-time. They must be either caught or declared in the method signature using the `throws` keyword.

### Examples
- `IOException`
- `SQLException`
- `ClassNotFoundException`
- `FileNotFoundException`

### Characteristics
- **Compile-time Checking**: The compiler ensures that checked exceptions are either caught in a `try-catch` block or declared to be thrown in the method signature.
- **Must Handle or Declare**: If a method can throw a checked exception, the method must declare it using the `throws` keyword, or handle it using a `try-catch` block.
- **Indicates Recoverable Conditions**: Typically used for conditions that the application might be able to recover from (e.g., file not found, network issues).

-------------------
## Unchecked Exceptions

### Definition
Unchecked exceptions are exceptions that are not checked at compile-time. They include runtime exceptions and errors.

### Examples
- `NullPointerException`
- `ArrayIndexOutOfBoundsException`
- `IllegalArgumentException`
- `ArithmeticException`

### Characteristics
- **Runtime Checking**: The compiler does not enforce handling or declaring unchecked exceptions.
- **Optional Handling**: Methods are not required to declare unchecked exceptions using the `throws` keyword, and they do not have to be caught.
- **Indicates Programming Errors**: Typically used for programming errors that are generally not expected to be recovered from (e.g., null pointer access, invalid array index).
----------------------------------------