package algorithms.algorithm_of_reverse_string;

public class AlgorithmOfReverseString {

    /**
     * @param value not be Null, value not be empty.
     * @return If value not null return reverse string, if value is null return new String()
     *         If value not empty return reverse string, if value is empty return new String()
     *
     * */
    public static String reverse(String value){

        if (value != null && !value.equals("")) {
            char[] arg = value.toCharArray();
            char[] tmp = new char[arg.length];

            for (int i = 0; i < arg.length; i++) {
                tmp[i] = arg[arg.length - 1 - i];
            }

            return new String(tmp);
        } else {
            return "";
        }

    }
}
