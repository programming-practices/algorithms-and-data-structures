package data_structures.recursion_data_structures.a2;

import java.util.Objects;
/**
 * Sources: https://www.youtube.com/watch?v=-XHda6ToBW8&index=5&list=PLoij6udfBncijqEUPXhY-NS0ZKWALlN0B
 *          start: 3:10 end...
 * */
public class DoubleNode {
    private int value;
    private DoubleNode previous;
    private DoubleNode next;

    public DoubleNode(int value, DoubleNode previous, DoubleNode next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DoubleNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleNode previous) {
        this.previous = previous;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoubleNode that = (DoubleNode) o;
        return value == that.value &&
                Objects.equals(previous, that.previous) &&
                Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, previous, next);
    }

    /*@Override
    public String toString() {
        return "DoubleNode{" +
                "value=" + value +
                ", previous=" + previous +
                ", next=" + next +
                '}';
    }*/
    @Override
    public String toString() {
        return " <-" + previous + "-(" + value + ")-" + next + "-> ";
    }
}

