package DSA.Array;

import java.util.Scanner;
public class LinearSearch {
    // linear search to find index of element
        public static int Linear(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if (numbers[i]== key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int index=Linear(number, key);
        if (index==-1) {
            System.out.println("not found");
        }
        else{
            System.out.println("found at "+index+" index");
        }
        sc.close();
    }

}
