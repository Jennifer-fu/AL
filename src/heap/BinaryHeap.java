package heap;

import java.util.ArrayList;

public class BinaryHeap {


    public int[] buildMinHeap(int[] array) {
        //n=2*i+1 or n=2*i+2
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, i);
        }
        return array;
    }

    private void heapify(int[] array, int i) {
        int min = i;
        int left = i * 2 + 1;
        int right = i * 2 + 2;

        if (left < array.length && array[i] > array[left]) {
            min = left;
        }

        if (right < array.length && min > array[right]) {
            min = right;
        }

        if (min != i) {
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
            heapify(array, min);
        }
    }
}
