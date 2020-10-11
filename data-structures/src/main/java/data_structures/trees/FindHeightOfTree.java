package data_structures.trees;

import java.util.LinkedList;


/**
 * @author Varun Upadhyay (https://github.com/varunu28)
 */
public class FindHeightOfTree {

    // Driver Program
    public static void main(String[] args) {
        NodeFHT tree = new NodeFHT(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(1);
        tree.insert(-1);
        tree.insert(29);
        tree.insert(93);
        tree.insert(6);
        tree.insert(0);
        tree.insert(-5);
        tree.insert(-6);
        tree.insert(-8);
        tree.insert(-1);

        // A level order representation of the tree
        tree.printLevelOrder();
        System.out.println();

        System.out.println("Height of the tree is: " + tree.findHeight());
    }
}

/**
 * The Other.NodeTree class which initializes a Other.NodeTree of a tree
 * printLevelOrder: ROOT -> ROOT's CHILDREN -> ROOT's CHILDREN's CHILDREN -> etc
 * findHeight: Returns the height of the tree i.e. the number of links between root and farthest leaf
 */
class NodeFHT {
    NodeFHT left, right;
    int data;

    public NodeFHT(int data) {
        this.data = data;
    }

    public void insert (int value) {
        if (value < data) {
            if (left == null) {
                left = new NodeFHT(value);
            }
            else {
                left.insert(value);
            }
        }
        else {
            if (right == null) {
                right = new NodeFHT(value);
            }
            else {
                right.insert(value);
            }
        }
    }

    public void printLevelOrder() {
        LinkedList<NodeFHT> queue = new LinkedList<>();
        queue.add(this);
        while(!queue.isEmpty()) {
            NodeFHT n = queue.poll();
            System.out.print(n.data + " ");
            if (n.left != null) {
                queue.add(n.left);
            }
            if (n.right != null) {
                queue.add(n.right);
            }
        }
    }

    public int findHeight() {
        return findHeight(this);
    }

    private int findHeight(NodeFHT root) {
        if (root.left == null && root.right == null) {
            return 0;
        }
        else if (root.left != null && root.right != null) {
            return 1 + Math.max(findHeight(root.left), findHeight(root.right));
        }
        else if (root.left == null && root.right != null) {
            return 1 + findHeight(root.right);
        }
        else {
            return 1 + findHeight(root.left);
        }
    }
}

