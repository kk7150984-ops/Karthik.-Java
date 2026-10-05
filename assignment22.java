import java.util.HashSet;

public class DistinctAbsoluteValues {
    public static void main(String[] args) {

        int[] arr = {-5, 5, -3, 3, 2, -2, 7};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(Math.abs(num));
        }

        System.out.println("Number of distinct absolute values: " + set.size());
    }
}
