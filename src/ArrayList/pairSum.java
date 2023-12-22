package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class pairSum {

    public static boolean bruteForce(ArrayList<Integer> list,int target){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (target == list.get(i)+list.get(j)){
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean pointerApproach(ArrayList<Integer> list,int target){
        int left=0;
        int right=list.size()-1;
        while (left<right){
            if (list.get(left)+list.get(right)==target){
                return true;
            }
            else if (target>list.get(left)+list.get(right)){
                left++;
            }
            else {
                right--;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("enter elements ");
        for (int i = 0; i < 9; i++) {
            list.add(sc.nextInt());
        }
        System.out.print("Target = ");
        int target =sc.nextInt();
        System.out.println("Pair sum brute force " +bruteForce(list,target));
        System.out.println("Pair Sum 2 Pointer approach "+pointerApproach(list,target));
    }
}
