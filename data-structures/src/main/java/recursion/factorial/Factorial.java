package recursion.factorial;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

/*
* Sources:
* 		1. https://www.youtube.com/watch?v=NtKfkaQ-OWw
*		2. https://www.youtube.com/watch?v=vzEUMo9JD5o&index=2&list=PLoij6udfBncifDy8AjaU5wcG_UDPjDSSb
*		   Golovach ot 20:00
* */
public class Factorial {
	public static void main(String[] str) throws IOException {
//------------------V-vod-Chisla-kotoroe-nado-privodit-k-factorialy-vvoditsa-v-consoli----------------------------
		/**
		 * This program displays factorials as the user enters values interactively
		 **/
		// This is how we set things up to read lines of text from the user.
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // Loop forever
//        for(;;) {
            // Display a prompt to the user
//            System.out.print("FactQuoter> ");
            // Read a line from the user
//            String line = in.readLine();
            // If we reach the end-of-file, 
	    // or if the user types "quit", then quit
//            if ((line == null) || line.equals("quit")) break;
            // Try to parse the line, and compute and print the factorial
//            try {
//                int x = Integer.parseInt(line);
//                System.out.println(x + "! = " + Factorial_4.factorial(x));
//            }
            // If anything goes wrong, display a generic error message
//            catch(Exception e) { System.out.println("Invalid Input"); }
//        }
//----------------------------------Facrorial_1-------------------------------------------------------------------
		for(int i = 0; i < 50; i++) {
			System.out.println(i + "! = " + Factorial_1.factorial(i));
		}
//---------------------------------Factorial_4---------------------------------------------------------------------
		/**
		 * A simple main() method that we can use as a standalone test program for our
		 * factorial() method.
		 **/
//		for (int i = 0; i <= 50; i++)
//			System.out.println(i + "! = " + Factorial_4.factorial(i));
//----------------------------------Factorial_5--------------------------------------------------------------------
//		/**
//		 * The main method
//		 *
//		 * @param args
//		 *            Command line arguments
//		 */
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter a non-negative integer: ");
//
//		// If user does not enter an Integer, we want program to fail gracefully,
//		// letting the user know why it terminated
//		try {
//			int number = input.nextInt();
//
//			// We keep prompting the user until they enter a positive number
//			while (number < 0) {
//				System.out.println("Your input must be non-negative. Please enter a positive number: ");
//				number = input.nextInt();
//			}
//			// Display the result
//			System.out.println("The factorial of " + number + " will yield: " + Factorial_5.factorial(number));
//
//		} catch (Exception e) {
//			System.out.println("Error: You did not enter an integer. Program has terminated.");
//		}
//		input.close();
//---------------------------------------------- Factorial_6 -----------------------------------------------------------
//			System.out.println(Factorial_6.fact(5));

//---------------------------------------------- Factorial_7 -----------------------------------------------------------
//		System.out.println(Factorial_7.getFactorial(3));
//		System.out.println(Factorial_7.getFactorial(4));
//		System.out.println(Factorial_7.getFactorial(5));

//----------------------------------------------------------------------------------------------------------------------
	}

	/**
	 * This class doesn't define a main() method, so it isn't a program by itself.
	 * It does define a useful method that we can use in other programs, though.
	 **/
	public static class Factorial_1 {
		/** Compute and return x!, the factorial of x */
		public static BigInteger factorial(int arg) {
			if (arg < 0)
				throw new IllegalArgumentException("x must be >= 0");
			BigInteger fact = BigInteger.ONE;
			for (int i = 2; i <= arg; i++) // loop
				fact = fact.multiply(BigInteger.valueOf(i)); // shorthand for: fact = fact * i;
//				fact *= i; // shorthand for: fact = fact * i;
			return fact;
		}
	}

	/**
	 * This class shows a recursive method to compute factorials. This method calls
	 * itself repeatedly based on the formula: n! = n * (n-1)!
	 **/
	public static class Factorial_2 {
		public  static long factorial(long arg) {
			if (arg < 0)
				throw new IllegalArgumentException("arg must be >= 0");
			if (arg <= 1)
				return 1; // Stop recursing here
			else
				return arg * factorial(arg - 1); // Recurse by calling ourselves
		}
	}

	/**
	 * This class computes factorials and caches the results in a table for reuse.
	 * 20! is as high as we can go using the long data type, so check the argument
	 * passed and "throw an exception" if it is too big or too small.
	 **/
	public static class Factorial_3 {
		// Create an array to cache values 0! through 20!.
		static long[] table = new long[21];
		// A "static initializer": initialize the first value in the array
		static {
			table[0] = 1;
		} // factorial of 0 is 1.
		// Remember the highest initialized value in the array
		static int last = 0;

		public static long factorial(int arg) throws IllegalArgumentException {
			// Check if x is too big or too small. Throw an exception if so.
			if (arg >= table.length) // ".length" returns length of any array
				throw new IllegalArgumentException("Overflow; x is too large.");
			if (arg < 0)
				throw new IllegalArgumentException("x must be non-negative.");

			// Compute and cache any values that are not yet cached.
			while (last < arg) {
				table[last + 1] = table[last] * (last + 1);
				last++;
			}
			// Now return the cached factorial of x.
			return table[arg];
		}
	}

	// Import some other classes we'll use in this example.
	// Once we import a class, we don't have to type its full name.
	public static class Factorial_4 {
		protected static ArrayList table = new ArrayList(); // create cache
		static { // Initialize the first element of the cache with !0 = 1.
			table.add(BigInteger.valueOf(1));
		}

		/** The factorial() method, using BigIntegers cached in a ArrayList */
		public static synchronized BigInteger factorial(int x) {
			if (x < 0)
				throw new IllegalArgumentException("x must be non-negative.");
			for (int size = table.size(); size <= x; size++) {
				BigInteger lastfact = (BigInteger) table.get(size - 1);
				BigInteger nextfact = lastfact.multiply(BigInteger.valueOf(size));
				table.add(nextfact);
			}
			return (BigInteger) table.get(x);
		}
	}

	/**
	 * This program will print out the factorial of any non-negative number that you
	 * input into it.
	 *
	 * @author Marcus
	 */
	public static class Factorial_5 {
		/**
		 * Recursive factorial Method
		 *
		 * @param n
		 *            The number to factorial
		 * @return The factorial of the number
		 */
		public static long factorial(int n) {
			if (n == 0 || n == 1)
				return 1;
			return n * factorial(n - 1);
		}
	}


	public static class Factorial_6 {

		public static int fact(int x) {
			if (x > 1) {
				return x * fact(x - 1);
			} else {
				return 1;
			}
		}
	}

	public static class Factorial_7 {

		public static int getFactorial(int number){
			int result = 0;

			if(number == 1)return 1;
			result = getFactorial(number - 1) * number;
			return result;
		}

	}
}





/*
-----------------------------------------------------------------------------------------------------------------------
Факториал — функция, определённая на множестве неотрицательных целых чисел.
-----------------------------------------------------------------------------------------------------------------------
Nol factorial dolzen but raven odinice toest  0! = 1
I toze 1! = 1
-----------------------------------------------------------------------------------------------------------------------

*/