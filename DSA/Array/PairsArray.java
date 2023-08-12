package DSA.Array;

public class PairsArray {
    public static void ArrayPairs(int array[]){
        for(int i=0;i<array.length;i++){
            int current=array[i];
            for(int j=i+1;j<array.length;j++){
                System.out.print("("+current+","+array[j]+")"+",");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int Array[]={2,4,6,8,10};
        ArrayPairs(Array);
    }
}
