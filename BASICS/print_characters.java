package tiwari;

import java.util.Scanner;

public class print_characters {

    public static void printCharacters(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        printCharacters(str);
    }
}
