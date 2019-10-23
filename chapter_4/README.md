# Chapter 4 - Operators

+ [Operators tips and tricks](#operators-tips-and-tricks)
+ [Compare objects with == and equals()](#compare-objects-with-==-and-equals())
+ [Logical operators](#logical-operators)
    - [Short-circuit logical operators](#short-circuit-ogical-operators)
    - [Non-short-circuit logical operators](#non-short-circuit-ogical-operators)
+ [Operator precedence](#operator-precedence)

## Operators tips and tricks
The class `operators/Operators.java` resumes tips and tricks related to the use of the operators.

## Compare objects with == and equals()
The exam could include questions about the operator == and the medhod `equals()` inherited from object class.
That's why you MUST to know exactly how they work with object reference variables:
1. `==` verify if two reference variables point at the same object
2. `equals()` of String class compare values (case sensitive). It hab been overridden.
3. `equals()` of other kind of objects compare if reference variables point to the same object

## Logical operators
The exam includes only these operators:
> &     _Non-short-circuit AND_

> |     _Non-short-circuit OR_

> ^     _Exclusive or (XOR)_

> !     _Boolean invert_

> &&    _Short-circuit AND_

> ||    _Short-circuit OR_

```java
//WARNING: you'll have to know exactly which operands are evaluated and which are not,
//         because the result will vary depending on whether all operands in the expression are evaluated.
//         Look at the example below:

int x = 1;
if(++x > 1 || ++x > 9 || ++x == 9 || ++x == 5) {
  System.out.println("x = " + x); // x = 2 because only the first operand is evaluated
}

int x = 1;
if(++x > 1 | ++x > 9 | ++x == 9 | ++x == 5) {
  System.out.println("x = " + x); // x = 5 because each operand is evaluated
}
```

### Short-circuit logical operators
> && evaluates the second operands only if the first one is TRUE
> || evaluates the second operands only if the first one is FALSE

They work only with boolean operands.
```java
// This code won't even compile
if (10 && 33)
```

### Non-short-circuit logical operators
> & and | always evaluate both sides of the expression. **They are inefficient!!!**

They work only with boolean operands.
```java
// This code won't even compile
if (10 & 33)
```

## Operator precedence
![Alt text](operators/operator-precedence.png?raw=true "Operator precedence")

Java follow 3 important rules to evaluate expressions:
1. if there are pieces of the expression placed in parentheses, those parts are
evaluated first
2. in case of nested parentheses, the innermost ones are evaluated first
3. two operators of the same precedence in the same expression are always evaluated from left to right