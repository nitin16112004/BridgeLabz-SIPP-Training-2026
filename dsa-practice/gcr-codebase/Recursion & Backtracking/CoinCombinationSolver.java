import java.util.*;

class CoinCombinationSolver {

    public List<List<Integer>> combinationSum(int[] coins, int target) {
        Arrays.sort(coins);

        List<List<Integer>> result = new ArrayList<>();
        backtrack(coins, target, 0, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int[] coins, int target, int index,
                           List<Integer> current,
                           List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < coins.length; i++) {

            if (coins[i] > target) {
                break;
            }

            current.add(coins[i]);

            backtrack(coins, target - coins[i], i, current, result);

            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        CoinCombinationSolver obj = new CoinCombinationSolver();

        int[] coins = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> ans = obj.combinationSum(coins, target);

        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}