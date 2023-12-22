package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class sorting_arrayList {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Original List "+list);
        Collections.sort(list);
        System.out.println("After Sorting "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("After Sorting Reversing "+list);
    }
}
