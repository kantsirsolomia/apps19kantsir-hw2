package ua.edu.ucu.collections.immutable;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

public class ImmutableLinkedListTest {
    private ImmutableLinkedList empty;
    private ImmutableLinkedList full;
    private ImmutableLinkedList elements;

    @Before
    public void setUp(){
        Object[] testArray = {2, 3, 4, 51, 2, 3};
        empty = new ImmutableLinkedList();
        full = new ImmutableLinkedList(testArray);

    }

    @Test
    public void testadd() {
        Object[] testReturn = new Object[] {2, 3, 4, 51, 2, 3, 5};
        ImmutableLinkedList arr1 = full.add(5);
        assertArrayEquals(testReturn, arr1.toArray());
        Object[] testReturn2 = new Object[] {5};
        ImmutableLinkedList arr2 = empty.add(5);
        assertArrayEquals(testReturn2, arr2.toArray());

    }

    @Test
    public void addFirst() {
        Object[] testReturn = new Object[] {4, 2, 3, 4, 51, 2, 3};
        ImmutableLinkedList arr1 = full.addFirst(4);
        assertArrayEquals(testReturn, arr1.toArray());
        Object[] testReturn2 = new Object[] {4};
        ImmutableLinkedList arr2 = empty.addFirst(4);
        assertArrayEquals(testReturn2, arr2.toArray());
    }

    @Test
    public void addLast() {
        Object[] testReturn = new Object[] {2, 3, 4, 51, 2, 3,1};
        ImmutableLinkedList arr1 = full.addLast(1);
        assertArrayEquals(testReturn, arr1.toArray());
        Object[] testReturn2 = new Object[] {4};
        ImmutableLinkedList arr2 = empty.addLast(4);
        assertArrayEquals(testReturn2, arr2.toArray());
    }

    @Test
    public void getFirst() {
        assertEquals(full.getFirst(), 2);
    }

    @Test
    public void getLast() {
        assertEquals(full.getLast(), 3);
    }

    @Test
    public void removeFirst() {
        Object[] testReturn = new Object[] {3, 4, 51, 2, 3};
        ImmutableLinkedList arr1 = full.removeFirst();
    }

    @Test
    public void size() {
        assertEquals(full.size(), 6);
        assertEquals(empty.size(), 0);
        assertEquals(full.add(6).size(), 7);
        assertEquals(empty.add(5).size(), 1);

    }

    @Test
    public void isEmpty() {
        assert empty.isEmpty();
        assert empty.isEmpty() != false;
        assert full.isEmpty() == false;
    }

    @Test
    public void get() {
        assertEquals(full.get(0) ,2);


    }

    @Test
    public void remove() {
        Object[] testArray = {2,  4, 51, 2, 3};
        ImmutableLinkedList newarr = full.remove(1);
        assertArrayEquals(testArray, newarr.toArray());
    }

    @Test
    public void set() {
        Object[] testArray = {2, 6, 4, 51, 2, 3};
        ImmutableLinkedList newarr = full.set(1, 6);
        assertArrayEquals(testArray, newarr.toArray());
    }

    @Test
    public void indexOf() {
        Object[] testArray = {2, 3, 4, 51, 2, 3};
        assert full.indexOf(3)==1;
        assert full.indexOf(2)==0;
        assert full.indexOf(4)==2;
        assert full.indexOf(51)==3;
    }

    @Test
    public void clear() {
        Object[] returTrue = {};
        assertArrayEquals(full.clear().toArray(), returTrue);
    }

    @Test
    public void toArray() {
        Object[] testArray = {2, 6, 4, 51, 2, 3};
        ImmutableLinkedList newarr = full.set(1, 6);
        assertArrayEquals(testArray, newarr.toArray());
    }

}
