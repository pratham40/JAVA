package loops.pattern;
import java.util.Scanner;
public class triangular3 {
//                *
//               ***
//              *****
//             *******
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();
        for (int i=1;i<=r;i++){
            for (int j=1;j<=(r-i);j++){
                System.out.print(" "); //spaces (r-i)
            }
            for (int j=1;j<=2*i-1;j++)
            {
                System.out.print("*"); // star (2*rows-1)
            }
            System.out.println();
        }
    }
}
