package loops.pattern;

import java.util.Scanner;

public class diamondpattern {
//      *
//     ***
//    *****
//   *******
//   *******
//    *****
//     ***
//      *
    public static void diamond_pattern(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=r;i>=1;i--){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        diamond_pattern(r);
        sc.close();
    }
}
