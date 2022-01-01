abstract class Shape {
    abstract void numberOfSides();
}

class Rectangle extends Shape {
    void numberOfSides() {
        System.out.println("The number of sides in a rectangle is 4.");
    }
}

class Triangle extends Shape {
    void numberOfSides() {
        System.out.println("The number of sides in a triangle is 3.");
    }
}

class Hexagon extends Shape {
    void numberOfSides() {
        System.out.println("the number of sides in a hexagon is 6.");
    }
}

public class abstractClassShape {
    public static void main(String[] args) {
        Shape s;
        s = new Rectangle();
        s.numberOfSides();
        s = new Triangle();
        s.numberOfSides();
        s = new Hexagon();
        s.numberOfSides();
    }
}
