import java.math.BigInteger;

public class Factorials {

    public static BigInteger factorial(int n)
    {
        BigInteger f = BigInteger.ONE; // Or BigInteger.ONE
        for (int i = 2; i <= n; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }
}
