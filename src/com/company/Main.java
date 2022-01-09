package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        triangle t1 = new triangle();
        System.out.println("enter the side 1");
        t1.side1= sc.nextInt();
        System.out.println("enter the side 2");
        t1.side2 =sc.nextInt();
        System.out.println("enter the side 3");
        t1.side3 =sc.nextInt();
        t1.area();
    }
}
class triangle{
    int side1,side2,side3;
     void area() {
         int s = (side1 + side2 + side3) / 3;
         System.out.println(s);
         int area = (s * (s - side1) * (s - side2) * (s - side3)) ^ 1 / 2;
         System.out.println(area);
         if ((side1 + side2) > side3 || (side2 + side3) > side1 || (side3 + side1) > side2) {

             if (side1 == side2 && side2 == side3 && side3 == side1) {
                 System.out.println("EQUILATERAL TRIANGLE");
             } else if (side1 == side2 || side2 == side3 || side3 == side1) {
                 System.out.println("isosceles triangle");
             } else {
                 System.out.println("scalene triangle");
             }
         }
         else{
             System.out.println("Not a triangle");
         }
     }

}
