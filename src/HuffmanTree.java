import java.util.*;

public class HuffmanTree {
    //DO NOT include the frequency or priority in the tree

    private class Node{
        private Node left;
        private char data;
        private Node right;

        private Node(Node L, char d, Node R){
            left = L;
            data = d;
            right = R;
        }
    }

    private Node root;
    private Node current; //this value is changed by the move methods

    public HuffmanTree(){
        root = null;
        current = null;
    }

    public HuffmanTree(char d){
        //makes a single node tree
    }

    public HuffmanTree(String t, char nonLeaf){
        //Assumes t represents a post order representation of the tree as discussed
        // in class
        //nonLeaf is the char value of the data in the non-leaf nodes
        //in the following I will use (char) 128 for the non-leaf value

    }

    public HuffmanTree(HuffmanTree b1, char d, HuffmanTree b2){
        //makes a new tree where b1 is the left subtree and b2 is the right subtree
        //d is the data in the root. Do not make a copy of b1 and b2

    }

    //the move methods to traverse the tree
    //the move methods change the value of current
    //use these in the decoding process

    public void moveToRoot(){
        //change current to reference the root of the tree
    }

    public void moveToLeft(){
        //PRE: the current node is not a leaf
        //change current to reference the left child of the current node

    }

    public void moveToRight(){
        //PRE: the current node is not a leaf
        //change current to reference the right child of the current node
    }

    public boolean atRoot(){
        //returns true if the current node is the root otherwise returns false
    }

    public boolean atLeaf(){
        //returns true if current references a leaf other wise returns false

    }

    public char current(){
        //returns the data value in the node referenced by current
    }

    public String[] pathsToLeaves(){
        /*returns an array of 128 strings (some of which could be null) with all paths from the root to the leaves
        Each string will be a string of 0s and 1s. Store the path for a particular leaf in the array
        at the location of the leaf value’s character code
        */

    }

    public String toString(){
        //returns a string representation of the tree using the postorder format
        //discussed in class

    }
}
