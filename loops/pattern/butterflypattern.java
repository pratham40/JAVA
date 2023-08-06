package loops.pattern;

import java.util.Scanner;

public class butterflypattern {
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *
    public static void butterfly(int r) {
        for(int i=1;i<=r;i++){
        //1st half
            for(int j=1;j<=i;j++){
                System.out.print("*");   // i stars
                //System.out.print("*"*i+" "*2(r-i)+"*"*i);
            }
            for(int j=1;j<=2*(r-i);j++){  // 2*(r-i) spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){    // i stars total 2i
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half

        for(int i=r;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");   // i stars
                //System.out.print("*"*i+" "*2(r-i)+"*"*i);
            }
            for(int j=1;j<=2*(r-i);j++){  // 2*(r-i) spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){    // i stars total 2i
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        butterfly(r);
        sc.close();
    }
}
