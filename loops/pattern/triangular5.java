package loops.pattern;

import java.util.Scanner;

public class triangular5 {
// 1
// 12
// 123
// 1234
// 12345
    public static void invertedhalfpyramidnumber (int r){
        for(int i=5;i>=0;i--){
            for(int j=1;j<=(r+1-i);j++){  //r+1-i no
                System.out.print(j);
            }
            System.out.println();

            // another

                // for(int j=1;j<=i;j++){
                //     System.out.print(j);
                // }
                // System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        invertedhalfpyramidnumber(r);
        sc.close();
    }
}
