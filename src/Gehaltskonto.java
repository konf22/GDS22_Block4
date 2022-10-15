public class Gehaltskonto {
    private String inhaber;
    private String iban;
    private String bic;
    private double kontostand;

    public Gehaltskonto(String inhaber, String iban, String bic) {
        this.inhaber = inhaber;
        this.iban = iban;
        this.bic = bic;
        this.kontostand = 0.0;
    }

    public void aufbuchen(double wert) {
        if (wert > 0) {
            kontostand = kontostand + wert;
        }
        else {
            System.out.println("Wert muss positiv sein: " + wert);
        }
    }

    public void abbuchen(double wert) {
        if (wert > 0) {
            if (kontostand - wert > 0) {
                kontostand = kontostand - wert;
            } else {
                System.out.println("Abbuchungswert " + wert
                        +" übersteigt Kontostand: " + kontostand);
            }
        }
        else {
            System.out.println("Wert muss positiv sein: " + wert);
        }
    }

    // Code+Generate+getter
    public double getKontostand() {
        return kontostand;
    }

    public String toString() {
        return "Gehaltskonto{" +
                "inhaber='" + inhaber + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }
}
