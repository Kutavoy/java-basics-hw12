import java.util.Arrays;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        return Arrays.stream(numbers)
            .filter(n -> n % 2 == 0)
            .map(a -> a * a)
            .sum();
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        return Arrays.stream(numbers)
            .filter(n -> n % 2 != 0)
            .sorted()
            .toArray();
    }
}
