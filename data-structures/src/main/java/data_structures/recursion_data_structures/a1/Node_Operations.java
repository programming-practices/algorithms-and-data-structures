package data_structures.recursion_data_structures.a1;

import java.util.Arrays;

public final class Node_Operations {
    private static boolean resultIsGroving;
    public Node_Operations() {
    }

    public static int get(Node tail, int index) {
        return (index == 0) ? tail.getValue() : get(tail.getNext(), index - 1);
    }

    /**
     * Check is work correctly.
     * */
    public static Node add(Node tail, int newValue) {
        return (tail == null) ? new Node(newValue, null) : add(new Node(tail.getValue(), tail), newValue);
    }

    public static Node insert(Node tail) {
        if (tail == null || tail.getNext() == null) {
            return tail;
        } else {
            //TODO Terminar este methodo
            return null;
        }
    }

    public static Node append(Node tailA, Node tailB) {
        return (tailA == null) ? tailB : new Node(tailA.getValue(), append(tailA.getNext(), tailB));
    }

    public static void printNode(Node node) {
        if (node.getNext() == null) {
            return;
        } else {
            printNode(node.getNext());
            System.out.println(node);
        }
    }

    public static int length(Node tail) {
        return (tail == null) ? 0 : 1 + length(tail.getNext());
    }

    public static int max(Node tail) {
        return (tail == null) ? 0 : Math.max(tail.getValue(), max(tail.getNext()));
    }

    /**
     * If tail == null return zero.
     * */
    public static int min(Node tail) {
        return (tail == null) ? 0 : Math.min(tail.getValue(), min(tail.getNext()));
    }

    public static int sum(Node tail) {
        return (tail == null) ? 0 : tail.getValue() + sum(tail.getNext());
    }

    /**
     * @return true if Node is (1, 2, 3, 4, 5)
     *         true if Node is (0, 2, 4, 5, 7, 10)
     *         false if Node is (1, 0, 2, 3, 4, 5)
     *         false if Node is (1, 2, 0, 3, 4, 5)
     * */
    public static boolean checkIsGrowing(Node tail) {
        if (tail != null && tail.getNext() != null) {
            resultIsGroving = tail.getValue() < tail.getNext().getValue();
            return resultIsGroving && checkIsGrowing(tail.getNext());
        } else {
            return resultIsGroving;
        }
    }

    /**
     * Not work
     */
    public static Boolean checkIsNodeLooping(Node tail) {
        while (tail != null) {
            return checkIsNodeLooping(tail.getNext());
        }
        return null;
    }

    /**
     * Esli elementu ne otsorterirovanue to merge() rabotaet neverno
     * */
    public static Node merge(Node tailA, Node tailB) {
        if (tailA != null && tailB != null) {
            if (tailA.getValue() < tailB.getValue()) {
                return new Node(tailA.getValue(), merge(tailA.getNext(), tailB));
            } else {
                return new Node(tailB.getValue(), merge(tailA, tailB.getNext()));
            }
        } else {
            return (tailA == null) ? tailB : tailA;
        }
    }

    public static Node copy(Node tail) {
        return (tail == null) ? null : new Node(tail.getValue(), copy(tail.getNext()));
    }

    public static boolean isEqual(Node tailA, Node tailB) {
        if (tailA != null && tailB != null) {
            return (tailA.getValue() == tailB.getValue()) && isEqual(tailA.getNext(), tailB.getNext());
        } else {
            return tailA == tailB;
        }
    }

    // ---------------------------------------------- Operations Recursive -------------------------------------------------
    public static String toStringRec(Node tail) {
        return (tail == null) ? "*" : tail.getValue() + "->" + toStringRec(tail.getNext());
    }

    public static Node genRec(int... values) {
        if (values.length == 0) {
            return null;
        } else {
            int[] newArray = Arrays.copyOfRange(values, 1, values.length);
            Node next = genRec(newArray);
            return new Node(values[0], next);
        }
        /*return values.length == 0 ? null : new Node(values[0], genRec(Arrays.copyOfRange(values, 1, values.length)));*/
    }

    public static Node genRecLen(int length) {
        if (length == 0) {
            return null;
        } else {
            return new Node(length, genRecLen(length - 1));
        }
        /*return length == 0 ? null : new Node(length, genRecLen(length - 1));*/
    }

    // -------------------------------------------- Operations Iterative ---------------------------------------------------
    public static String toStringIter(Node tail) {
        String result = "";
        while (tail != null) {
            result += tail.getValue() + "->";
            /*result.concat(result + tail.getValue() + "->");*/
            tail = tail.getNext();
        }
        return result + "*";
    }

    public static Node genIter(int... values) {
        Node tail = null;
        for (int i = values.length - 1; i >= 0; i--) {
            /*for (int i = 0; i < values.length; i++) {*/
            tail = new Node(values[i], tail);
        }
        return tail;
    }

    public static Node genIterLen(int length) {
        Node tail = null;
        for (int i = 0; i < length; i++) {
            tail = new Node(i, tail);
        }
        return tail;
    }
}
