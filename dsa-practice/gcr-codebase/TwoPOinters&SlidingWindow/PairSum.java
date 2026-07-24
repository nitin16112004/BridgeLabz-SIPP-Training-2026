public class PairSum {

    public static int[] findPairSum(int[] transactions, int target) {
        int left = 0;
        int right = transactions.length - 1;

        while (left < right) {
            int sum = transactions[left] + transactions[right];

            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] transactions = {5000, 8000, 12000, 17000, 22000, 28000};
        int target = 39000;

        int[] result = findPairSum(transactions, target);

        if (result[0] == -1) {
            System.out.println("No pair found.");
        } else {
            System.out.println("Pair found!");
            System.out.println("Indices: " + result[0] + " and " + result[1]);
            System.out.println("Values: " + transactions[result[0]] + " and " + transactions[result[1]]);
        }
    }
}