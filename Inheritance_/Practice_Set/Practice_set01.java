package CodeWthHarry.Inheritance_.Practice_Set;

class Circle{
    public int radius;

    Circle(int radius){
        this.radius=radius;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder extends Circle{
    public int height;
    Cylinder(int radius,int height){
        super(radius);
        this.height=height;
    }

    public double Volume() {
        return Math.PI*this.radius*this.radius*height;
    }
}

public class Practice_set01 {
    public static void main(String[] args) {
        Cylinder obj =new Cylinder(2,6);
        System.out.println(obj.Volume());
    }
}
