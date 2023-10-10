package lab5.lab;

import java.util.Arrays;
import java.util.Comparator;

public class Arr {
    public static void main(String[] args) {
            float[] a = {1.4f, 0.73f, 2.45f, 3.22f, 4.12f, 0.9f, 2.63f, 1.77f, 1.223f, 9.1f};
            for (int i=0;i<a.length;i++){
                for(int j=i+1;j<a.length;j++){
                    if(a[i]>a[j]){
                        float temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
            float total=0;
            for(float b:a){
                total+=b;

            }
            System.out.println("Average is "+total/a.length);
            System.out.println("Minimum term is "+a[0]+" Maximum term is "+a[a.length-1]);

        }
    }

