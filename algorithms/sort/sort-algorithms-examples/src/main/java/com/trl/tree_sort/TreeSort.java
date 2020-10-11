package com.trl.tree_sort;

public class TreeSort {

//	public Node_LevelOrderTraversal root;
//
//	public sortings.tree_sort.TreeSort(Object x) {
//		root = new Node_LevelOrderTraversal(x);
//	}//end sortings.tree_sort.TreeSort constructor
//
//	public Node_LevelOrderTraversal insert(Node_LevelOrderTraversal node, Integer x) {
//		if (node == null) {
//			return node = new Node_LevelOrderTraversal(x);
//		}//end if
//		if (x < (Integer) node.anElement) {
//			node.less = insert(node.less, x);
//		} //end if
//		else {
//			node.greater = insert(node.greater, x);
//		}//end else
//		return node;
//	}//end insert
//
//
//	public Node_LevelOrderTraversal decimalInsert(Node_LevelOrderTraversal node, Double x) {
//		if (node == null) {
//			return node = new Node_LevelOrderTraversal(x);
//		}//end if
//		if (x < (Double) node.anElement) {
//			node.less = decimalInsert(node.less, x);
//		} //end if
//		else {
//			node.greater = decimalInsert(node.greater, x);
//		}//end else
//		return node;
//	}//end insert
//
//
// public void treeSort(Node_LevelOrderTraversal node) {
//	 if (node != null) {
//		 treeSort(node.less);
//		 System.out.print(((Object) node.anElement) + ", ");
//		 treeSort(node.greater);
//	 }//end if
// }//end sortings.tree_sort.TreeSort class
//
//
//
//public static void main(String args[]) {
//	 int[] intArray = {12, 40, 9, 3, 19, 74, 7, 31, 23, 54, 26, 81, 12 };
//	 	sortings.tree_sort.TreeSort ts = new sortings.tree_sort.TreeSort(new Integer(intArray[0]));
//	 	for (int i = 1; i < intArray.length; i++) { //sorts every index of the list one at a time
//	 		ts.insert(ts.root, new Integer(intArray[i])); //builds on the tree from a root node
//	 	}//end for
//	  		System.out.print("Integer array Sorted in Increasing Order: ");
//	  	ts.treeSort(ts.root);
//	  		System.out.println(); //To sort a test array of integers
//
//	 Double[] decimalArray = {8.2, 1.5, 3.14159265, 9.3, 5.1, 4.8, 2.6};
//	 	sortings.tree_sort.TreeSort dts = new sortings.tree_sort.TreeSort(new Double(decimalArray[0]).doubleValue());
//	 	for (int i = 1; i < decimalArray.length; i++) { //sorts every index of the list one at a time
//	 		dts.decimalInsert(dts.root, new Double(decimalArray[i]).doubleValue()); //builds on the tree from a root node
//	 	}//end for
//	 		System.out.print("Decimal array, Sorted in Increasing Order: ");
//	  	dts.treeSort(dts.root);
//	  		System.out.println();
//
//	 String[] stringArray = {"c", "a", "e", "b","d", "dd","da","zz", "AA", "aa","aB","Hb", "Z"};
//        int last = stringArray.length;
//        Arrays.sort(stringArray); //Uses an imported arrays method to automatically alphabetize
//        	System.out.print("String array Sorted in Alphabetical Order: ");
//        ts.insert(ts.root, last);
//        for(int i=0; i<last; i++){
//        	System.out.print(stringArray[i]+"\t");
//            	//To sort a test array of strings hard coded in the main method
//            	//Please Note that Capital letters always come before lower case
//            	//I tried to make the test array show its behavior clearly
//        }//end for
//}//end Main method
}//end sortings.tree_sort.TreeSort class

