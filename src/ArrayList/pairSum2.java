package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class pairSum2 {

    public static boolean pair2(ArrayList<Integer> list,int target){
        int bp=-1;
        int n=list.size();

//      11,15,6,8,9,10
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }

        int left=bp+1;
        int right=bp;
        while (left!=right){
            if (list.get(left)+list.get(right)==target){
                return true;
            }
            if(list.get(left)+list.get(right)<target){
                left=(left+1)%n;
            }
            else {
                right=(right+n-1)%n;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("enter elements ");
        for (int i = 0; i < 6; i++) {
            list.add(sc.nextInt());
        }
        System.out.print("Target = ");
        int target =sc.nextInt();
        System.out.println(pair2(list,target));
    }
}
