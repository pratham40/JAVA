package PRACTICE_.Reverse_Rotating_Array;

import java.util.Scanner;

public class Occurence_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={100,89,76,68};
        int[] freq_arr=make_frequency_array(arr);
        int queries=sc.nextInt();
        while (queries-->0){
            int no_search= sc.nextInt();
            if(freq_arr[no_search]>0){
                System.out.println("element_found");
            }
            else {
                System.out.println("no");
            }
        }
    }

    static int[] make_frequency_array(int[] arr) {
        int[] freq_arr=new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq_arr[arr[i]]++;
        }
        return freq_arr;
    }
}
