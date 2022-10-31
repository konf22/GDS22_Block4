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


    public Fraction multiplicate(Fraction[] arr)
    {
        // 2. Hilfvariablen (nennerneu, zahlerneu) [richtig initialisieren]
        int denominatorNew = denominator; // 2
        int nominatorNew = nominator; // 1

        // for-schleife 0... < arr.length
        for (int i = 0; i < arr.length; i++) {
            denominatorNew = denominatorNew * arr[i].getDenominator();
            nominatorNew = nominatorNew * arr[i].getNominator();
        }

        // nach der for-Schleife, neuen Bruch mit multiplizierten-Werten
        // erstellen

        return new Fraction(nominatorNew, denominatorNew);
    }

    public void trim()
    {
        /*
         * Schreibe eine Schleife, die solange läuft
         * bis die Laufvariable größer wie Nenner ist.
         * Prüfe ob Nenner und Zähler durch die Laufvariable
         * teilbar ist. Wenn ja, dann beide Zahlen
         * teilen, wenn nein, dann Laufvariable
         * erhöhen
         * */

        int x = 2;
        while (x < denominator) {
            if (denominator % x == 0 && nominator % x == 0) {
                denominator = denominator / x;
                this.nominator = this.nominator / x;
            }
            else {
                x++;
            }
        }

    }
}
