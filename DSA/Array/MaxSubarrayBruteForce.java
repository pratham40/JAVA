package DSA.Array;

public class MaxSubarrayBruteForce{
    public static void maxSubarraysum(int no[]){
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;     // -ininity
        for(int i=0;i<no.length;i++){
            int start=i;
            for(int j=i;j<no.length;j++){
                int end=j;
                cursum=0;
                for(int k=start;k<=end;k++){
                    cursum+=no[k];                  // subarray sum
                }
                System.out.println(cursum);               // O(N^3) time complexity
                if (maxsum<cursum) {
                    maxsum=cursum;
                }
            }
        }
        System.out.println("MAXSUM "+maxsum);
    }
    public static void main(String[] args) {
        int no[]={2,4,6,8,10};
        maxSubarraysum(no);
    }
}
