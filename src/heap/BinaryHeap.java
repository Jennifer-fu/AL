package heap;

public class BinaryHeap {

    public void sort(int[] array) {
        buildMinHeap(array);
        int heapSize = array.length;
        for (int i = heapSize - 1; i > 0; i--) {
            swap(array, 0, i);
            heapSize--;
            heapify(array, 0, heapSize);
        }
    }

    public void buildMinHeap(int[] array) {
        //n=2*i+1 or n=2*i+2
        int heapSize = array.length;
        for (int i = heapSize / 2 - 1; i >= 0; i--) {
            heapify(array, i, heapSize);
        }
    }

    public void heapify(int[] array, int i, int heapSize) {
        int min = i;
        int left = i * 2 + 1;
        int right = i * 2 + 2;

        if (left < heapSize && array[i] > array[left]) {
            min = left;
        }

        if (right < heapSize && array[min] > array[right]) {
            min = right;
        }

        if (min != i) {
            swap(array, i, min);
            heapify(array, min, heapSize);
        }
    }

    private void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


}
