import java.util.*;

class EngineerPermutation {

    public List<List<String>> generatePermutations(String[] engineers) {
        List<List<String>> result = new ArrayList<>();
        boolean[] used = new boolean[engineers.length];
        backtrack(engineers, used, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String[] engineers, boolean[] used,
                           List<String> current,
                           List<List<String>> result) {

        if (current.size() == engineers.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < engineers.length; i++) {

            if (used[i]) {
                continue;
            }

            used[i] = true;
            current.add(engineers[i]);

            backtrack(engineers, used, current, result);

            current.remove(current.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        EngineerPermutation obj = new EngineerPermutation();

        String[] engineers = {"Alice", "Bob", "Charlie"};

        List<List<String>> ans = obj.generatePermutations(engineers);

        for (List<String> list : ans) {
            System.out.println(list);
        }
    }
}
