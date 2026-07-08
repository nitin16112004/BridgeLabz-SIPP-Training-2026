import java.util.Arrays;

public class InsertionSortExample {

    public static void insertionSort(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {

            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] nums = {12, 11, 13, 5, 6};

        insertionSort(nums);

        System.out.println(Arrays.toString(nums));
    }
}