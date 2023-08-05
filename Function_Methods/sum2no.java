package Function_Methods;
import java.util.*;
public class sum2no {
    public static void  sum(){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum=a+b;
        System.out.println("Sum is "+sum);
        sc.close();
    }
    public static void main(String[] args) {
        sum();
    }
}
