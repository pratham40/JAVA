package loops;
import java.util.Scanner;
public class natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        int sum=0;
        while (num<=n){
//            System.out.println(num);
            sum+=num;

            num++;
        }
        System.out.println(sum);
    }
}
