package DSA.Array;

public class BinarySearch {
    public static int binarysearch(int numbers[],int key) {
        int start=0,end=numbers.length-1;
        while (start<=end) {
            int mid=(start+end)/2;

            //comparison
            if (numbers[mid]==key) {
                return mid;  // found
            }
            if (numbers[mid]<key) {
                start=mid+1; //right
            }
            else{
                end=mid-1;  //left
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        int key=6;
        System.out.println("index for key "+binarysearch(numbers, key));
    }
}
