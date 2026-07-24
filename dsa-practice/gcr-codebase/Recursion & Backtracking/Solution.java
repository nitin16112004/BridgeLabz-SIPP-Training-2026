import java.util.*;

class Solution {

    public List<List<String>> generateSubsets(String[] flags) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0, flags, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int index, String[] flags, List<String> current, List<List<String>> result) {
        if (index == flags.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(flags[index]);
        backtrack(index + 1, flags, current, result);

        current.remove(current.size() - 1);

        backtrack(index + 1, flags, current, result);
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        String[] flags = {"A", "B", "C"};

        List<List<String>> subsets = obj.generateSubsets(flags);

        for (List<String> subset : subsets) {
            System.out.println(subset);
        }
    }
}