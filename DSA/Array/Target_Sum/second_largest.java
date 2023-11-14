package PRACTICE_.Target_Sum;

public class second_largest {
    static int largest_max(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int second_max(int[] arr){
        int max=largest_max(arr);
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int second_max=largest_max(arr);
        return second_max;
    }
    public static void main(String[] args) {
        int[] arr={0,0,-2,-3,0};
        int second_max=second_max(arr);
        System.out.println(second_max);
    }
}
