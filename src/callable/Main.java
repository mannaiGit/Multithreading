package callable;
import java.util.concurrent.*;

class MaTacheCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Ex�cution d'une t�che Callable");
        return 42; // Retourne un r�sultat
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> futur = executor.submit(new MaTacheCallable());

        // On peut r�cup�rer le r�sultat
        Integer resultat = futur.get();
        System.out.println("R�sultat : " + resultat);

        executor.shutdown();
    }
}
