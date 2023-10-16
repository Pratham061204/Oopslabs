package week7.lab;

import java.util.Scanner;

public class Q3Table {
    public static void printTable(int a){
        for(int i=1;i<=10;i++){
                System.out.println(i*a+" ");
            }
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no till which u want table of ");
        int a=sc.nextInt();
        printTable(5);
    }
}
