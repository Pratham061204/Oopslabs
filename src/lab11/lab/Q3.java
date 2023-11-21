package lab11.lab;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        Integer[] a={1,3,67,99,9,10,123};
        BubbleSort b=new BubbleSort();
        b.sort(a);
        SelectionSort c=new SelectionSort();
        c.sort(a);
    }

}
    interface Sortable {
        public void sort(Integer[] arr);
    }

    class BubbleSort implements Sortable {

        @Override
        public void sort(Integer[] arr) {
            for(int i=0;i<arr.length;i++){
                for (int j=i+1;j<arr.length;j++){
                    if(arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }

            }
            System.out.println(Arrays.toString(arr));
        }
    }
    class SelectionSort implements Sortable{

        @Override
        public void sort(Integer[] arr) {
            int minIndex;
            for(int i=0; i<arr.length-1; i++) {
                minIndex = i;
                for(int j=i+1; j<arr.length; j++) {
                    if(arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            System.out.println(Arrays.toString(arr));

        }
    }
