package lab5.lab;

import java.util.Scanner;

public class PurseTester {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Purse a=new Purse(sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        while(true){
            String text= """
                    Enter a choice(Press foll nos for foll choices)
                    1)Add Dirham
                    2)Remove Dirham
                    3)Add 50 fils
                    4)Remove 50 fils
                    5)Add 25 fils
                    6)Remove 25 fils
                    7)Show total
                    8)Exit Program""";
            System.out.println(text);
            int choice=sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Amount to be added: ");
                    a.addDirham(sc.nextInt());
                }
                case 2 -> {
                    System.out.print("Enter Amount to be removed: ");
                    a.removeDirham(sc.nextInt());
                }
                case 3 -> {
                    System.out.print("Enter Amount to be added: ");
                    a.addFils50(sc.nextInt());
                }
                case 4 -> {
                    System.out.print("Enter Amount to be removed: ");
                    a.removeFils50(sc.nextInt());
                }
                case 5 -> {
                    System.out.print("Enter Amount to be added: ");
                    a.addFils25(sc.nextInt());
                }
                case 6 -> {
                    System.out.print("Enter Amount to be removed: ");
                    a.removeFils25(sc.nextInt());
                }
                case 7 -> a.totalCash();
                case 8 -> System.exit(0);
            }

            }
        }
    }

class Purse{
    private float dirham,fils_50,fils_25,total;

    public Purse(float dirham, float fils_50, float fils_25) {
        this.dirham = dirham;
        this.fils_50 = fils_50;
        this.fils_25 = fils_25;
    }

    public void addDirham(float num) {
        dirham += num;
    }

    public void addFils50(int num) {
        fils_50 += num;
    }

    public void addFils25(int num) {
        fils_25 += num;
    }
    public void removeDirham(int num){
        if(num<=total){
            dirham-=num;
        }
        else{
            System.out.println("Insufficient amount");
        }
    }
    public void removeFils50(int num) {
        float check = num * .5f;

        if (check <= total) {
            fils_50 -= num;
        }
        else {
            System.out.println("Insufficient amount");
        }

    }

    public void removeFils25(int num) {
        float check = num * .25f;
        if (check <= total) {
            fils_50 -= num;
        }
        else {
            System.out.println("Insufficient amount");
        }
    }

    public void totalCash(){
        total=dirham+(.5f*fils_50)+(.25f*fils_25);
        System.out.println("Total amount is "+total+" aed");
    }
}
