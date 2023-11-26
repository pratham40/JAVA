package CodeWthHarry.Inheritance_;

class Base1 {
    Base1(){
        System.out.println("I am constructor base");
    }
    Base1(int a){
        System.out.println("I am an Overloaded base Constructor "+a);
    }
}
class Derived1 extends Base1{
    Derived1(){
//        super(0);
        System.out.println("I am derived Constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("I am an Overloaded derived Constructor "+y);
    }
}

public class contructor_inheritance {
    public static void main(String[] args) {
//        Base1 b=new Base1();
        Derived1 d= new Derived1(14,6);
    }
}
