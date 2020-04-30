package Projekt;

import java.util.ArrayList;

public class Mängija extends Keegel {
    public String getEesnimi() {
        return eesnimi;
    }

    public String getPerenimi() {
        return perenimi;
    }

    public int getParimSkoor() {
        return parimSkoor;
    }

    private String eesnimi;
    private String perenimi;
    private int parimSkoor;


    public Mängija(String eesnimi, String perenimi, int parimSkoor) {
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.parimSkoor = parimSkoor;

    }

    public String toString() {
        ArrayList<Integer> esimeseTabel = keegliVoor1();
        ArrayList<Integer> teiseTabel = keegliVoor2();
        int esimeneVoor = Tulemus.skoor1((esimeseTabel));
        int teineVoor = Tulemus.skoor2(teiseTabel);
        int kokku = Tulemus.skoorKokku(esimeseTabel, teiseTabel);
        if (kokku < getParimSkoor()) {
            return
                    "Mängija " + getEesnimi() + " " + getPerenimi() + ", senine parim skoor: " + getParimSkoor() + "\n" + "Esimese vooru tabel: " + esimeseTabel + " Esimese vooru tulemus: " +
                            esimeneVoor + "\n" + "Teise vooru tabel: " + teiseTabel +
                            " Teise vooru tulemus: " + teineVoor + "\n" + "Skoor kokku: " + kokku;
        } else {
            return
                    "Mängija " + getEesnimi() + " " + getPerenimi() + ", senine parim skoor: " + getParimSkoor() + "\n" + "Esimese vooru tabel: " + esimeseTabel + " Esimese vooru tulemus: " +
                            esimeneVoor + "\n" + "Teise vooru tabel: " + teiseTabel +
                            " Teise vooru tulemus: " + teineVoor + "\n" + "Skoor kokku: " + kokku + "\n" + "Oled teinud uue isikliku rekordi!";
        }
    }
}