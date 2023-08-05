package Function_Methods;

import java.util.Scanner;

public class BinomialCofficient {
    public static int binomial(int n,int r){
        int a=Factorial.factorial(n); // n_fact
        int b=Factorial.factorial(r); // r_fact
        int c=Factorial.factorial(n-r); // n-r fact
        int ans=a/(b*c);  // nCr
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,r;
        n=sc.nextInt();
        r=sc.nextInt();
        System.out.println(binomial(n,r));
        sc.close();
    }
}
