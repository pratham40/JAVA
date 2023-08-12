package Function_Methods;

import java.util.Scanner;

public class sumdigit {
    public static int digitsum(int n){
        int ans=0;
        while (n>0) {
            int a=n%10;
            ans=ans+a;
            n/=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(digitsum(n));
        sc.close();
    }
}
