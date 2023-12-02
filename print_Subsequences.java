import java.util.ArrayList;

public class print_Subsequences {
    public static void main(String[] args) {
        int[] arr = new int[] {4, 3, 2, 1};
        int n = arr.length;
        print_Subsequences(arr, new ArrayList<>(), 0, n);
    }
    public static void print_Subsequences(int[] original, ArrayList<Integer> current, int i, int n) {
        if (i == n) {
            System.out.println(current);
            return;
        }
        // Include the current element
        current.add(original[i]);
        print_Subsequences(original, current, i + 1, n);

        // Exclude the current element
        current.remove(current.size()-1);
        print_Subsequences(original, current, i + 1, n);
    }
}

