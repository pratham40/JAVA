package loops.pattern;

import java.util.Scanner;

public class hollowrhombuspatter {
//      *****
//     *   *
//    *   *
//   *   *
//  *****
    public static void hollow_rhombus(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=r;j++){
                if (i==1||i==r||j==1||j==r) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        hollow_rhombus(r);
        sc.close();
    }
}
