package no.hvl.dat109;

public class Spiller {

    private String navn;
    private Integer verdi;

    /**
     * @param navn - Name of player
     */
    public Spiller(String navn) {
        this.navn = navn;
        this.verdi = 0;
    }

    public void spill(Kopp kopp) {
        kopp.trill();
        verdi = kopp.getSum();
    }


    public Integer getVerdi() {
        return verdi;
    }

    @Override
    public String toString() {
        return navn + " vinner med " + verdi + " poeng";
    }
}

