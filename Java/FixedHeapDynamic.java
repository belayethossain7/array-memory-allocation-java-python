package Java;

// c) Fixed Heap Dynamic
class HeapArray {
    int[] arr;

    HeapArray() {
        arr = new int[5];
        for (int i = 0; i < 5; i++)
            arr[i] = i * 10;
    }

    void show() {
        for (int i : arr)
            System.out.println(i);
    }
}

public class FixedHeapDynamic {
    public static void main(String[] args) {
        HeapArray h = new HeapArray();
        h.show();
    }
}
