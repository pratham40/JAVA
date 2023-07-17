package loops.pattern;
import java.util.Scanner;
public class numbericalrectangular5 {
//                 1
//                121
//               12321
//              1234321
//             123454321
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();
        for (int i=1;i<=r;i++){
            for (int j=1;j<=(r-i);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            for (int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
