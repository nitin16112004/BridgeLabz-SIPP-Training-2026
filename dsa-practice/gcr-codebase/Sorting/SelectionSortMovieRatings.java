import java.util.Arrays;

public class SelectionSortMovieRatings {

    public static void selectionSort(int[] ratings) {
        int n = ratings.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (ratings[j] < ratings[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = ratings[i];
            ratings[i] = ratings[minIndex];
            ratings[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int[] ratings = {8, 5, 9, 7, 6, 10};

        selectionSort(ratings);

        System.out.println(Arrays.toString(ratings));
    }
}