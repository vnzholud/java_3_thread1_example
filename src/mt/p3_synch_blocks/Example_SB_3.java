package mt.p3_synch_blocks;

public class Example_SB_3 {
    public static void main(String[] args) {
        Example_SB_3 e = new Example_SB_3();
        System.out.println("Start");
        new Thread(() -> method()).start();
        new Thread(() -> e.method2()).start();
    }

    public synchronized static void method() { // синхронизация по классу
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void abc() {

    }

    public synchronized void method2() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
