package operator;

import java.util.Scanner;
public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("after updation values are "+x+" "+y);
    }
}
