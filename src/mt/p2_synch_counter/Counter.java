package mt.p2_synch_counter;

public class Counter {
    private int c;

    public int value() { return c; }

    public Counter() {
        c = 0;
    }

    public void inc() {
        c++;
    }

    public void dec() {
        c--;
    }
}
