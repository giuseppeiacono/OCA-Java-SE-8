# Chapter 5 - Flow Control and Exceptions

+ [If statements](#if-statements)
+ [Switch statements](#switch-statements)
    - [Fall-through logic](#fall-through-logic)
+ [Continue and break commands](#continue-and-break-commands)
+ [Exceptions](#exceptions)


## If statements
> The expression in an if statement must be a boolean expression

Look at `flow_control_and_exceptions/IfStatement.java` to get an idea about difficulties that you could find in the exam.

## Switch statements
> A switch 's expression must evaluate to one of the following: \
>   - integer (char, byte, short, or int)
>   - enum
>   - String

Look at `flow_control_and_exceptions/SwitchStatement.java` to get an idea about difficulties that you could find in the exam.

### Fall-through logic
It's the execution of consecutive `case` clauses until either a `break` is found or the switch statement ends.

```java
int x = 1;
switch(x) {
    case 1: System.out.println("x is one");
    case 2: System.out.println("x is two");
    case 3: System.out.println("x is three");
}
System.out.println("out of the switch");
```

> Output of the previous code \
> ---------------------------- \
> x is one \
> x is two \
> x is three \
> out of the switch

## Continue and break commands
* `continue` MUST BE inside a loop
* `break` MUST BE inside either a loop or a `switch` statement
* in the other cases, we always get a compiler error

## Exceptions
The image below shows Java exceptions hierarchy:
* `RuntimeException` subclasses are called **Unchecked** exceptions
* The other exceptions are called **Checked** exceptions

![Alt text](flow_control_and_exceptions/exceptions-hierarchy.png?raw=true "Exceptions hierarchy")

