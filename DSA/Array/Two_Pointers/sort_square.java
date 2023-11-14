package PRACTICE_.Two_Pointers;

import java.util.Arrays;

public class sort_square {
    public static void main(String[] args) {
        int[] arr={-10,-3,-2,1,4,5,3};
        System.out.println(Arrays.toString(square_sort(arr)));
    }

    static int[] square_sort(int[] arr) {    // 100,9,25,
        int[] ans=new int[arr.length];
        int left=0,right= arr.length-1;
        int k=0;
        while(left<=right){
            if (Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            if (Math.abs(arr[left])==Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                right--;
            }
            else {
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
//        reverse_array(ans);
        return ans;         // [100, 25, 16, 9, 4, 1]
    }

//    static void reverse_array(int[] ans){
//        int i=0,j= ans.length-1;
//        while (i<j){
//            int temp=ans[i];
//            ans[i]=ans[j];
//            ans[j]=temp;
//            i++;j--;
//        }
//    }

}
