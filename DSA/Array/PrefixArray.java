package DSA.Array;

public class PrefixArray {
    // Maxsubarray_sum2
    public static void maxSubarraysumprefix(int no[]){
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;   // -ininity
        int prefix[]=new int[no.length];
        prefix[0]=no[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+no[i];
        }
        for(int i=0;i<no.length;i++){              //prefix[end]-prefix[start-1 ]   calculate prefx sum
            int start=i;
            for(int j=i;j<no.length;j++){
                int end=j;
                cursum=start==0?prefix[end]:prefix[end]-prefix[start-1 ];
                // System.out.println(cursum);              
                if (maxsum<cursum) {    
                    maxsum=cursum;
                }
            }
        }
        System.out.println("MAXSUM "+maxsum);
    }
    public static void main(String[] args) {
        int no[]={2,4,6,8,10};
        maxSubarraysumprefix(no);
    }
}
