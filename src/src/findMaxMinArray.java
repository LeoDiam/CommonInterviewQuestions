import java.util.Arrays;
import java.util.OptionalInt;

public class findMaxMinArray {
    public static void main(String[] args) {
        int[] a = {122, 3, 4, 5, 6, 7, 978, 456};
        OptionalInt max = Arrays.stream(a).max();
        OptionalInt min = Arrays.stream(a).min();
        System.out.println("Max is "+max+" and Min is "+min);

    }
}