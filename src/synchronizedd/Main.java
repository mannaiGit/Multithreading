package synchronizedd;
class Compteur {
    private int valeur = 0;

    public synchronized void incrementer() {
        valeur++;
    }

    public synchronized int getValeur() {
        return valeur;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Compteur compteur = new Compteur();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                compteur.incrementer();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Résultat : " + compteur.getValeur());
        // Résultat correct = 2000
    }
}
