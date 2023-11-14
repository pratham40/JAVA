package PRACTICE_.Target_Sum;

import java.util.Scanner;

public class dublet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={4,6,3,5,8,2};
        int target= sc.nextInt();
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
