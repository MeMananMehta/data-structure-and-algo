package com.company;


public class Main {

    public static void main(String[] args) {

        Tree intTree = new Tree();

        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);

        //traversing in-order
        intTree.traverseInOrder();

        System.out.println();


        TreeNode f = intTree.get(22);
        if (f!= null){
            System.out.println("found " + f.getData());
        }else{
            System.out.println("not found");
        }

        System.out.println(intTree.min());
        System.out.println(intTree.max());


    }



}
