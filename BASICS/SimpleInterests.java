package BASICS;
import java.util.Scanner;
public class SimpleInterests {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("enter principal");
        double p= sc.nextDouble();
        System.out.print("enter rate");
        double r= sc.nextDouble();
        System.out.print("enter time");
        double t= sc.nextDouble();
        double SI=p*r*t/100;
        System.out.println("simple interest "+SI);
    }
}
