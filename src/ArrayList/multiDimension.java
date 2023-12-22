package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class multiDimension {
    public static void main(String[] args) {
        Scanner sc;
        sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> list1 =new ArrayList<>();
        ArrayList<Integer> list2 =new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list1.add(sc.nextInt());
        }
        list.add(list1);
        for (int i = 0; i < 5; i++) {
            list2.add(sc.nextInt());
        }
        list.add(list2);
        System.out.println(list);
        for (int i = 0; i <list.size() ; i++) {
            ArrayList<Integer> s = list.get(i);
            for (int j = 0; j <s.size() ; j++) {
                System.out.print(s.get(j)+" ");
            }
            System.out.println();
        }
    }
}
