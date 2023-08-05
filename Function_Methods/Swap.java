package Function_Methods;

import java.util.*;
public class Swap {
    public static void change2no(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a= "+a+" b= "+b);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        change2no(a,b);
        sc.close();
    }
}
