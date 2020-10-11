package algorithms.euclids;

public class GCD {

    public static void main(String[] args) {
// --------------------------------------------------------------------------------------------------------------------
        System.out.println(finGCD(35, 40));
// --------------------------------------------------------------------------------------------------------------------
//        for (int n = 1; n <= 10; n++) {
//
//            for (int m = 1; m <= 10; m++) {
//                System.out.println("n: " + n + " m: " + m + " gcd: " + gcd(n, m));
//            }
//        }
// ---------------------------------------------------------------------------------------------------------------------
    }

    public static int finGCD(int firstNumber, int secondNumber){
        int moduleOfMinimalNumber = Math.abs(firstNumber);
        int gcd = 0;
        if (moduleOfMinimalNumber > Math.abs(secondNumber)){
            moduleOfMinimalNumber = Math.abs(secondNumber);
        }

        for (int count = 1; count <= moduleOfMinimalNumber; count++){
            if (firstNumber % count == 0 && secondNumber % count == 0){
                if (count > gcd){
                    gcd = count;
                }
            }
        }
        return gcd;
    }

    public static int gcd (int n, int m) {

        if (m > n) {
            if ((m % n) == 0)
                return n;
            else
                return gcd(n, m % n);
        }
        else {
            if ((n % m) == 0)
                return m;
            else
                return gcd(m, n % m);
        }
    }


}
