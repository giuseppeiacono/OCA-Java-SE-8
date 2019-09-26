# Chapter 1 - Declarations and access control

## Identifiers
Legal identifiers only match the following pattern:

![Alt text](declarations_and_access_control/readme_source_files/identifiers-format.png?raw=true "Identifiers format")

Some illegal identifiers
```
// The first character is not a letter, an underscore or currency character
:b;
-d;
.f;
7g;

// The character '#' is not a letter, an underscore, currency character or digit
e#;
```

## Special main method
```
// JVM uses this method to start java applications
public static void main(String[] args)

// legal equivalent declarations of special main method
static public void main(String[] args)
public static void main(String... x)
static public void main(String bang_a_gong[])
```

## Access and Notaccess modifiers

![Alt text](declarations_and_access_control/readme_source_files/access-modifiers.png?raw=true "Access and Notaccess modifiers")

## Class modifiers

![Alt text](declarations_and_access_control/readme_source_files/class-modifiers.png?raw=true "Class modifiers")

## Declaring an interface

![Alt text](declarations_and_access_control/readme_source_files/declaring-an-interface.png?raw=true "Declaring an interface")

## Declare class members
The strategy below avoid mistakes answering questions concerning to access modifiers:

![Alt text](declarations_and_access_control/readme_source_files/strategy-for-exercises-of-access-modifiers.png?raw=true "Strategy to answer to access modifiers' questions")

## Stack and Heap

![Alt text](declarations_and_access_control/readme_source_files/stack-and-heap.png?raw=true "Stack and Heap")
