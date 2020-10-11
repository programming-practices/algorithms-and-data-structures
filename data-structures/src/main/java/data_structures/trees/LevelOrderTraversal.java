package data_structures.trees;

class NodeLOT {
    int data;
    NodeLOT left, right;

    public NodeLOT(int item) {
        data = item;
        left = right = null;
    }
}

public class LevelOrderTraversal {
    // Root of the Binary Tree
    NodeLOT root;

    public LevelOrderTraversal() {
        root = null;
    }

    /* function to print level order traversal of tree*/
    void printLevelOrder() {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printGivenLevel(root, i);
    }

    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(NodeLOT root) {
        if (root == null)
            return 0;
        else {
            /**
             * Return the height of larger subtree
             */
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }

    /* Print nodes at the given level */
    void printGivenLevel(NodeLOT root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    /* Driver program to test above functions */
    public static void main(String args[]) {
        LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root = new NodeLOT(1);
        tree.root.left = new NodeLOT(2);
        tree.root.right = new NodeLOT(3);
        tree.root.left.left = new NodeLOT(4);
        tree.root.left.right = new NodeLOT(5);

        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder();
    }
}
