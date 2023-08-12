package BASICS;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter no");
        n=sc.nextInt();
        if (n%2==0){
            System.out.print("it is even no");
        }
        else {
            System.out.print("it is odd no");
        }sc.close();
    }
}
