package week9.lab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramQ4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine().trim();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine().trim();
        System.out.println(areAnagrams(str1,str2));


    }
    public static boolean areAnagrams(String str1,String str2) {
        String a = str1.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String b = str2.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        char[] a1 = a.toCharArray();
        char[] a2 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1,a2);
    }
    }

