package DSA.Array;
public class LargestInArray {
    public static int LargestArray(int no[]) {
        int largest=Integer.MIN_VALUE; // -infinity
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<no.length;i++){
            if (largest<no[i])
                largest=no[i];
            if(smallest>no[i])
                smallest=no[i];
        }
        System.out.println("Smallest Value "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int no[]={1,2,6,3,5};
        System.out.println("largest value "+LargestArray(no));
    }
}
