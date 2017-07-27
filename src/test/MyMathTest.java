package test;

import math.MyMath;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyMathTest {
    @Test
    public void testMulti() {
        MyMath math = new MyMath();
        System.out.println("Test A");
        assertEquals(50, math.multi(5, 10));
    }
    @Test
    public void testMultiZero() {
        MyMath math = new MyMath();
        System.out.println("Test 0");
        assertEquals(0, math.multi(5, 0));
    }
}