package functional_programing.a1;

public class Node<T> {
    private T value;
    private Node<T> next;
    private int length = 1;

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
        length++;
    }

    public int getLength() {
        return length;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getNext() {
        length++;
        return next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(Node<T> next) {
        this.next = next;
        length++;
    }

        @Override
    public String toString() {
        return "NodeTree{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }




}
