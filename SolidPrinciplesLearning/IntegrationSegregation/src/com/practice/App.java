package com.practice;

public class App {
    public static void main(String args[]){
        Tree tree = new BinarySearchTree();
        tree.delete();
        tree.insert();
        tree.traverse();

        RotationTree rotationTree = new BalancedTree();
        rotationTree.leftRotation();
        rotationTree.rightRotation();
    }
}
