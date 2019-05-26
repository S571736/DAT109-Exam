package no.hvl.dat109;

import java.util.Random;

public class Terning {
    private int id;
    private int verdi;
    private Random random;

    public Terning() {
        random = new Random();
        this.id = id;
        this.verdi = 0;
    }

    public void trill() {
        verdi = random.nextInt(6) + 1;
    }

    public int getVerdi() {
        return verdi;
    }
}
