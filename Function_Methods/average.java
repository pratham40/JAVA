package Function_Methods;

import java.util.Scanner;

public class average {
    public static int average3no(int a,int b,int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("average of 3no "+average3no(a,b,c));
        sc.close();
    }
}
