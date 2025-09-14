package volatille;
class VolatileExample {
    private volatile boolean enCours = true;

    public void executer() {
        while (enCours) {
            // fait quelque chose...
        }
        System.out.println("Arr�t� !");
    }

    public void arreter() {
        enCours = false;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        VolatileExample ex = new VolatileExample();
        
        Thread t = new Thread(ex::executer);
        t.start();

        Thread.sleep(1000);
        ex.arreter(); // met fin � la boucle dans le thread
    }
}
