package CodeWthHarry.Inheritance_;

class ekClass{
    int a;

    public int getA() {
        return a;
    }
        ekClass(int a){
        this.a=a;
    }
}

class doClass extends ekClass{
    doClass(int x){
        super(10);
        System.out.println("hi");
    }
}

public class this_super {
    public static void main(String[] args) {
        ekClass e=new ekClass(5);
        System.out.println(e.getA());
        doClass dc =new doClass(5);

    }
}
