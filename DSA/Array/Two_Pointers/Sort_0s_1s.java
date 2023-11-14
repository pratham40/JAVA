package PRACTICE_.Two_Pointers;

import java.util.Arrays;

public class Sort_0s_1s {

    static void swapInArray(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int[] sort_2pointer_approach(int[] arr){
        int left=0;
        int right= arr.length-1;
        while (left<right){
            if (arr[left]==1 && arr[right]==0){
                swapInArray(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]==0){
                left++;
            }
            if (arr[right]==1){
                right--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,0,0,1,0,1,1,0,0};
        System.out.println(Arrays.toString(sort_0_1(arr)));
        System.out.println(Arrays.toString(sort_2pointer_approach(arr)));
    }

    static int[] sort_0_1(int[] arr) {
        int count_0=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==0){
                count_0++;
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            if (i<count_0){
                arr[i]=0;
            }
            else {
                arr[i]=1;
            }
        }
        return arr;
    }
}
