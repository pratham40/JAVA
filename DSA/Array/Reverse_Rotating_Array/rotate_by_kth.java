package PRACTICE_.Reverse_Rotating_Array;

import java.util.Arrays;
import java.util.Scanner;

import static PRACTICE_.Reverse_Rotating_Array.reverse_an_array.swapInArray;

public class rotate_by_kth {

    static int[] reverse(int[] arr,int i,int j) {

        while (i<j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
        return arr;
    }
    static int[] rotate_kth_no_spaces(int[] arr, int k) {
        int n=arr.length;
        k%=n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        return arr;
    }
    static int[] rotate_kth(int[] arr,int k) {
        int n= arr.length;
        int[] arr2=new int[n];
        k%=n;
        int j=0;
        for (int i = n-k; i < n; i++) {
            arr2[j++]=arr[i];
        }
        int s=k;
        for (int i = 0; i <n-k; i++) {
            arr2[s++]=arr[i];  // arr2[j++]=arr[i];
        }
        return arr2;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k= sc.nextInt();
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(rotate_kth(arr,k)));
        System.out.println(Arrays.toString(rotate_kth_no_spaces(arr,k)));
    }




}
