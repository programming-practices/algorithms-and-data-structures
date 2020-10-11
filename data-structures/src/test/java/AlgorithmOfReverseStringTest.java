import algorithms.algorithm_of_reverse_string.AlgorithmOfReverseString;
import org.junit.Assert;
import org.junit.Test;

public class AlgorithmOfReverseStringTest {

    @Test
    public void reverseIsNull() {
        Assert.assertEquals(AlgorithmOfReverseString.reverse(null), "");
    }

    @Test
    public void reverseIsEmpty() {
        Assert.assertEquals(AlgorithmOfReverseString.reverse(""), "");
    }

    @Test
    public void reverse() {
        Assert.assertEquals(AlgorithmOfReverseString.reverse("Test String!!!"), "!!!gnirtS tseT");
    }
}