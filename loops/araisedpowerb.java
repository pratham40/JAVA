package loops;
import java.util.Scanner;
public class araisedpowerb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int ans=1;
        for (int i=1;i<=b;)
        {
            ans*=a;
            i++;
        }
        System.out.println(a+" raised to power "+b+(ans));
    }
}
