package com.company;

public class EmpLinkedList {

    private EmpNode head;
    private int size;

    public void addToFront(Employee employee){
        EmpNode node = new EmpNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public void printList(){
        EmpNode current = head;
        System.out.print("HEAD -> ");
        while(current!=null) {
            System.out.print(current);
            System.out.print("-> ");
            current = current.getNext();

        }
        System.out.println("null");

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

     public EmpNode removeFromFront(){
        if(isEmpty()){
            return null;
        }else{
            EmpNode removedNode = head;
            head = head.getNext();
            size--;
            return removedNode;
        }

     }
}
