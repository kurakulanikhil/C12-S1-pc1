

package org.febnocci;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    Febnocci f;

    @Before
    public void setUp(){
        this.f = new Febnocci();
    }

    @Test
    public void fibo() {
        int[] result = f.fibnocci(5);
        int[] expected = {0,1,1,2,3};
        assertArrayEquals(expected, result);
    }

//    @After
//    public void clear(){
//        f = null;
//    }
}