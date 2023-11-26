package CodeWthHarry.Inheritance_;

class base{
    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("i am in x and set x now");
        this.x = x;
    }

    int x;

    public void printMe() {
        System.out.println("I am Constructor");
    }
}
class derived extends base{
    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("i am in y and set y now");
        this.y = y;
    }

    int y;

}
public class inheritance {
    public static void main(String[] args) {
        derived b=new derived();
        b.setY(54);
        System.out.println(b.getY());
    }
}
