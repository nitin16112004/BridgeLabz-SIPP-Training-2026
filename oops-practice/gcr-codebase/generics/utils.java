import java.util.List;

public class Utils {

    

    public static <T extends Comparable<T>> T findMax(T[] arr) {

        T max = arr[0];

        for(T value : arr) {

            if(value.compareTo(max) > 0) {
                max = value;
            }
        }

        return max;
    }

    

    public static void printList(List<?> list) {

        for(Object item : list) {
            System.out.println(item);
        }
    }
}