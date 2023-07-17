package loops.pattern;
import java.util.Scanner;
public class numbericalrectangular {
//            1234567
//            2345671
//            3456712
//            4567123
//            5671234
//            6712345
//            7123456
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        for (int i=1;i<=r;i++){
            for (int j=i;j<=r;j++){
                System.out.print(j);
            }
            for (int j=1;j<=i-1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
