# Object orientation


## Inheritance
The methods you can call on a reference are totally dependent on the declared type of the variable, no matter
what the actual object is, that the reference is referring to.

Look at the sample below:
```java
public class TestClass {
    public static void main (String[] args) {
        Shape shape = new Square();

        // Compiler shows an error because you can only invoke methods of Shape class, the declared type
        shape.perimeter();
    }
}

class Shape {
    public void area() {
        System.out.println("area of shape");
    }
    // more code
}

class Square extends Shape {
    public void perimeter() {
        System.out.println("perimeter of square");
    }
    // more code
}
```

## Polymorphism
> At runtime, the ONLY things that are dynamically selected based on the actual object (rather than the reference type)
are instance methods. Not static methods. Not variables.

## Overriden methods
![Alt text](object_orientation/overriding-rules.png?raw=true "Overriding rules")

## Overloaded methods
![Alt text](object_orientation/overloading-rules.png?raw=true "Overloading rules")

The image below resumes the policy followed by JVM to decide which OVERRIDDEN and OVERLOADED methods should be invoked in case of **object reference variables**:
![Alt text](object_orientation/overloading-rules.png?raw=true "Overloading rules")

Policy followed by JVM to decide which OVERRIDDEN and OVERLOADED methods should be invoked in case of reference variables
![Alt text](object_orientation/overriden-and-overloaded-methods.png?raw=true "Overriden and overloaded methods")

## Casting
Polymorphism allows two types of casting:
+ downcasting (MUST be explicit): from supertype to subtype
```java
Animal animal = new Dog();
if(animal instanceof Dog) {
   Dog d = (Dog) animal;  // casting the reference variable
   d.playDead();
}
```
+ upcasting (implicit): from subtype to supertype
```java
Dog d = new Dog();
Animal a1 = d;            // upcast ok with no explicit cast
Animal a2 = (Animal) d;   // upcast ok with an explicit cast
```

## Covariant return
From Java 5, the overriding allows to return a subtype of the declared return type of the overridden (superclass) method.
```java
class Colour {
   Colour doSomething() {
      return new Colour();
   }
}

class Green extends Colour {
   Green doSomething() {  // returned type is subtype of Colour, the extended class
      return new Green();
   }
}
```

## Constructors
Some important key points that sometimes are not clear, even for the most experienced Java developers:
1. every class, including ABSTRACT classes, MUST have a constructor (default or not)
2. constructor of ABSTRACT classes are invoked when concrete subclasses are instantiated
3. constructor can use any access modifier: default, private, protected and public
4. method with the same name of the class is LEGAL, but it’s not a constructor!
5. the first statement of a constructor is always a call to:
   - overloaded constructor
   - superclass constructor (always added by compiler)
6. you cannot make a call to an instance method or access an instance variable until after the super constructor runs
7. super() and this() can access both static variable and methods
8. constructors are NEVER INHERITED
9. constructors can’t be OVERRIDEN
10. constructors can be overloaded

![Alt text](object_orientation/constructor-invoke-static-method.png?raw=true "Constructor invokes a static method")

Follow an example where the bad use of two constructors cause JVM crash!
![Alt text](object_orientation/constructor-cause-stackOverflowError.png?raw=true "Bad use of constructors cause an exception")

The method super() was not added by developer, so it will never called, causing the following exception:
```
Exception in thread "main" java.lang.StackOverflowError
```

## Initialization blocks
![Alt text](object_orientation/initialization-blocks.png?raw=true "Initialization blocks")

## Accessing Static Methods and Variables
We can access static methods from object reference variables because JVM work as follow:
1. look for the instance method with specified name, but it does not exist
2. look for the static method with specified name in the class which match type of object reference variable. If It exists, it is ran
```java
public class TestStaticMethod {

   private static int count = 0;

   static int getCount() {
      return count;
   }

   public static void main (String [] args) {
      TestStaticMethod test = new TestStaticMethod();
      System.out.println("use ref var " + test.getCount());   // test.getCount() invokes static method
   }
}
```
