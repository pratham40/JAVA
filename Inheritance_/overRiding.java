package CodeWthHarry.Inheritance_;

class A{

    public void meth1(){
        System.out.println("hi i am method 1");
    }

    public int harry() {
        return 1;
    }
}

class B extends A{
    @Override
    public void meth1() {
        System.out.println("i am method 2");
    }
}

public class overRiding {
    public static void main(String[] args) {
        A a = new A();
        a.meth1();
        B b=new B();
        b.meth1();
    }
}
