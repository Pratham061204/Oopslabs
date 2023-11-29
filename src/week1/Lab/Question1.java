package week1.Lab;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        double a=Double.parseDouble(sc.nextLine());
        System.out.println("Circumference of circle with radius "+a+" is "+2*Math.PI*a);
        System.out.println("Area of circle with radius "+a+" is "+Math.PI*a*a);
        System.out.println("Diameter of circle with radius "+a+" is "+2*a);

    }
}
