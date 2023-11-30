package tiwari;

import java.util.Scanner;

public class Toggle_String {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str= sc.next();
        System.out.println(toggleString(str));
    }

    public static StringBuilder toggleString(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isUpperCase(str.charAt(i))){
                ans.append(Character.toLowerCase(str.charAt(i)));
            }
            else {
                ans.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        return ans;
    }
}
