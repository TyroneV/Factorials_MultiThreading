import java.math.BigInteger;

public class Factorials {

    public static BigInteger factorial(int N)
    {
        BigInteger f = BigInteger.ONE; // Or BigInteger.ONE
        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }
}
