package heap;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BinaryHeapTest {
    @Test
    public void should_return_the_element_if_only_one_element_to_build_binary_heap() {
        BinaryHeap heap = new BinaryHeap();
        int[] result = heap.buildMinHeap(new int[]{1});

        assertThat(result, is(new int[]{1}));
    }

    @Test
    public void should_return_1_2_if_array_is_2_1() {
        BinaryHeap heap = new BinaryHeap();
        int[] result = heap.buildMinHeap(new int[]{2, 1});

        assertThat(result, is(new int[]{1, 2}));
    }

    @Test
    public void should_return_1_3_2_if_array_is_3_2_1() {
        BinaryHeap heap = new BinaryHeap();
        int[] result = heap.buildMinHeap(new int[]{3, 1, 2});

        assertThat(result, is(new int[]{1, 3, 2}));
    }

    @Test
    public void should_return_10_17_20_30_38_30_24_34_if_array_is_10_30_20_34_38_30_24_17() {
        BinaryHeap heap = new BinaryHeap();
        int[] result = heap.buildMinHeap(new int[]{10, 30, 20, 34, 38, 30, 24, 17});

        assertThat(result, is(new int[]{10, 17, 20, 30, 38, 30, 24, 34}));
    }


}
