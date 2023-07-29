package loops;

import java.util.Scanner;
public class fabinociseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no ");
        int n= sc.nextInt();
        int n1=1;
        int n2=1;
        while (n>0){
            System.out.print(n1+"  ");
            int sum=n1+n2;
            n1=n2;
            n2=sum;
            n--;
        }
    }
}
