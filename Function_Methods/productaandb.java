package Function_Methods;

import java.util.Scanner;

public class productaandb {
    public static int multiply(int a,int b){
        int prod=a*b;
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product=multiply(a, b);
        System.out.println("Product "+product);
        sc.close();
    }
}
