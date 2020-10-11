package recursion;

import org.junit.Assert;
import org.junit.Test;

public class ExampleRecursionMethodTest {

// --------------------------------------------- recursiveSearchMaxValue -----------------------------------------------
    @Test
    public void recursiveSearchMinValue() {
        int[] arg = new int[]{12, 100, 1, 0, 78, -1, -25, 111};
        Assert.assertEquals(-25, RecursionMethod.recursiveSearchMinValue(arg));
    }

    @Test
    public void recursiveSearchMinValue_parameterNull() {
        int[] arg = null;
        Assert.assertEquals(Integer.MAX_VALUE, RecursionMethod.recursiveSearchMinValue(arg));
    }

    @Test
    public void recursiveSearchMinValue_parameterIsEmpty() {
        int[] arg = new int[0];
        Assert.assertEquals(Integer.MAX_VALUE, RecursionMethod.recursiveSearchMinValue(arg));
    }

// --------------------------------------------- recursiveSearchMaxValue -----------------------------------------------
    @Test
    public void recursiveSearchMaxValue() {
        int[] arg = new int[]{12, 100, 1, 0, 78, -1, -25, 111};
        Assert.assertEquals(111, RecursionMethod.recursiveSearchMaxValue(arg));
    }

    @Test
    public void recursiveSearchMaxValue_parameterNull() {
        int[] arg = null;
        Assert.assertEquals(0, RecursionMethod.recursiveSearchMaxValue(arg));
    }

    @Test
    public void recursiveSearchMaxValue_parameterIsEmpty() {
        int[] arg = new int[0];
        Assert.assertEquals(0, RecursionMethod.recursiveSearchMaxValue(arg));
    }

// ------------------------------------------- recursiveArrayCounting --------------------------------------------------
    @Test
    public void recursiveArrayCounting() {
        int[] arg = new int[]{12, 100, 1, 0, 78, -1, -25, 111};
        Assert.assertEquals(276, RecursionMethod.recursiveArrayCounting(arg));
    }

    @Test
    public void recursiveArrayCounting_parameterNull() {
        int[] arg = null;
        Assert.assertEquals(0, RecursionMethod.recursiveArrayCounting(arg));
    }

    @Test
    public void recursiveArrayCounting_parameterIsEmpty() {
        int[] arg = new int[0];
        Assert.assertEquals(0, RecursionMethod.recursiveArrayCounting(arg));
    }

}