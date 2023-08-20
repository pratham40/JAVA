package DSA.Array;
import java.util.*;
public class TrappingRainwater {
    /*given n NON-Negative integer representing an elevation map where the width of each bar
     is 1 compute howmuch water it can trap after raining ? */
    public static int TrappingWater(int height[]){
        // calculate left max boundary-array
        int LeftMax[]=new int[height.length];
        LeftMax[0]=height[0];
        for (int i=1;i< height.length;i++){
            LeftMax[i]=Math.max(height[i],LeftMax[i-1]);
        }
        // calculate right max boundary-array
        int RightMax[]=new int[height.length];
        RightMax[height.length-1]=height[height.length-1];
        for (int i=(height.length-2);i>=0;i--){
            RightMax[i]=Math.max(height[i],RightMax[i+1]);
        }
        // loop
        int TrappedWater=0;
        for (int i=0;i< height.length;i++){
            // water level=min(left max,right max)
            int WaterLevel=Math.min(LeftMax[i],RightMax[i]);
            // trapped water=water level-height[i]
            TrappedWater+=WaterLevel-height[i];
        }
        return TrappedWater;
    }
    public static void main(String[] args) {
        //Auxilary Array,helper Array
        int height[]={4,2,0,6,3,2,5};
        System.out.println("Trapped Water= "+TrappingWater(height));
    }
}
