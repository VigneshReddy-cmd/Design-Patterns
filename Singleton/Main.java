package Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for(long i=0;i<100000;i++)
        executorService.execute(() -> TVset.getTVsetInstance());
        executorService.execute(() -> TVset.getTVsetInstance());
        executorService.shutdown();
    }
}
