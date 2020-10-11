package string;

import java.util.Scanner;

/**
 * Java Program to count vowels in a String. It accept a String from command prompt
 * and count how many vowels it contains. To revise, 5 letters a, e, i, o and u are
 * known as vowels in English.
 *
 * @link https://www.java67.com/2013/11/how-to-count-vowels-and-consonants-in-Java-String-word.html
 */
public class VowelCounter {

    public static void main(String args[]) {
        System.out.println("Please enter some text");
        Scanner reader = new Scanner(System.in);

        String input = reader.nextLine();
        char[] letters = input.toCharArray();

        int count = 0;

        for (char c : letters) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    count++;
                    break;
                default:
                    // no count increment
            }

        }
        System.out.println("Number of vowels in String [" + input + "] is : " + count);
    }

}
