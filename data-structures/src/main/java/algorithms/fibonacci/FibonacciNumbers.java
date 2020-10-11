package algorithms.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumbers {
    private static int fib1Counter = 0;
    private static int fib2Counter = 0;
    private static int fib3Counter = 0;

    public static long fib1 (int number){
        fib1Counter++;
        if (number <= 2){
            return 1;
        }
        return fib1(number - 1) + fib1(number - 2);
    }

    private static Map<Integer, Long> solved = new HashMap<>();
    public static long fib2 (int number){
        fib2Counter++;
        if (number <= 2){
            return 1;
        }
        if (solved.containsKey(number)) {
            return solved.get(number);
        }
        long ans = fib2(number - 1) + fib2(number - 2);
        solved.put(number, ans);
        return ans;
    }
    // Reweno s pomowchiy denamicheskoho prohramirovania
    public static long fib3(int number){
        fib3Counter++;
        long[] db = new long[number + 1];
        db[1] = 1;
        db[2] = 1;
        for (int i = 3; i <= number; i++) {
            db[i] = db[i - 1] + db[i - 2];
        }
        return db[number];
    }

    public static int fib6_A(int arg) {
        if (arg == 0) return 1;
        if (arg == 1) return 1;
        int[] result = new int[arg + 1];
        result[0] = 1;
        result[1] = 1;

        for (int i = 2; i < result.length; i++){
            result[i] = result[i-2] + result[i-1];
        }
        return result[arg];
    }
    public static int fib6_B(int arg){
        if (arg == 0) {
            return 1;
        } else if (arg == 1) {
            return 1;
        }else {
            return fib6_B(arg - 2) + fib6_B(arg - 1);
        }
    }

    public static int fib7(int arg) {
        return arg < 2 ? 1 : fib7(arg - 2) + fib7(arg - 1);
    }

    public static void main(String[] args) {
// --------------------------------------------------------------------------------------------------------------------
//        System.out.println(FibonacciNumbers.fib1(25));
//        System.out.println(FibonacciNumbers.fib2(25));
//        System.out.println(FibonacciNumbers.fib3(25));
//        System.out.println("fib1Counter = " + fib1Counter);
//        System.out.println("fib2Counter = " + fib2Counter);
//        System.out.println("fib3Counter = " + fib3Counter);

// --------------------------------------------------------------------------------------------------------------------
        for (int i = 0; i < 10; i++) {
            System.out.println("fib7(" + i + ") = " + fib7(i));
        }
// --------------------------------------------------------------------------------------------------------------------
    }
}

/*
------------------------------------------------------------------------------------------------------------------------
F(0) = 1
F(1) = 1
F(2) = F(0) + F(1)
F(3) = F(1) + F(2)
...
F(k) = F(k - 2) + F(k - 1)

Fk = (1.68)^k

------------------------------------------------------------------------------------------------------------------------

*/
