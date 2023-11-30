package tiwari;

import java.util.Scanner;

public class Search_Character {

    public static int searchCharacter(String str,char target){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str= sc.next();
        char target = sc.next().charAt(0);
        System.out.println(searchCharacter(str,target));
    }
}
