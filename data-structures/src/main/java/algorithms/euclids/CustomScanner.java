package algorithms.euclids;

import java.util.Scanner;

public class CustomScanner {
    private static  final Scanner scanner = new Scanner(System.in);
    public static int getInt(){
        while (true){
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }else {
                System.out.println("Incorect value! Please entr just integer: ");
                throw new RuntimeException();
            }
        }
    }
    public static void close(){scanner.close();}
}

class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Please enter two integer number: ");
        int firstNumber = CustomScanner.getInt();
        int secondNumber = CustomScanner.getInt();
    }
}
