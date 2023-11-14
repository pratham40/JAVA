package PRACTICE_.Prefix_Sum;

import java.util.Arrays;

public class subarray_equal_sum{
    public static void main(String[] args) {
        int[] arr={5,3,2,6,3,1};
        System.out.println(equal_sum_partition(arr));
    }

    static boolean equal_sum_partition(int[] arr) {
        int sum= Arrays.stream(arr).sum();
        int pref_sum=0;
        int left=0,right= arr.length;
        while (left<right){
            pref_sum+=arr[left];
            int suffix_sum=sum-pref_sum;
            if (pref_sum==suffix_sum){
                return true;
            }
            left++;
        }
        return false;
    }
}