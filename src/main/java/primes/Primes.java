package primes;

import java.util.BitSet;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class Primes {
    public static IntSupplier supplier() {
        return new IntSupplier() {
            int n = 2;
            BitSet bitSet = new BitSet(50_000_000);
            @Override
            public int getAsInt() {
                int next = bitSet.nextClearBit(n);
                for (int i = next; i < 50_000_000; i += next)
                    bitSet.set(i);
                n = next + 1;
                return next;
            }
        };
    }

    public static IntStream stream() {
        return IntStream.generate(supplier());
    }
}
