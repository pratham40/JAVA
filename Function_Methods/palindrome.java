package Function_Methods;

import java.util.Scanner;

public class palindrome {
    public static boolean checkpalindrome(int n){
        int temp=n;
        int reverse=0;
        while (n>0) {
            int rem=n%10;
            reverse=reverse*10+rem;
            n/=10;
        }
        if (temp==reverse) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(checkpalindrome(n));
        sc.close();
    }
}
