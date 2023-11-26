package CodeWthHarry.Inheritance_;
class one{
    public void greet(){
        System.out.println("good morning");
    }
    public void name(){
        System.out.println("my name java");
    }
}

class two extends one{
    @Override
    public void name()
    {
        System.out.println("my name java 2");
    }

    public void music(){
        System.out.println("playing music");
    }
}

public class dynamicMethodDispatch {
    public static void main(String[] args) {
//        one obj =new one();
//        obj.name();
        one obj =new two();
        obj.greet();
//        obj.music();
    }
}
