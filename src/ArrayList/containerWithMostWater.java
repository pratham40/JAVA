package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class containerWithMostWater {
    public static int  bruteForce(ArrayList<Integer> h){
        int maxArea=0;
        for (int i = 0; i < h.size(); i++) {
            for (int j = i+1; j <h.size() ; j++) {
                int height =Math.min(h.get(i),h.get(j));
                int width = j-i;
                maxArea=Math.max(maxArea,height*width);
            }
        }
        return maxArea;
    }

    public static int LinearApproach(ArrayList<Integer> h){
        int maxArea=0;
        int lp=0;
        int rp=h.size()-1;
        while (lp<rp){
            int height=Math.min(h.get(lp),h.get(rp));
            int width=rp-lp;
            maxArea=Math.max(maxArea,height*width);
            if(h.get(lp)<h.get(rp)){
                lp++;
            }
            else {
                rp--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> height = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            height.add(sc.nextInt());
        }
        int brute=bruteForce(height);
        System.out.println("Brute Force Approach "+brute);
        int linear=LinearApproach(height);
        System.out.println("Linear Force Approach "+linear);
    }
}
