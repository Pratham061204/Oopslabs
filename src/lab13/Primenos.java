package lab13;

import java.util.Scanner;

class NegativeNo extends Exception{
    public NegativeNo(String msg){
        super(msg);
    }
}

public class Primenos {
    private static int start,end;

    public Primenos(int start, int end) throws NegativeNo {
        if(start<0||end<0) {
            /*throw new IllegalArgumentException("start and end must be non negative numbers");*/
            throw new NegativeNo("Start and end must be non negative");
        }
        this.start = start;
        this.end = end;
    }


    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
    public static void prime() {
        for (int i = start; i <= end; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i + " is prime");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter range of numbers");
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());

//        try{
//            Primenos primenos=new Primenos(a,b);
//            prime();
//        }catch (IllegalArgumentException e){
//            System.out.println("Negative no caught "+e.getMessage());
//        }

        try{
           Primenos primenos=new Primenos(a,b);
            prime();
        }catch (NegativeNo e) {
            throw new RuntimeException(e);
        }

    }



}
