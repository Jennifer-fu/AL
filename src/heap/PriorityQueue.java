package heap;

import java.util.Arrays;

public class PriorityQueue {
    private BinaryHeap heap;
    private int[] array;

    public PriorityQueue(int[] array) {
        this.array = array;
        heap = new BinaryHeap();
        heap.buildMinHeap(array);
    }

    public int[] heap(){
        return array;
    }

    public int min(int[] heap) throws HeapUnderflowException {
        if (heap.length < 1)
            throw new HeapUnderflowException();
        return heap[0];
    }


    public int extractMin(int[] heap) throws HeapUnderflowException {
        int heapSize = heap.length;
        if (heapSize < 1)
            throw new HeapUnderflowException();
        int min = heap[0];
        swap(heap,0, heapSize - 1);
        heapSize--;
        this.heap.heapify(heap, 0, heapSize);
        return min;
    }

    public void decreaseKey(int[] heap, int i, int key) {
        heap[i] = key;
        int parent = (i - 1) / 2;
        while (heap[parent]>heap[i] && i>0){
            swap(heap, i, parent);
            i = parent;
        }
    }

    public void increaseKey(int[] heap, int i, int key){
        heap[i] = key;
        this.heap.heapify(heap, i, heap.length);
    }

    public int[] insert(int[] heap, int key){
        heap = Arrays.copyOf(heap, heap.length + 1);
        heap[heap.length - 1] = Integer.MAX_VALUE;
        decreaseKey(heap,heap.length - 1,key);
        return heap;
    }

    private void swap(int[] array, int a, int b) {
        int temp = array[b];
        array[b] = array[a];
        array[a] = temp;
    }
}
