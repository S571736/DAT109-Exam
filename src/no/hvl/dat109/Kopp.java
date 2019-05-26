package no.hvl.dat109;

public class Kopp {
    private int id;
    private int sum;

    public Kopp(){
        this.id = 0;
        this.sum = 0;
    }

    public int trill(){
        Terning t1 = new Terning();
        Terning t2 = new Terning();

        t1.trill();
        t2.trill();

        sum = t1.getVerdi() + t2.getVerdi();
        return sum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
