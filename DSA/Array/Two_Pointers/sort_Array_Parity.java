package PRACTICE_.Two_Pointers;

import java.util.Arrays;

import static PRACTICE_.Two_Pointers.Sort_0s_1s.swapInArray;

public class sort_Array_Parity {
    static int[] sort_Array_Parity_no(int[] arr) {
        int left=0;
        int right= arr.length-1;
        while (left<=right){
            if (arr[left]%2!=0 && arr[right]%2==0){
                swapInArray(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]%2==0){
                left++;
            }
            if (arr[right]%2!=0){
                right--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={3,1,2,4};
        System.out.println(Arrays.toString(sort_Array_Parity_no(arr)));
    }


}
