package data_structures.recursion_data_structures.a1;

import java.util.Objects;

/**
 *  Sources: 1. https://www.youtube.com/watch?v=0M2IoZAffkw&list=PLoij6udfBncijqEUPXhY-NS0ZKWALlN0B
 *
 * */
public class Node {
    private int value;
    private Node next;
    private int length = 1;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
        length++;
    }

    public int getLength() {
        return length;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        length++;
        return next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
        length++;
    }

//    @Override
//    public String toString() {
//        return "NodeTree{" +
//                "value=" + value +
//                ", next=" + next +
//                '}';
//    }
    @Override
    public String toString() {
        return  value + "->" + next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return value == node.value &&
                length == node.length &&
                Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next, length);
    }
}
