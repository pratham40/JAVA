package loops.pattern;

import java.util.Scanner;

public class FloydTrianglePattern {
// 1 
// 2 3 
// 4 5 6
// 7 8 9 10
    public static void Floydtriangle(int r) {
        int counter=1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        Floydtriangle(r);
        sc.close();
    }
}
