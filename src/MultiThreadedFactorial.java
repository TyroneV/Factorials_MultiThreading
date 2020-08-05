import java.math.BigInteger;

public class MultiThreadedFactorial {

    public static BigInteger factorial(int n,int numThreads) throws InterruptedException {
        BigInteger result = BigInteger.valueOf(1);
        Thread[] threads = new Thread[numThreads];
        FactComputer[] workers = new FactComputer[numThreads];
        for (int i = 1; i <= numThreads; i++) {
            int start = i == 1 ? 1 : (n / numThreads * (i - 1)) + 1;
            int end = i == numThreads ? n : n / numThreads * i;
            workers[i - 1] = new FactComputer(start, end);
            threads[i - 1] = new Thread(workers[i - 1]);
        }

        for (int i = 0; i < numThreads; i++) {
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
        }
        for (int i = 0; i < numThreads; i++) {
            result = result.multiply(workers[i].result);
        }
        return result;
    }

    private static class FactComputer implements Runnable {
        BigInteger result;
        private final int from;
        private final int to;

        public FactComputer(int from, int to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public void run() {
            result = BigInteger.valueOf(from);
            for (int i = from + 1; i <= to; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }

        }
    }
}
