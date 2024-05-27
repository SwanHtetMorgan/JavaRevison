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


