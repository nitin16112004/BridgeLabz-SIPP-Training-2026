import java.util.ArrayList;

public class Repository<T> {

    private ArrayList<T> data = new ArrayList<>();

    public void add(T item) {
        data.add(item);
    }

    public void display() {

        for(T item : data) {
            System.out.println(item);
        }
    }
}