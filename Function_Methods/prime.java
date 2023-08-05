package Function_Methods;

import java.util.Scanner;

public class prime {
    public static boolean isprime(int n){
        boolean isprime=true;
        if (n==1) {
            isprime=true;
        }
        else{
            for (int i=2;i<=n-1;i++) {
                if(n%i==0){
                    isprime=false;
                    break;
                }
            }
        }
        return isprime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isprime(n));
        sc.close();
    }
}
