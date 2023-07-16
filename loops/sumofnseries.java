package loops;
import java.util.Scanner;
public class sumofnseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        int i=1;
        for (;i<=n;){
            if (i%2==0)
                sum-=i;
            else
                sum+=i;
            i++;

        }
        System.out.println("Sum of n series "+sum);
    }
}
