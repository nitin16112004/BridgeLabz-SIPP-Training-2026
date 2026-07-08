public class BubbleSortSwapCount {

    public static int bubbleSortSwapCount(int[] nums) {
        int n = nums.length;
        int swapCount = 0;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {

                if (nums[j] > nums[j + 1]) {

                  
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    swapCount++;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        return swapCount;
    }

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 1};

        int swaps = bubbleSortSwapCount(nums);

        System.out.println("Total Swaps = " + swaps);
    }
}