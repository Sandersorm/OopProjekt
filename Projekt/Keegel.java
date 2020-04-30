package Projekt;

import java.util.ArrayList;
import java.util.Scanner;

public class Keegel {

    //Esimene keeglivoor: esimene 15 viset on klassika. Kõik visked visatakse 9 kurika pihta ja maha kukkunud kurikad liidetakse.
    public static ArrayList<Integer> keegliVoor1() {
        //Salvestame iga viske mahavisatud kurikate arvu massiivi.
        ArrayList<Integer> tulemusedVoor2Voor1 = new ArrayList<>();
        //Tehakse 15 viset.
        for (int i = 0; i < 15; i++) {
            //Genereeritakse suvaline arv 0-9 ja lisatakse see massiivi.
            int viskeTulemus = (int) (Math.random() * 10);
            tulemusedVoor2Voor1.add(viskeTulemus);
        }
        return tulemusedVoor2Voor1;
    }

    //Teine keeglivoor: teine 15 viset on süsteem. Visatakse kuni saadakse maha kõik ühe laua 9 kurikat. Seejärel paneb masin uuesti kõik kurikad püsti.
    //
    public static ArrayList<Integer> keegliVoor2() {
        //Salvestan visketulemused järjendisse
        ArrayList<Integer> tulemusedVoor2 = new ArrayList<>();
        int kuulidAlguses = 9;
        //Tehakse 15 viset.
        for (int i = 0; i < 15; i++) {
            //Genereeritakse nii suur arv kui palju kurikaid alles on. Algselt 0-9.
            int vise1 = (int) (Math.random() * Math.floor(kuulidAlguses + 1));
            //Kui visatakse kõik kurikad pikali, lisatakse maha visatud kurikate arv järjendisse ja pannakse uuesti kõik kurikad püsti.
            if (kuulidAlguses - vise1 == 0) {
                tulemusedVoor2.add(vise1);
                kuulidAlguses = 9;
                //Kui viskel ei kuku kõik kurikad maha, lisatakse maha visatud kurikate arv järjendisse ja kuule võetakse viske arvu võrra maha.
            } else {
                tulemusedVoor2.add(vise1);
                kuulidAlguses = kuulidAlguses - vise1;
            }
        }
        return tulemusedVoor2;
    }
}
