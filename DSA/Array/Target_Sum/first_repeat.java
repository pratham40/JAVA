package PRACTICE_.Target_Sum;

public class first_repeat {
    static int first_repeat_value(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,5,3,4,5,6,3,4};
        int repeat_value=first_repeat_value(arr);
        System.out.println(repeat_value);
    }

}
