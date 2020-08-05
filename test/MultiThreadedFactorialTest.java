import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class MultiThreadedFactorialTest {

    @Test
    void factorial() throws InterruptedException {
        long start = System.nanoTime();
        BigInteger f = MultiThreadedFactorial.factorial(20000, 4);
        long end = System.nanoTime();

        System.out.println("Result :"+f);
        System.out.println(String.format("Time : %d nanoseconds", end - start));
    }
}