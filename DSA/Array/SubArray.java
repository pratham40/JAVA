package DSA.Array;

public class SubArray {
    public static void subarray(int no[]){
        System.out.println("Total SubArray"+no.length*(no.length+1)/2);
        for(int i=0;i<no.length;i++){
            int start=i;
            for(int j=i;j<no.length;j++){
                int end=j;
                for(int k=start;k<end;k++){
                    System.out.print(no[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int no[]={2,4,6,8,10};
        subarray(no);
    }
}
