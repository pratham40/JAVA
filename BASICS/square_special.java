package tiwari;

import java.util.Scanner;

public class square_special {

    public static int squareSpecial(int[] arr){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length%(i+1)==0){
                ans+=arr[i]*arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr =new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(squareSpecial(arr));
    }
}
