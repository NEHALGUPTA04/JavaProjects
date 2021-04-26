class Shape {
     int no;
     float h;
     float b;
     float r;
     double area;

     Shape() {
         System.out.println("Base class Constructor");
     }

     Shape(int a) {
         System.out.println("Parameterized Constructor");

     }

     void give() {
         System.out.println("Get the areas : \n");
     }

 }

 class Rectangle extends Shape {
     Rectangle(int no) {
         super.give();
         System.out.println(no + " rectangle");
     }

     Rectangle() {

     }

     void getValues(float h, float b) {
         area = h * b;
     }

     void getResult() {
         System.out.println("The area of rectangle is : ");
         System.out.println(area + " units\n");
     }

 }
 class Square extends Shape {

     Square(int no) {
         super(no);
         System.out.println(no + " square");
         this.no = no;
     }

     Square() {
         System.out.println("The area of square is : ");
     }

     void getValues(float h) {
         area = h * h;
     }

     void getResult() {
         System.out.println(area + " units \n");
     }

 }

 class Circle extends Shape {
     final double pi = 3.14;

     Circle(int no) {
         System.out.println(no + " circle");

     }

     Circle() {
         System.out.println("The area of circle is : ");
     }

     void getValues(float r) {
         area = pi * (r * r);
     }

     void getResult() {
         System.out.println(area + " units");
     }

 }

 public class InheritanceShape {
     public static void main(String args[]) {
         Rectangle r = new Rectangle(1);
         r.getValues(2, 3);
         r.getResult();
         Square s = new Square(1);
         s.getValues(2);
         s.getResult();
         Circle c = new Circle(1);
         c.getValues(4);
         c.getResult();
     }
 }
