package PRACTICE_.Prefix_Sum;
import java.util.Arrays;
import java.util.Scanner;

public class based_1__indexing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int n= sc.nextInt();
        int[] arr=new int[n+1];
        for (int i = 1; i <=n ; i++) {
            arr[i]= sc.nextInt();
        }
        makePrefixSumArray(arr);
        System.out.println("Enter no queries");
        int q= sc.nextInt();
        while (q-->0){
            System.out.println("enter range");
            int l= sc.nextInt();
            int r= sc.nextInt();
            int ans=arr[r]-arr[l-1];
            System.out.println(ans);
        }
    }

    static int[] makePrefixSumArray(int[] arr) {
        int left=1;
        int right= arr.length-1;
        int sum=0;
        while (left<=right){
            sum+=arr[left];
            arr[left]=sum;
            left++;
        }
        return arr;
    }
}
