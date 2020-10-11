package data_structures.recursion_data_structures.a1;

import static data_structures.recursion_data_structures.a1.Node_Operations.*;

class Node_Main {
    public static void main(String[] args) {
// ---------------------------------------------------------------------------------------------------------------------
        Node tailA;
        Node nodeA0 = new Node(0, null);
        Node nodeA1 = new Node(1, null);
        Node nodeA2 = new Node(2, null);
        Node nodeA3 = new Node(3, null);
        Node nodeA4 = new Node(4, null);

        nodeA0.setNext(nodeA1);
        nodeA1.setNext(nodeA2);
        nodeA2.setNext(nodeA3);
        nodeA3.setNext(nodeA4);
        tailA = nodeA0;

//        System.out.println("1-----------------------------------------------------------------");
//        printNode(tailA);

// ---------------------------------------------------------------------------------------------------------------------
        Node tailB;
        tailB = new Node(0, null);
        tailB = new Node(1, tailB);
        tailB = new Node(2, tailB);
        tailB = new Node(3, tailB);
        tailB = new Node(4, tailB);
//        System.out.println("2-----------------------------------------------------------------");
//        printNode(tailB);

// ---------------------------------------------------------------------------------------------------------------------
        Node tailC = genIter(0, 1, 2, 3, 4);
//        System.out.println("genIter()----------------------------------------------------------");
//        printNode(tailC);

        Node tailD = genRec(0, 1, 2, 3, 4);
//        System.out.println("genRec()----------------------------------------------------");
//        printNode(tailD);

// ---------------------------------------------------------------------------------------------------------------------
        Node tailE = genIter(0, 1, 2, 3, 4);
//        System.out.println(toStringIter(tailE));
//        System.out.println(toStringRec(tailE));
//        System.out.println(tailE.getLength());

// ---------------------------------------------------------------------------------------------------------------------
        Node tailF = genIter(10, 20, 30, 40);
        Node tailG = genIter(25, 25, 30, 32, 45);
        // Esli elementu ne otsorterirovanue to merge() rabotaet neverno
//        Node tailF = genIter(20, 10, 40, 30);
//        Node tailG = genIter(45, 30, 25, 32, 25);
//        System.out.println(toStringIter(tailF));
//        System.out.println(toStringIter(tailG));
//        System.out.println(toStringIter(merge(tailF, tailG)));

// ------------------------------------------------- isEqual() ---------------------------------------------------------
        Node nodeAA = genIter(0, 1, 2, 3, 4);
        Node nodeBB = copy(nodeAA);
//        System.out.println("nodeAA: " + toStringIter(nodeAA));
//        System.out.println("nodeBB: " + toStringIter(nodeBB));
//        System.out.println("isEqual(): " + isEqual(nodeAA, nodeBB));
//        System.out.println("----------------------");
//        nodeBB.getNext().getNext().setValue(1000);
//        nodeBB.getNext().getNext().getNext().setValue(1000);
//        System.out.println("nodeAA: " + toStringIter(nodeAA));
//        System.out.println("nodeBB: " + toStringIter(nodeBB));
//        System.out.println("isEqual(): " + isEqual(nodeAA, nodeBB));

// ---------------------------------------------------------------------------------------------------------------------
        Node nodeG = genIter(0, 1, 2, 3, 4);
        System.out.println(length(nodeG));

// ---------------------------------------------------------------------------------------------------------------------
    }
}