package BASICS;
import java.util.Scanner;
public class area {
    // Given the length and breadth of a rectangle,
//write a program to find whether the area of the
//rectangle is greater than its perimeter.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length");
        double l=sc.nextDouble();
        System.out.print("enter breadth");
        double b= sc.nextDouble();
        double area=l*b;
        double perimeter =2*(l+b);
        if (area>perimeter){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        sc.close();
    }
}
