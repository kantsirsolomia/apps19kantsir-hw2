package ua.edu.ucu.collections;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    private Queue queue;

    @Before
    public void setUp(){
        setQueue(new Queue());
    }


    @Test
    public void peek() {
        getQueue().enqueue(5);
//        getQueue().enqueue(4);
        getQueue().enqueue(3);
        assertEquals(5, getQueue().peek());
    }

    @Test
    public void dequeue() {
        getQueue().enqueue(5);
//        getQueue().enqueue(4);
        getQueue().enqueue(3);
        assertEquals(5, getQueue().dequeue());
    }

    @Test
    public void enqueue() {
        Object[] el = {1, 2, 3, 4};
        for (Object o : el) {
            getQueue().enqueue(o);
        }
        assertEquals(1, getQueue().dequeue());

    }

    @Test(expected = NullPointerException.class)
    public void testError() {
        getQueue().dequeue();
        getQueue().peek();
    }

    public Queue getQueue() {
        return queue;
    }

    public void setQueue(Queue queue) {
        this.queue = queue;
    }
}
