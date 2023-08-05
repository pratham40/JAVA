package Function_Methods;

public class FunctionOverloading {
    //multiple function with same name but diffrent parameter
    //function1 2 parameter
    public static int sum(int a,int b){
        return a+b;
    }
    // public static int sum(int a,int b,int c){
    //     return a+b+c;
    // }

    
    //using data type
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,2));
        System.out.println(sum(3.2f,1.8f));
    }
}
