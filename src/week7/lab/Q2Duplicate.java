package week7.lab;

import java.util.Arrays;

public class Q2Duplicate {
    public static int[] getDuplicateElementsandArray(int[] arr){
        int[] duplicate=new int[arr.length];
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    boolean isduplicatealr=false;

                    for(int k=0;k<count;k++){
                        if(arr[j]==duplicate[k]){
                            isduplicatealr=true;
                            break;
                        }
                    }
                    if(!isduplicatealr) {
                        duplicate[count] = arr[i];
                        count++;

                    }
                    break;

                }

            }

        }
        int[] result=new int[count];
        System.arraycopy(duplicate,0,result,0,count);

        for (int i=0;i<count;i++) {
            int dupcount=0;
            for (int j = 0; j < arr.length; j++) {
                if(duplicate[i]==arr[j]){
                    dupcount++;
                }
            }
            System.out.println("Element: " + duplicate[i] + ", Count: " + dupcount);
            }
        return result;



    }


    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 3, 3, 4, 5};

        int[] result = getDuplicateElementsandArray(input);

        System.out.println(Arrays.toString(result));
    }
    }

