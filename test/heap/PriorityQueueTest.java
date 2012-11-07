package heap;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {

    private int[] heap;
    private PriorityQueue queue;

    @Before
    public void setUp(){
        int[] array = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1};
        queue = new PriorityQueue(array);
        heap = queue.heap();
    }


    @Test
    public void should_extract_min_from_priority_queue() throws HeapUnderflowException {
        int min = queue.extractMin(heap);

        assertThat(min, is(1));
        assertThat(heap, is(new int[]{2, 4, 3, 8, 7, 9, 10, 14, 16, 1}));
    }

    @Test
    public void should_keep_min_heap_when_decrease_key(){
        queue.decreaseKey(heap,5,2);
        assertThat(heap,is(new int[]{1,2,2,4,7,3,10,8,16,14}));
    }

    @Test
    public void should_keep_min_heap_when_increase_key(){
        queue.increaseKey(heap,3, 11);
        assertThat(heap,is(new int[]{1,2,3,8,7,9,10,11,16,14}));
    }

    @Test
    public void should_keep_min_heap_when_insert_new_key(){
        int[] result = queue.insert(heap, 6);
        assertThat(result,is(new int[]{1, 2, 3, 4, 6, 9, 10, 8, 16, 14, 7}));
    }


}
