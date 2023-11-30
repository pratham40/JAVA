package tiwari;

import java.util.Scanner;

public class palindromic_string {
    public static boolean palindromeString(String str){
        StringBuilder ans= new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            ans.append(str.charAt(i));
        }
        if (str.equals(ans.toString())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str= sc.next();
        System.out.println(palindromeString(str));
    }
}
