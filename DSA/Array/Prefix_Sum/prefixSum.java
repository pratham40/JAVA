package PRACTICE_.Prefix_Sum;

import java.util.Arrays;

public class prefixSum {
    public static void main(String[] args) {
        int[] arr={2,1,3,4,5};
        System.out.println(Arrays.toString(prefix_Sum(arr)));
    }

    static int[] prefix_Sum(int[] arr) {
        int left=1;
        int right= arr.length-1;
        int sum=arr[0];
        while (left<=right){
            sum+=arr[left];
            arr[left]=sum;
            left++;
        }
        return arr;
    }
}
