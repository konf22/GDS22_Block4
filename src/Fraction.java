import sun.applet.resources.MsgAppletViewer_sv;

import java.util.concurrent.BrokenBarrierException;

public class Fraction {
    private int nominator; // zähler
    private int denominator; // nenner

    private int s_counter = 0;

    public Fraction(int nominator, int denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
        s_counter++;
    }

    public double toDecimal() {
        return nominator / (denominator * 1.0);
    }

    public void print() {
        System.out.println(nominator + " / " + denominator);
    }

    public Fraction multiplicate(Fraction f2){
        int newNominator = nominator * f2.nominator;
        int newDenominator = denominator * f2.denominator;
        Fraction result = new Fraction(newNominator, newDenominator);
        return result;
    }


    public Fraction multiplicate(Fraction f2, Fraction f3){
        return multiplicate(f2).multiplicate(f3);
    }

    public int getNominator() {
        return nominator;
    }

    public void printCounter() {
        System.out.println("s_counter = " + s_counter);
    }

    public int getDenominator() {
        return denominator;
    }
}
