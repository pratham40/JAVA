package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class swap_in_list {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> test = new ArrayList<>();
        System.out.println("enter elements");
        for (int i = 0; i <5; i++) {
            test.add(sc.nextInt());
        }
        int index1=1,index2=3;
        int temp=test.get(index1);
        test.set(index1,test.get(index2));
        test.set(index2,temp);
        System.out.println(" after swapping "+test);
    }
}
