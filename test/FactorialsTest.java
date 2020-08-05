import java.math.BigInteger;

class FactorialsTest {

    @org.junit.jupiter.api.Test
    void factorial() {
        long start = System.nanoTime();
        BigInteger f = Factorials.factorial(20000);
        long end = System.nanoTime();
        System.out.println("Result :"+f);
        System.out.println(String.format("Time : %d nanoseconds", end - start));
    }
}