public class Fraction {
    private int nominator; // zähler
    private int denominator; // nenner

    public Fraction(int nominator, int denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public double toDecimal() {
        return nominator / (denominator * 1.0);
    }

    public void print() {
        System.out.println(nominator + " / " + denominator);
    }

    public int getNominator() {
        return nominator;
    }

    public int getDenominator() {
        return denominator;
    }
}
