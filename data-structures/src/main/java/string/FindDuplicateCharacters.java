package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Java Program to find duplicate characters in String.
 *
 *
 * @author http://java67.blogspot.com
 * @link https://www.java67.com/2014/03/how-to-find-duplicate-characters-in-String-Java-program.html
 */
public class FindDuplicateCharacters{

    /*
     * Find all duplicate characters in a String and print each of them.
     */
    public static Map<Character, Integer> find(String word) {
        Map<Character, Integer> charMap = null;

        if (word != null && !word.isEmpty()) {

            char[] characters = word.toCharArray();

            // build HashMap with character and number of times they appear in String
            charMap = new HashMap<>();
            for (Character ch : characters) {
                if (charMap.containsKey(ch)) {
                    charMap.put(ch, charMap.get(ch) + 1);
                } else {
                    charMap.put(ch, 1);
                }
            }
        }

        return charMap;
    }

    public static void print(String word, Map<Character, Integer> charMap) {
        // Iterate through HashMap to print all duplicate characters of String
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", word);
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }

}
