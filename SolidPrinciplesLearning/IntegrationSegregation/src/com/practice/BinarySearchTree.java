package com.practice;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class BinarySearchTree implements Tree{
    @Override
    public void insert() {
        System.out.println("Inserting a new item");
    }

    @Override
    public void delete() {
        System.out.println("Deleting a new item");
    }

    @Override
    public void traverse() {
        System.out.println("Traversing a new item");
    }
}
