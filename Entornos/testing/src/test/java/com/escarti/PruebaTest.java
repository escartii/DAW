package com.escarti;

import static org.junit.Assert.*;
import org.junit.Test;

public class PruebaTest {
    String str1 = new String("abc");
    String str2 = new String("abc");
    String str3 = null;
    String str4 = "abc";
    String str5 = "abc";

    int val1 = 5;
    int val2 = 6;

    String [] expectedArray = {"one", "two", "three"};
    String [] resultArray =  {"one", "two", "three"};
    
    @Test
    public void testAssertions() {
        assertEquals(str1, str2);
    }

    @Test
    public void testConditionTrue() {
        assertTrue(val2 > val1);
    }

    @Test
    public void testConditionFalse() {
        assertFalse(val1 > val2);
    }

    @Test
    public void testObjectisNotNull() {
        assertNotNull(str1);
    }

    @Test
    public void testObjectisNull() {
        assertNull(str3);
    }

    @Test
    public void testSameObject() {
        assertSame(str4, str5);
    }

    @Test
    public void testNotSameObject() {
        assertNotSame(str1, str4);
    }

    @Test
    public void testArrayEquals() {
        assertArrayEquals(expectedArray, resultArray);
    }
    
}
