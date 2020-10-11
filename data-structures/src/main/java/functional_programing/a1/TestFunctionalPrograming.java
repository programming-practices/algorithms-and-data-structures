package functional_programing.a1;

import java.util.Arrays;

public class TestFunctionalPrograming {
    public static void main(String[] args) {
//        Node<Integer> tail = genRec(1, 3, 22, 2);
//        System.out.println(foldLeft(0, SUM, tail));
//        System.out.println(foldLeft(1, MUL, tail));
//        System.out.println(foldLeft(1, MAX, tail));
    }

    public static <T> Node<T> genRec(T... values) {
        if (values.length == 0) {
            return null;
        } else {
            T[] newArray = Arrays.copyOfRange(values, 1, values.length);
            Node<T> next = genRec(newArray);
            return new Node<T>(values[0], next);
        }
    }
}
