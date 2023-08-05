package Function_Methods;

import java.util.Scanner;

public class PrimeInRange {
    public static void primeinrange(int n){
        for(int i=2;i<=n;i++){
            if (Function_Methods.prime.isprime(i)) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        primeinrange(n);
        sc.close();
    }
}
