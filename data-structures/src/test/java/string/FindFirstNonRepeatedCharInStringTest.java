package string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static string.FindFirstNonRepeatedCharInString.*;

public class FindFirstNonRepeatedCharInStringTest {

    @Test
    public void testFind_firstSolution() {
        assertEquals('b', find_firstSolution("abcdefghija"));
        assertEquals('h', find_firstSolution("hello"));
        assertEquals('J', find_firstSolution("Java"));
        assertEquals('i', find_firstSolution("simplest"));
    }

    @Test
    public void testFind_secondSolution() {
        assertEquals('b', find_secondSolution("abcdefghija"));
        assertEquals('h', find_secondSolution("hello"));
        assertEquals('J', find_secondSolution("Java"));
        assertEquals('i', find_secondSolution("simplest"));
    }

    @Test
    public void testFind_thirdSolution() {
        assertEquals('b', find_thirdSolution("abcdefghija"));
        assertEquals('h', find_thirdSolution("hello"));
        assertEquals('J', find_thirdSolution("Java"));
        assertEquals('i', find_thirdSolution("simplest"));
    }

}