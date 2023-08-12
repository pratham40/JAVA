package BASICS;
import java.util.Scanner;
public class ProfitOrLoss {
    //If cost price and selling price of an item is
    //input through the keyboard, write a program to
    //determine whether the seller has made profit or
    //incurred loss. Also determine how much profit he
    //made or loss he incurred.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter cost price ");
        double cp= sc.nextInt();
        System.out.print("enter selling price ");
        double sp= sc.nextInt();
        if (sp>cp){
            System.out.print("profit "+(sp-cp));
        }
        else{
            System.out.println("loss "+(cp-sp));
        }sc.close();
    }
}
