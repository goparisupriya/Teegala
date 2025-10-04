package abstraction;


//Abstract class
abstract class Shape {
 int area;

 abstract void calArea();  // abstract method

 void show() {
     System.out.println("Area = " + area);
 }
}

//Square class
class Square extends Shape {
 int side;

 Square(int side) {
     this.side = side;
 }

 @Override
 void calArea() {
     area = side * side;
 }
}

//Rectangle class
class Rectangle extends Shape {
 int length, breadth;

 Rectangle(int length, int breadth) {
     this.length = length;
     this.breadth = breadth;
 }

 @Override
 void calArea() {
     area = length * breadth;
 }
}

//Main class
public class AbstractionMain {
 public static void main(String[] args) {
     Square s = new Square(5);
     Rectangle r = new Rectangle(8, 9);

     s.calArea();
     s.show();

     r.calArea();
     r.show();
 }
}
