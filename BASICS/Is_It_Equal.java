package tiwari;

import java.util.Scanner;

public class Is_It_Equal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String oldOne=sc.next();
        String newOne= sc.next();
        System.out.println(oldOne.equals(newOne));
    }
}
