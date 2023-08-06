package loops.pattern;

import java.util.Scanner;

public class rhombuspattern {
//      ****
//     ****
//    ****
//   ****
    public static void rhombus(int r) {
        for(int i=1;i<=r;i++){
            for(int j=1;j<=(r-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=r;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        rhombus(r);
        sc.close();
    }
}
