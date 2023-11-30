package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class reverseArrayList {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> test1 =new ArrayList<>();
        ArrayList<Integer> test2 =new ArrayList<>();
        System.out.print("Enter element");
        for (int i = 0; i <5 ; i++) {
            test1.add(sc.nextInt());
        }
        for (int i = test1.size()-1; i >=0 ; --i) {
            test2.add(test1.get(i));
        }
        System.out.println(test2);
    }
}
