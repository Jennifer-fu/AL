import java.util.Random;

public class QuickSort {
    public void quickSort(int[] array, int p, int q) {
        if (p < q) {
            int pivot = partition(array, p, q);
            quickSort(array, p, pivot - 1);
            quickSort(array, pivot + 1, q);
        }
    }

    private int partition(int[] array, int p, int q) {
        int pivot = choosePivot(array, p, q);
        int i = p;
        for (int j = p + 1; j <= q; j++) {
            if (array[j] < pivot) {
                i++;
                int iValue = array[i];
                array[i] = array[j];
                array[j] = iValue;
            }
        }
        array[p] = array[i];
        array[i] = pivot;
        return i;
    }

    private int choosePivot(int[] array, int p, int q) {
        return array[p + new Random().nextInt(q - p)];
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] array = {6, 10, 13, 5, 8, 3, 2, 11};
        quickSort.quickSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
