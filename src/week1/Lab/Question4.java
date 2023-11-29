package week1.Lab;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        int positive_count=0,negative_count=0,zero_count=0;
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++) {
            int a=sc.nextInt();
            if(a>0){
                System.out.println(a+" is positive");
                positive_count++;
            }
            else if(a==0){
                System.out.println(a+" is 0");
                zero_count++;
            }
            else {
                System.out.println(a+" is negative");
                negative_count++;
            }
        }
        System.out.println(positive_count+" "+zero_count+" "+negative_count);


    }
}
