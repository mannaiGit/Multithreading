package runnable;
class MaTacheRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Ex�cution d'une t�che Runnable");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new MaTacheRunnable());
        t.start(); // Lance le thread
    }
}
