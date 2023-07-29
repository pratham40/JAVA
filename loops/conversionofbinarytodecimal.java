package loops;
import java.lang.Math;
import java.util.Scanner;
public class conversionofbinarytodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter binary no");
        int bin_no= sc.nextInt();
        int ans=0;
        int base=2;
        int pow=0;
        while (bin_no>0){
            int unit_dig=bin_no%10;
            ans+=unit_dig*(Math.pow(base,pow));
            bin_no/=10;
            pow++;
        }
        System.out.println("after converting into decimal "+ans);

    }
}
