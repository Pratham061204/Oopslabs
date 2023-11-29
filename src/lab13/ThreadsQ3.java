package lab13;

import java.util.Scanner;

public class ThreadsQ3 extends Thread{
    int start,end,sum=0;

    public ThreadsQ3(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public void run(){
        for(int i=start;i<=end;i++){
            sum+=i;
        }
    }
}
class Main{
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter num: ");
        int num= scanner.nextInt();
        System.out.print("Enter number of threads: ");
        int threads = scanner.nextInt();

        Thread[] th=new Thread[threads];
        int range=num/threads;

        for(int i=0;i<th.length;i++){
            int start=i*range+1;/* t1-> 0+1 t2->251 t3->501 t4->751*/
            int end=start+range-1;
            if(i==threads-1){
                end=num;
            }
            th[i]=new ThreadsQ3(start,end);
            th[i].start();
        }
        int total=0;
        for (int i=0;i<th.length;i++){
            th[i].join();
            total+=((ThreadsQ3)th[i]).sum;
        }
        System.out.println("sum is "+total);
    }
}
