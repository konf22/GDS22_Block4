public class FractionDemoApp {
    public static void main(String[] args) {

        Fraction fraction1 = new Fraction(1, 4);
        System.out.println("fraction1.toDecimal() = " + fraction1.toDecimal());
        fraction1.print();

        Fraction fraction2 = new Fraction(2, 5);
        System.out.println("fraction2.toDecimal() = " + fraction2.toDecimal());
        fraction2.print();



    }
}
