package no.hvl.dat109;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Terningspill {
    private int id;

    private ArrayList<Spiller> spillere;

    private Kopp kopp;

    public Terningspill() {
        spillere = new ArrayList<>();
        id = 0;
        kopp = new Kopp();
    }

    public void leggTilSpiller(String navn) {
        Spiller s = new Spiller(navn);
        spillere.add(s);
    }

    public void spill(List<Spiller> spillere) {
        for (Spiller s : spillere) {
            s.spill(kopp);
            System.out.println(finnVinner().toString());
        }
    }

    public void spill() {
        spill(spillere);
        Spiller vinner = finnVinner();
        System.out.println(vinner.toString());
    }

    private Spiller finnVinner() {
        Spiller vinner = spillere.stream().max(Comparator.comparingInt(Spiller::getVerdi)).orElse(null);

        if (vinner != null) {
            List<Spiller> vinnere = spillere.stream().filter(x -> x.getVerdi() == vinner.getVerdi()).collect(Collectors.toList());
            while (vinnere.size() > 1) {
                spill(vinnere);
                Spiller nyvinner = spillere.stream().max(Comparator.comparingInt(Spiller::getVerdi)).orElse(null);
                vinnere = vinnere.stream().filter(x -> x.getVerdi() == vinner.getVerdi()).collect(Collectors.toList());

            }

            return vinnere.get(0);
        }
        return null;
    }

    public void lesInnSpillere() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Antall spiller?");
        int antall = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < antall; i++) {
            System.out.println("Navn på spiller nr." + (i + 1));
            leggTilSpiller(sc.nextLine());
        }
    }
}
