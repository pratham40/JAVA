package PRACTICE_.Reverse_Rotating_Array;

import java.util.Arrays;

public class reverse_an_array {
    static int[] approach3(int[] arr) {
        int j= arr.length-1;
        for (int i = 0; i < arr.length/2; i++) {
            swapInArray(arr,i,j);
            j--;
        }
        return arr;
    }

    static void swapInArray(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static int[] approach2(int[] arr){
        int[] arr2=new int[arr.length];
        int i=0,j= arr.length-1;
        while (j>=0){
            arr2[i++]=arr[j--];
        }
        return arr2;
    }
    static int[] approach1(int[] arr) {
        int[] arr2=new int[arr.length];
        int i=0;
            for (int j = arr.length-1; j >=0 ; j--) {
                arr2[i++]=arr[j];
            }
        return arr2;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(approach1(arr)));
        System.out.println(Arrays.toString(approach2(arr)));
        System.out.println(Arrays.toString(approach3(arr)));
    }


}
