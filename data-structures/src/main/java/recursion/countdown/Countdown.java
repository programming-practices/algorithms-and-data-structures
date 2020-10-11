package recursion.countdown;

public class Countdown {
    public static void main(String[] args) {
        countdown(5);
    }

    private static void countdown(int value) {
        System.out.println(value);

        // base case
        if (value <= 0) {
            return;
        } else {
            countdown(value - 1);
        }
    }
}