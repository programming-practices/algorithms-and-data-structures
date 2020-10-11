package other;

/**
 *
 * @author Varun Upadhyay (https://github.com/varunu28)
 *
 */

public class RemoveDuplicateFromString {
    public static void main (String[] args) throws Exception{
// ---------------------------------------------------------------------------------------------------------------------
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String inp_str = br.readLine();
//            System.out.println("Actual string is: " + inp_str);
//            System.out.println("String after removing duplicates: " + removeDuplicate(inp_str));
//        }

// ---------------------------------------------------------------------------------------------------------------------
        String value = "String after removing duplicates:";
        System.out.println("Actual string is: " + value);
        System.out.println("String after removing duplicates: " + removeDuplicate(value));

// ---------------------------------------------------------------------------------------------------------------------
    }

    /**
     * This method produces a string after removing all the duplicate characters from input string and returns it
     * Example: Input String - "aabbbccccddddd"
     *          Output String - "abcd"
     * @param value String from which duplicate characters have to be removed
     * @return string with only unique characters
     */

    public static String removeDuplicate(String value) {
        if(value.isEmpty() || value == null) {
            return value;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < value.length(); i++) {
            if (sb.toString().indexOf(value.charAt(i)) == -1) {
                sb.append(String.valueOf(value.charAt(i)));
            }
        }

        return sb.toString();
    }
}
