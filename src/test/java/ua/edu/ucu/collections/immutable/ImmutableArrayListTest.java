package ua.edu.ucu.collections.immutable;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ImmutableArrayListTest {

    private static final Object[] smallArray = {1, 2, 3, 5};
    private static final Object[] fibonacciNum = {1, 2, 3, 5, 8};
    private static final Object[] biggerNums = {1, 2, 3, 5, 8, 13};
    private static final Object[] changedFibonacci = {43, 2, 3, 5, 8, 13};
    private static final int listSize = 5;
    private static final int magicNumber = 43;
    public static final int fibonacciNumber = 13;

    private ImmutableArrayList immutableArrayListEmpty = new ImmutableArrayList();
    private ImmutableArrayList immutableArrayList;
    private ImmutableArrayList immutableArrayListBigger;

    @Before
    public void setUp() {
        immutableArrayList = new ImmutableArrayList(fibonacciNum);
        immutableArrayListBigger = new ImmutableArrayList(biggerNums);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowingIllegalArgumentExceptionDuringAddMethod() {
        immutableArrayList.add(6, magicNumber);
    }

    @Test
    public void testGetIndexOfElementMethod() {
        Assert.assertEquals(2, immutableArrayList.indexOf(3));
    }


    @Test
    public void testAddMethod() {
        Assert.assertArrayEquals(biggerNums, immutableArrayList.add(fibonacciNumber).toArray());
    }

    @Test
    public void testToStringNotEmptyListMethod() {
        Assert.assertEquals(Arrays.toString(fibonacciNum), immutableArrayList.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAllIllegalArgumentExceptionThrowing() {
        immutableArrayList.addAll(magicNumber, fibonacciNum);
    }

    @Test
    public void testGetMethod() {
        Assert.assertEquals(3, immutableArrayList.get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetMethodIllegalArgumentExceptionThrowing() {
        immutableArrayListBigger.get(magicNumber);
    }

    @Test
    public void testRemoveMethod() {
        Assert.assertArrayEquals(smallArray, immutableArrayList.remove(4).toArray());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveMethodIllegalArgumentExceptionThrowing() {
        immutableArrayList.remove(magicNumber);
    }

    @Test
    public void testSetMethod() {
        Assert.assertArrayEquals(changedFibonacci,
                immutableArrayListBigger.set(0, magicNumber).toArray());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMethodIllegalArgumentExceptionThrowing() {
        immutableArrayListBigger.set(magicNumber, magicNumber);
    }

    @Test
    public void testIndexOfNotExistMethod() {
        Assert.assertEquals(-1, immutableArrayList.indexOf(magicNumber));
    }

    @Test
    public void testSizeMethod() {
        Assert.assertEquals(listSize, immutableArrayList.size());
    }

    @Test
    public void testSizeEmptyMethod() {
        Assert.assertEquals(0, immutableArrayListEmpty.size());
    }

    @Test
    public void testClearMethod() {
        Assert.assertArrayEquals(immutableArrayListEmpty.toArray(), immutableArrayList.clear().toArray());
    }

    @Test
    public void testIsEmptyMethodWhenListIsNotEmpty() {
        Assert.assertFalse(immutableArrayList.isEmpty());
    }

    @Test
    public void testIsEmptyMethodWhenListIsEmpty() {
        Assert.assertTrue(immutableArrayListEmpty.isEmpty());
    }
}