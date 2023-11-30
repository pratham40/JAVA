package tiwari;

import java.util.Scanner;

public class Print_Indices_of_Vowels {

    public static void PrintIndicesOfVowels(String str){
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        PrintIndicesOfVowels(str);
    }
}
