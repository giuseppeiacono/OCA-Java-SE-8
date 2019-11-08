# Chapter 6 - Strings, Arrays, ArrayLists, Dates, and Lambdas

+ [String class](#string-class)
+ [String constant pool](#string-constant-pool)
+ [Creating New Strings](#creating-new-strings)


## String class

![Alt text](strings_arrays_arrayLists_dates_lambdas/classes-to-manage-strings.png?raw=true "Classes to manage strings")

Follow an example to understand better how String objects works. What's happen if we execute this code?

![Alt text](strings_arrays_arrayLists_dates_lambdas/string-code-example.png?raw=true "String code example")

* there are 2 reference variables: s1 and s2
* 5 String objects were created and lost:
    - "summer "
    - "fall "
    - "spring fall "
    - "spring summer spring "
    - "winter "
* 3 String objects are referenced
    - "spring "
    - "spring summer "
    - "spring winter "

## String constant pool
It's the special area of memory where JVM put String literals.
It is used by compiler to check if String literals already exist in the pool, in order to avoid redundancy. It allows to save a lot of memory.

## Creating New Strings
Depending on how you create a String, there are subtle differences on what happen in the memory.

![Alt text](strings_arrays_arrayLists_dates_lambdas/creating-new-strings.png?raw=true "Creating new strings")
