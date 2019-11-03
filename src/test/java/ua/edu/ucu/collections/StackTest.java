package ua.edu.ucu.collections;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    public Stack stack;

    @Before
    public void setUp(){
        stack = new Stack();
    }

    @Test
    public void peek() {
        stack.push(0);
        assertEquals(0, stack.peek());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.peek());
    }

    @Test
    public void pop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
    }

    @Test
    public void push() {

            stack.push(3452);
        stack.push(546);
        stack.push(1353);
            assertEquals(1353, stack.peek());
        }


    @Test(expected = NullPointerException.class)
    public void testError() {
        stack.peek();
        stack.pop();
    }
}
