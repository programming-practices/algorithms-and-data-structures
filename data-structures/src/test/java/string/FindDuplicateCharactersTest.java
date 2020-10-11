package string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class FindDuplicateCharactersTest {

    private String str_source_1;
    private String str_source_2;
    private String str_source_3;

    private Map<Character, Integer> result_source_1;
    private Map<Character, Integer> result_source_2;
    private Map<Character, Integer> result_source_3;

    @Before
    public void setUp() throws Exception {
        str_source_1 = "Programmer";
        result_source_1 = new HashMap<>();
        result_source_1.put('P', 1);
        result_source_1.put('r', 3);
        result_source_1.put('o', 1);
        result_source_1.put('g', 1);
        result_source_1.put('a', 1);
        result_source_1.put('m', 2);
        result_source_1.put('e', 1);

        str_source_2 = "Combination";
        result_source_2 = new HashMap<>();
        result_source_2.put('C', 1);
        result_source_2.put('o', 2);
        result_source_2.put('m', 1);
        result_source_2.put('b', 1);
        result_source_2.put('i', 2);
        result_source_2.put('n', 2);
        result_source_2.put('a', 1);
        result_source_2.put('t', 1);

        str_source_3 = "java";
        result_source_3 = new HashMap<>();
        result_source_3.put('j', 1);
        result_source_3.put('a', 2);
        result_source_3.put('v', 1);
    }

    @Test
    public void find() {
        assertEquals(result_source_1, FindDuplicateCharacters.find(str_source_1));
        assertEquals(result_source_2, FindDuplicateCharacters.find(str_source_2));
        assertEquals(result_source_3, FindDuplicateCharacters.find(str_source_3));
    }

    public void find_fail() {
        // TODO: Finish this test.
    }

    @Test
    public void find_parameter_null() {
        Assert.assertNull(FindDuplicateCharacters.find(null));
    }

}