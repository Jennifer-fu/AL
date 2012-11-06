package heap;

public class BinaryHeap {


    public int[] buildMinHeap(int[] array) {
        if (array.length == 1) return array;
        if (array[0] > array[1]) {
            int temp = array[0];
            array[0] = array[1];
            array[1] = temp;
        }
        return array;
    }
}
