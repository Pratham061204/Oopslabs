package week9.lab;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String p=sc.next();
        String country=p.substring(0,5);
        String remainingno=p.substring(5);
        if(country.contains("971")){
            if(remainingno.length()==9){
                System.out.println(country+" UAE Code "+remainingno.substring(0,2)+" Mobile ");
            }
            else if(remainingno.length()==8){
                System.out.println(country+" UAE Code "+remainingno.substring(0,1)+" Telephone");
            }
            else {
                System.out.println("Invalid no");
            }
        }
        else {
            System.out.println("Inavlid country code");
        }

    }
}
