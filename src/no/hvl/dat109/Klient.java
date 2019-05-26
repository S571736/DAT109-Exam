package no.hvl.dat109;

import java.util.Scanner;

public class Klient {

    public static void main(String[] args) {
        Terningspill spill = new Terningspill();
        spill.lesInnSpillere();
        Scanner sc = new Scanner(System.in);
        System.out.println("Antall spill?");
        int antall = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < antall; i++) {
            System.out.println("\n Nytt Spill");
            spill.spill();


        }
    }
}
