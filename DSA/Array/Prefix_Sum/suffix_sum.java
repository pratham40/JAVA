package PRACTICE_.Prefix_Sum;

import java.util.Arrays;

public class suffix_sum {
    public static void main(String[] args) {
        int[] arr={2,5,6,1,3};
        System.out.println(Arrays.toString(suffix_sum_array(arr)));
    }

    static int[] suffix_sum_array(int[] arr) {
        int right= arr.length-1;
        int sum=arr[arr.length-1];
        while (right-->0){
            sum+=arr[right];
            arr[right]=sum;
        }
        return arr;
    }
}
