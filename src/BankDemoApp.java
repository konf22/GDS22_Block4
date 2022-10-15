public class BankDemoApp {

    public static void main(String[] args) {
        // wir simulieren hier eine Bank

        System.out.println("Gehaltskonto.counter = " + Gehaltskonto.counter);

        Gehaltskonto susi = new Gehaltskonto("Susi Sorglos", "AT612345...",
                "RZABC");

        System.out.println("susi.toString() = " + susi.toString());
        susi.abbuchen(100);
        susi.aufbuchen(250);
        System.out.println("susi.getKontostand() = " + susi.getKontostand());
        susi.abbuchen(8.7);
        System.out.println("susi.getKontostand() = " + susi.getKontostand());

        Gehaltskonto maxi = new Gehaltskonto("Maxi Mustermann", "iban", "bic");
        Gehaltskonto john = new Gehaltskonto("John Doe", "us-iban", "bic-us");

        Gehaltskonto john2 = new Gehaltskonto("John Doe Business Account",
                "us-iban2", "bic");

        System.out.println("john2 = " + john2.toString());
        System.out.println("susi = " + susi.toString());
        System.out.println("maxi = " + maxi.toString());

        Gehaltskonto[] bank = new Gehaltskonto[1000];
        bank[0] = susi;
        bank[1] = maxi;
        bank[2] = john;
        
        //Gehaltskonto[] smallbank = {susi, maxi, john};
        //System.out.println("smallbank.length = " + smallbank.length);

        for (int i = 0; i < bank.length; i++) {
            if (bank[i] == null){
                System.out.println(i + " ist die nächste freie Position");
                break;
            }


            System.out.println("bank[i].getKontostand() = " + bank[i].getKontostand());
        }

        // übungen mit static
        System.out.println("Gehaltskonto.counter = " + Gehaltskonto.counter);
        System.out.println("maxi.counter = " + maxi.counter);
        


    }
}
