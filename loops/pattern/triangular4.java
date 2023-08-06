package loops.pattern;

import java.util.Scanner;
public class triangular4 {                                          
//      *
//     **
//    ***
//   ****
    public static void invertedhalfpyramid(int r){
        for(int i=1;i<=r;i++){
           for(int j=1;j<=r-i;j++){   //spaces r-i
               System.out.print(" ");
           }                                          
           for(int j=1;j<=i;j++){    // star no of r=no of star
               System.out.print("*");
           }
           System.out.println();
        }
    }
    public static void main(String[] args) {                                          
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows ");
        int r=sc.nextInt();
        invertedhalfpyramid(r);
        sc.close();
    }
}