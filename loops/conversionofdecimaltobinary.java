package loops;
import java.lang.Math;
import java.util.Scanner;
public class conversionofdecimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter decimal no ");
        int deci_no= sc.nextInt();
        int ans=0;
        int base=10;
        int power=0;
        while (deci_no>0){
            int parity=deci_no%2;
            ans+=parity*(Math.pow(base,power));
            power++;
            deci_no/=2;
        }
        System.out.print("after converting into binary no "+ans);
    }
}
