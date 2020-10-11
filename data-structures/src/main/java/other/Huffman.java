package other;

import java.util.*;

/**
 * @author Mayank Kumar (mk9440)
 */
/*
Output :

Enter number of distinct letters 
6
Enter letters with its frequency to encode
Enter letter : a
Enter frequency : 45

Enter letter : b
Enter frequency : 13

Enter letter : c
Enter frequency : 12

Enter letter : d
Enter frequency : 16

Enter letter : e
Enter frequency : 9

Enter letter : f
Enter frequency : 5

Letter		Encoded Form
a		0 
b		1 0 1 
c		1 0 0 
d		1 1 1 
e		1 1 0 1 
f		1 1 0 0 

*/

class NodeH {
    String letr = "";
    int freq = 0, data = 0;
    NodeH left = null, right = null;
}

//A comparator class to sort list on the basis of their frequency
class Comp implements Comparator<NodeH> {
    @Override
    public int compare(NodeH o1, NodeH o2) {
        if (o1.freq > o2.freq) {
            return 1;
        } else if (o1.freq < o2.freq) {
            return -1;
        } else {
            return 0;
        }
    }
}


public class Huffman {

    // A simple function to print a given list
    //I just made it for debugging
    public static void print_list(List<NodeH> li) {
        Iterator<NodeH> it = li.iterator();
        while (it.hasNext()) {
            NodeH n = it.next();
            System.out.print(n.freq + " ");
        }
        System.out.println();
    }

    //Function for making tree (Other.Huffman Tree)
    public static NodeH make_huffmann_tree(List<NodeH> li) {
        //Sorting list in increasing order of its letter frequency
        li.sort(new Comp());
        NodeH temp = null;
        Iterator<NodeH> it = li.iterator();
        //System.out.println(li.size());
        //Loop for making huffman tree till only single node remains in list
        while (true) {
            temp = new NodeH();
            //a and b are  Other.NodeTree which are to be combine to make its parent
            NodeH a = new NodeH();
            NodeH b = new NodeH();
            a = null;
            b = null;
            //checking if list is eligible for combining or not
            //here first assignment of it.next in a will always be true as list till end will
            //must have atleast one node
            a = (NodeH) it.next();
            //Below condition is to check either list has 2nd node or not to combine
            //If this condition will be false, then it means construction of huffman tree is completed
            if (it.hasNext()) {
                b = (NodeH) it.next();
            }
            //Combining first two smallest nodes in list to make its parent whose frequency
            //will be equals to sum of frequency of these two nodes
            if (b != null) {
                temp.freq = a.freq + b.freq;
                a.data = 0;
                b.data = 1;//assigining 0 and 1 to left and right nodes
                temp.left = a;
                temp.right = b;
                //after combing, removing first two nodes in list which are already combined
                li.remove(0);//removes first element which is now combined  -step1
                li.remove(0);//removes 2nd element which comes on 1st position after deleting first in step1
                li.add(temp);//adding new combined node to list
                //print_list(li);  //For visualizing each combination step
            }
            //Sorting after combining to again repeat above on sorted frequency list
            li.sort(new Comp());
            it = li.iterator();//resetting list pointer to first node (head/root of tree)
            if (li.size() == 1) {
                return (NodeH) it.next();
            } //base condition ,returning root of huffman tree
        }
    }

    //Function for finding path between root and given letter ch
    public static void dfs(NodeH n, String ch) {
        Stack<NodeH> st = new Stack<>(); // stack for storing path
        int freq = n.freq; // recording root freq to avoid it adding in path encoding
        find_path_and_encode(st, n, ch, freq);
    }

    //A simple utility function to print stack (Used for printing path)
    public static void print_path(Stack<NodeH> st) {
        for (int i = 0; i < st.size(); i++) {
            System.out.print(st.elementAt(i).data + " ");
        }
    }

    public static void find_path_and_encode(Stack<NodeH> st, NodeH root, String s, int f) {
        //Base condition
        if (root != null) {
            if (root.freq != f) {
                st.push(root);
            } // avoiding root to add in path/encoding bits
            if (root.letr.equals(s)) {
                print_path(st);
                return;
            } // Recursion stopping condition when path gets founded
            find_path_and_encode(st, root.left, s, f);
            find_path_and_encode(st, root.right, s, f);
            //Popping if path not found in right or left of this node,because we previously
            //pushed this node in taking a mindset that it might be in path
            st.pop();
        }
    }

    public static void main(String args[]) {
        List<NodeH> li = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of distinct letters ");
        int n = in.nextInt();
        String s[] = new String[n];
        System.out.print("Enter letters with its frequency to encode\n");
        for (int i = 0; i < n; i++) {
            NodeH a = new NodeH();
            System.out.print("Enter letter : ");
            a.letr = in.next();
            s[i] = a.letr;
            System.out.print("Enter frequency : ");
            a.freq = in.nextInt();
            System.out.println();
            li.add(a);
        }
        in.close();
        NodeH root = new NodeH();
        root = make_huffmann_tree(li);
        System.out.println("Letter\t\tEncoded Form");
        for (int i = 0; i < n; i++) {
            System.out.print(s[i] + "\t\t");
            dfs(root, s[i]);
            System.out.println();
        }
    }
}
