class MinHeap {

    public void buildHeap(int[] arr) {
        int n = arr.length;

        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    private void heapify(int[] arr, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }

        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            heapify(arr, n, smallest);
        }
    }

    public static void main(String[] args) {

        int[] arr = {40, 20, 30, 10, 60, 50, 70};

        MinHeap heap = new MinHeap();
        heap.buildHeap(arr);

        System.out.println("Min Heap:");

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}