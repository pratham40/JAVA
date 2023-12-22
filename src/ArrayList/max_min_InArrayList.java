package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class max_min_InArrayList {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> test1 = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        System.out.println("enter elements");
        for (int i = 0; i < 5; i++) {
            test1.add(sc.nextInt() );
        }
        for (int i = 0; i < test1.size(); i++) {
            if(max<test1.get(i)){
                max=test1.get(i);
            }
            if (test1.get(i)<min){
                min=test1.get(i);
            }
        }

        System.out.println("Maximum in list "+max);
        System.out.println("Minimum in List "+min);
    }
}
