package Projekt;


import java.util.ArrayList;
import java.util.Scanner;

public class Peaklass {
    public static void main(String[] args) {
        System.out.println("-".repeat(150));
        System.out.println("Tere tulemast mängima keeglit! ");
        System.out.println("Esimene keeglivoor: esimene 15 viset on klassika. Kõik visked visatakse 9 kurika pihta ja maha kukkunud kurikad liidetakse.");
        System.out.println("Teine keeglivoor: teine 15 viset on süsteem. Visatakse kuni saadakse maha kõik ühe laua 9 kurikat. Seejärel paneb masin uuesti kõik kurikad püsti.");
        System.out.println("Lõpptulemusena liidetakse esimese ja teise vooru tulemused.");
        System.out.println("-".repeat(150));
        ArrayList<String> eesnimed = new ArrayList<>();
        ArrayList<String> perenimed = new ArrayList<>();
        ArrayList<Integer> parimadSkoorid = new ArrayList<>();
        int mängijaid = mängijateArv();
        mängijaInfo(eesnimed, perenimed, parimadSkoorid, mängijaid);
        System.out.println();

    }

    //Moodustame 3 listi, kuhu koondame kasutaja poolt sisestatud info ja väljastame vajaliku info.
    private static void mängijaInfo(ArrayList<String> eesnimed, ArrayList<String> perenimed, ArrayList<Integer> parimadSkoorid, int mängijaid) {
        for (int i = 0; i < mängijaid; i++) {
            eesnimed.add(i, mängijaEesnimi());
            perenimed.add(i, mängijaPerenimi());
            parimadSkoorid.add(i, parimSkoor());
        }
        for (int i = 0; i < eesnimed.size(); i++) {
            Mängija mängija = new Mängija(eesnimed.get(i), perenimed.get(i), parimadSkoorid.get(i));
            System.out.println(mängija.toString());
            System.out.println();
        }
    }

    //Küsib kasutajalt mängijate arvu.
    public static int mängijateArv() {
        Scanner mängijaid = new Scanner(System.in);
        System.out.println("Sisesta oma mängijate arv: ");
        int arv = mängijaid.nextInt();
        return arv;
    }

    //Küsib kasutajalt mängija eesnime.
    public static String mängijaEesnimi() {
        Scanner sisestatudNimi = new Scanner(System.in);
        System.out.println("Sisesta mängija eesnimi: ");
        String nimi = sisestatudNimi.nextLine();
        return nimi;
    }

    //Küsib kasutajalt mängija perenime.
    public static String mängijaPerenimi() {
        Scanner sisestatudNimi = new Scanner(System.in);
        System.out.println("Sisesta mängija perenimi: ");
        String perenimi = sisestatudNimi.nextLine();
        return perenimi;
    }

    //Küsib kasutajalt mängija parima skoori.
    public static int parimSkoor() {
        Scanner sisestatudNimi = new Scanner(System.in);
        System.out.println("Sisesta mängija senine parim skoor: ");
        int skoor = Integer.parseInt(sisestatudNimi.nextLine());
        return skoor;
    }
}