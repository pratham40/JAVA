package DSA.Array;
// import java.util.*;
public class Kandanes {
    public static void MaxsubarrayKandanes(int no[]){
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;   // -ininity

        for(int i=0;i<no.length;i++){
            cursum=cursum+no[i];
            if (cursum<0) {
                cursum=0;
            }
            maxsum=Math.max(maxsum, cursum);

        }
        System.out.println("Maxsum= "+maxsum);
    }
    public static void main(String[] args) {
        int no[]={-2,-3,4,-1,-2,1,5,-3};
        MaxsubarrayKandanes(no);
    }
}
