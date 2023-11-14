package PRACTICE_.Target_Sum;

import java.util.Scanner;

public class Triplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,4,5,6,3};
        int target= sc.nextInt();
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k]==target){
                        System.out.println(i+" "+j);
                    }
                }
            }
        }
    }
}
