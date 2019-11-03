package ua.edu.ucu.collections;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    public Queue queue;

    @Before
    public void setUp(){
        queue = new Queue();
    }


    @Test
    public void peek() {
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        assertEquals(5, queue.peek());
    }

    @Test
    public void dequeue() {
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        assertEquals(5, queue.dequeue());
    }

    @Test
    public void enqueue() {
        Object[] el = {1, 2, 3, 4};
        for(int i=0;i<el.length;i++){
            queue.enqueue(el[i]);
        }
        assertEquals(1, queue.dequeue());

    }

    }

    @Test(expected = NullPointerException.class)
    public void testError() {
        queue.dequeue();
        queue.peek();
    }
}
