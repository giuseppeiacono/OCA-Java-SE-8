# Object orientation

+ [Inheritance](#inheritance)
+ [Polymorphism](#polymorphism)
+ [Overriden methods](#overriden-methods)
+ [Overloaded methods](#overloaded-methods)
+ [Casting](#casting)
+ [Covariant return](#covariant-return)
+ [Constructors](#constructors)
+ [Initialization blocks](#initialization-blocks)
+ [Accessing Static Methods and Variables](#accessing-static-methods-and-variables)

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
Animal a1 = d;            // upcast ok with NO explicit cast
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
   Green doSomething() {  // returned type is subtype of the overridden method's returned type
      return new Green();
   }
}
```

## Constructors
Some important key points that sometimes are not clear, even for the most experienced Java developers:
1. every class, including ABSTRACT classes, MUST have a constructor (default or not)
2. constructor of ABSTRACT classes are invoked when concrete subclasses are instantiated
3. constructor can use any access modifier (__default__, __private__, __protected__ and __public__)
4. method with the same name of the class is LEGAL
> !!! but it’s not a constructor !!!
5. the first statement of a constructor must be always only one of the following options:
   - overloaded constructor -> `this()`
   - superclass constructor -> `super()`
6. you cannot make a call to an instance method or access an instance variable until after the super constructor runs
![Alt text](object_orientation/constructor-invoke-static-method.png?raw=true "Constructor invokes a static method")
7. `super()` and `this()` can access both static variables and methods
8. constructors are NEVER INHERITED
9. constructors can not be OVERRIDEN
10. constructors can be overloaded

Follow an example where the bad use of two constructors cause JVM crash!
![Alt text](object_orientation/constructor-cause-stackOverflowError.png?raw=true "Bad use of constructors cause an exception")

## Initialization blocks
![Alt text](object_orientation/initialization-blocks.png?raw=true "Initialization blocks")

## Accessing Static Methods and Variables
We can access static methods from object reference variables because the JVM works as follow:
1. look for the instance method with the specified name, but it does not exist
2. look for the static method with the specified name in the class which match type of object reference variable. If It exists, it is ran
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
