package Function_Methods;

import java.util.Scanner;

public class even {
    public static boolean evencheck(int n){
        if (n%2==0) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(evencheck(n));
        sc.close();
    }
}
