package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void sumTest(){
        App app=new App();
        int output=app.sum(5,4);
        //expected =9
        assertEquals(9,output);
    }
    @Test
    public void checkEvenTest(){
        App app=new App();
        assertFalse(app.checkeven(3));
        assertTrue(app.checkeven(6));
        assertTrue(app.checkeven(22));
    }
}