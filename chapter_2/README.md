# Object orientation


## Inheritance
The methods you can call on a reference are totally dependent on the declared type of the variable, no matter
what the actual object is, that the reference is referring to.

Look at the sample below:

```
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

