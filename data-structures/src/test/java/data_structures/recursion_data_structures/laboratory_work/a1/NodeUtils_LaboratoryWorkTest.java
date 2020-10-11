package data_structures.recursion_data_structures.laboratory_work.a1;

import data_structures.recursion_data_structures.a1.Node;
import org.junit.Test;

public class NodeUtils_LaboratoryWorkTest {

//================================================= addLast() ==========================================================

    @Test
    public void addLast() {

        Node tail;
        tail = new Node(0, null);
        tail = new Node(1, tail);
        tail = new Node(2, tail);
        tail = new Node(3, tail);
        tail = new Node(4, tail);
        System.out.println(tail.toString());

    }


//======================================================================================================================
    @Test
    public void addLastIterative() {
    }

    @Test
    public void addLastRecursive() {
    }

    @Test
    public void insertInPosition() {
    }

    @Test
    public void insertInPositionIterative() {
    }

    @Test
    public void insertInPositionRecursive() {
    }

    @Test
    public void removeLast() {
    }

    @Test
    public void removeLastIterative() {
    }

    @Test
    public void removeLastRecursive() {
    }

    @Test
    public void removeInPosition() {
    }

    @Test
    public void removeInPositionIterative() {
    }

    @Test
    public void removeInPositionRecursive() {
    }

    @Test
    public void isGrowing() {
    }

    @Test
    public void isGrowingIterative() {
    }

    @Test
    public void isGrowingRecursive() {
    }

    @Test
    public void checkIsGrowing() {
    }

    @Test
    public void checkNotGrowing() {
    }
}