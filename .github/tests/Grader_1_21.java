import java.util.Arrays;
public class Grader_1_21 {
    public static void main(String[] args) {
        int[] arr = new int[52];
        for (int i = 0; i < 52; i++) arr[i] = i + 1;
        int[] original = arr.clone();
        C1_21.shuffle(arr);

        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        boolean isPermutation = Arrays.equals(sorted, original);
        boolean changedOrder = !Arrays.equals(arr, original);

        System.out.println(isPermutation ? "PASS: array still contains 1-52 exactly once" : "FAIL: array is not a valid permutation of 1-52");
        System.out.println(changedOrder ? "PASS: order changed after shuffle" : "FAIL: array order unchanged (possible no-op shuffle)");

        if (!isPermutation || !changedOrder) System.exit(1);
    }
}
