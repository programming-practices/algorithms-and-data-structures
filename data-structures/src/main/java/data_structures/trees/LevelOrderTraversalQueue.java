package data_structures.trees;

import java.util.LinkedList;
import java.util.Queue;

/* Class to represent Tree node */
class NodeLOTQ {
    int data;
    NodeLOTQ left, right;

    public NodeLOTQ(int item) {
        data = item;
        left = null;
        right = null;
    }
}

/* Class to print Level Order Traversal */
public class LevelOrderTraversalQueue {

    NodeLOTQ root;

    /* Given a binary tree. Print its nodes in level order
     using array for implementing queue  */
    void printLevelOrder() {
        Queue<NodeLOTQ> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
 
            /* poll() removes the present head.
            For more information on poll() visit 
            http://www.tutorialspoint.com/java/util/linkedlist_poll.htm */
            NodeLOTQ tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            /*Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    public static void main(String args[]) {
        /* creating a binary tree and entering 
         the nodes */
        LevelOrderTraversalQueue tree_level = new LevelOrderTraversalQueue();
        tree_level.root = new NodeLOTQ(1);
        tree_level.root.left = new NodeLOTQ(2);
        tree_level.root.right = new NodeLOTQ(3);
        tree_level.root.left.left = new NodeLOTQ(4);
        tree_level.root.left.right = new NodeLOTQ(5);

        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }
}