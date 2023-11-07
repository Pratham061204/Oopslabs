package week9.lab;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringTokenizer b=new StringTokenizer(a);
        while(b.hasMoreTokens()){
            String token=b.nextToken();
            if(token.toLowerCase().startsWith("b"))
            System.out.println(token);
        }
    }
}
