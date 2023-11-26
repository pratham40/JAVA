package CodeWthHarry.Inheritance_.Practice_Set;

class Rectangle{
    public int length,breadth;

    Rectangle(int l,int b){
        this.breadth=b;
        this.length=l;
    }

    public int Area(){
        return this.length*this.breadth;
    }
}

class Cuboid extends Rectangle{
    public int height;

    Cuboid(int l,int b, int h){
        super(l,b);
        this.height=h;
    }

    public int Volume() {
        return this.length*this.breadth*this.height;
    }
}

public class Practice_set02 {
    public static void main(String[] args) {
        Cuboid c =new Cuboid(2,3,4);
        System.out.println("Volume of cuboid "+c.Volume());
        System.out.println("Area of rectangle "+c.Area());
    }
}
