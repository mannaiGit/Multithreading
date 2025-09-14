package callable;
import java.util.concurrent.*;

class MaTacheCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Exécution d'une tâche Callable");
        return 42; // Retourne un résultat
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> futur = executor.submit(new MaTacheCallable());

        // On peut récupérer le résultat
        Integer resultat = futur.get();
        System.out.println("Résultat : " + resultat);

        executor.shutdown();
    }
}
