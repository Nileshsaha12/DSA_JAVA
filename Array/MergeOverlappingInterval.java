import java.util.*;

public class MergeOverlappingInterval {
    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { 2, 6 }, { 8, 9 }, { 9, 11 }, { 8, 10 }, { 2, 4 }, { 15, 18 }, { 16, 17 } };
        // brute(arr);
        optimal(arr);
    }

    public static void brute(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = arr[i][0];
            int end = arr[i][1];
            if (!ls.isEmpty() && end <= ls.get(ls.size() - 1).get(1)) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                } else {
                    break;
                }
            }
            ls.add(Arrays.asList(start, end));
        }
        System.out.println(ls.toString());
    }

    public static void optimal(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (ls.isEmpty() || ls.get(ls.size() - 1).get(1) < arr[i][0]) {
                ls.add(Arrays.asList(arr[i][0], arr[i][1]));
            } else {
                ls.set(ls.size() - 1,
                        Arrays.asList(ls.get(ls.size() - 1).get(0), Math.max(ls.get(ls.size()-1).get(1), arr[i][1])));
            }
        }

        System.out.println(ls.toString());
    }

}
