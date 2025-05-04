package Java;

// d) Heap Dynamic
import java.util.ArrayList;

public class HeapDynamic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            arr.add(i * 2);
        for (int i : arr)
            System.out.println(i);
    }
}
