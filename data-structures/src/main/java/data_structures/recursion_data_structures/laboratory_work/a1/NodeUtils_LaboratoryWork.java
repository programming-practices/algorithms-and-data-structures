package data_structures.recursion_data_structures.laboratory_work.a1;

import data_structures.recursion_data_structures.a1.Node;

/**
 * Sources: https://www.youtube.com/watch?v=irwWohaLKDM&index=3&list=PLoij6udfBncijqEUPXhY-NS0ZKWALlN0B
 *          start 32:30 end ...
 * */
public final class NodeUtils_LaboratoryWork {

    public static Node addLast (Node tail, int value) {
        if (tail.getNext() != null){
            return addLast(tail.getNext(), value);
        } else {
            tail.setNext(new Node(value, null));
            return tail;
        }
    }

    public static Node addLastIterative (Node tail, int value) {
        return null;
    }

    public static Node addLastRecursive (Node tail, int value) {
        return null;
    }

    public static Node insertInPosition (Node tail, int index, int value) {
        return null;
    }

    public static Node insertInPositionIterative (Node tail, int index, int value) {
        return null;
    }

    public static Node insertInPositionRecursive (Node tail, int index, int value) {
        return null;
    }

    public static Node removeLast (Node tail) {
        return null;
    }

    public static Node removeLastIterative (Node tail) {
        return null;
    }

    public static Node removeLastRecursive (Node tail) {
        return null;
    }

    public static Node removeInPosition (Node tail, int index) {
        return null;
    }

    public static Node removeInPositionIterative (Node tail, int index) {
        return null;
    }

    public static Node removeInPositionRecursive (Node tail, int index) {
        return null;
    }

    public static boolean isGrowing(Node tail, int startValue) {
        return false;
    }

    public static boolean isGrowingIterative(Node tail, int startValue) {
        return false;
    }

    public static boolean isGrowingRecursive(Node tail, int startValue) {
        return false;
    }

    public static void checkIsGrowing(Node tail) {
        if (!isGrowing(tail, -1)) {
            throw new AssertionError("must be (isGrowing() == true) for " + tail);
        }
    }

    public static void checkNotGrowing(Node tail) {
        if (isGrowing(tail, -1)) {
            throw new AssertionError("must be (isGrowing() == false) for " + tail);
        }
    }

}
