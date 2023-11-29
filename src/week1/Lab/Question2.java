package week1.Lab;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a 5 digit no.");
        String s=scanner.nextLine();
        if(s.length()==5) {


            String[] p = s.split("");
            for (int i=0;i<5;i++) {
                System.out.print(p[i] + " ");
            }
        }
        else {
            System.out.println("enter valid 5 digit no");
        }


    }
}
