package loops.pattern;

import java.util.Scanner;

public class triangle6 {
// 1
// 01
// 101
// 0101
// 10101
    public static void triangle_0_1(int r) {
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                if ((i+j)%2==0) {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        triangle_0_1(r);
        sc.close();
    }
}
