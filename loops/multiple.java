package loops;
import java.util.Scanner;
public class multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=1;
        while (true){
            if (num%5==0 && num%7==0) {
                System.out.println(num);
//          num++;
                break;
            }
            num++;
        }
    }
}
