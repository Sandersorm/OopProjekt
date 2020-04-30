package Projekt;

import java.util.ArrayList;

public class Tulemus extends Mängija {
    private int tulemus;

    public Tulemus(String eesnimi, String perenimi, int parimSkoor, int tulemus) {
        super(eesnimi, perenimi, parimSkoor);
        this.tulemus = tulemus;
    }

    //Tagastab esimese vooru skoori.
    public static int skoor1(ArrayList<Integer> a) {
        int summa = 0;
        for (int i = 0; i < a.size(); i++) {
            summa += a.get(i);
        }

        return summa;
    }

    //Tagastab teise vooru skoori.
    public static int skoor2(ArrayList<Integer> keegliVoor2) {
        int summa = 0;
        for (int i = 0; i < keegliVoor2.size(); i++) {
            summa += keegliVoor2.get(i);
        }
        return summa;
    }

    //Tagastab mõlema vooru skoori kokku.
    public static int skoorKokku(ArrayList<Integer> a, ArrayList<Integer> keegliVoor2) {
        int kokku;
        int summa = 0;
        for (int i = 0; i < a.size(); i++) {
            summa += a.get(i);
        }
        int summa1 = 0;
        for (int i = 0; i < keegliVoor2.size(); i++) {
            summa += keegliVoor2.get(i);
        }
        kokku = summa + summa1;
        return kokku;
    }
}

