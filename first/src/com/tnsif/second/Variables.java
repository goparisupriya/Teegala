
package com.tnsif.second;

//Outer class
public class Variables {

 // Inner class Student
 static class Student {
     String name;
     int age;

     Student(String n, int a) {
         name = n;
         age = a;
     }

     void display() {
         System.out.println("Name: " + name + ", Age: " + age);
     }
 }

 // Static method for product details
 static void products(String name, int id) {
     String productName = name;
     int productId = id;

     System.out.println("Product: " + productName + ", Product Id: " + productId);
 }

 // main method
 public static void main(String[] args) {
     String name = "Wheel Chair";
     int number = 211;

     products(name, number);

     Student stud = new Student("Supriya", 21);
     Student stud1 = new Student("Sravya", 20);

     stud.display();
     stud1.display();
 }
}