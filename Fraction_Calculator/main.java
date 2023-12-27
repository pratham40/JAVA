package OOPS.Fraction_Calculator;
public class main {
    public static void main(String[] args) {
        fraction f1 =new fraction(35,21);

        System.out.println("Fraction 1 = "+f1.numerator+"/"+f1.denominator);

        fraction f2=new fraction(21,35);

        System.out.println("Fraction 2 = "+f2.numerator+"/"+ f2.denominator);

        fraction f3 = f2.add(f1,f2);
         System.out.println("Addition = "+f3.numerator+"/"+f3.denominator);

         fraction f4 =f2.multiply(f1,f2);
        System.out.println("Multiplication = "+f4.numerator+"/"+f4.denominator);

        fraction f5 = f2.subtract(f1,f2);
        System.out.println("Subtraction = "+f5.numerator+"/"+f5.denominator);

        fraction f6 = f2.divide(f1,f2);
        System.out.println("Division = "+f6.numerator+"/"+f6.denominator);
    }
}
