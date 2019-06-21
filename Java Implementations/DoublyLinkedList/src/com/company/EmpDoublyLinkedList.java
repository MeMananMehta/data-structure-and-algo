package com.company;

public class EmpDoublyLinkedList {

    private EmpNode head;
    private EmpNode tail;
    private int size;

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addToFront(Employee employee){
        EmpNode node = new EmpNode(employee);

        if(head == null){
            tail=node;
        }else{
            node.setNext(head);
            head.setPrevious(node);
        }

        head = node;
        size++;
    }

    public void addToEnd(Employee employee){
        EmpNode node = new EmpNode(employee);

        if(tail == null){
            head = node;
        }else{
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }


    public EmpNode removeFromFront(){
        if(isEmpty()){
            return null;
        }else{
            if(head.getNext() == null){
                tail = null;
            }else{
                head.getNext().setPrevious(null);
            }

            EmpNode removedNode = head;
            head = head.getNext();
            size--;
            return removedNode;
        }

    }

    public EmpNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        } else {
            if (tail.getPrevious() == null) {
                head = null;
            } else {
                tail.getPrevious().setNext(null);
            }

            EmpNode removedNode = tail;
            tail = tail.getPrevious();
            //tail.setNext(null);
            size--;
            return removedNode;
        }
    }

    public void printList(){
        EmpNode current = head;
        System.out.print("HEAD -> ");
        while(current!=null) {
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNext();

        }
        System.out.println("null");

    }

    public boolean addBefore(Employee newEmployee, Employee existingEmployee) {

        // return true if you were able to successfully add the employee
        // into the list before the existing employee. Return false
        // if the existing employee doesn't exist in the list

        if(isEmpty()){
            return false;
        }

        //EmpNode existingNode = new EmpNode(existingEmployee);

        EmpNode current = head;
        while(current != null && !current.getEmployee().equals(existingEmployee)){
            current = current.getNext();
        }

        if(current == null){
            return false;
        }

        EmpNode newNode = new EmpNode(newEmployee);

        newNode.setNext(current);
        newNode.setPrevious(current.getPrevious());
        current.setPrevious(newNode);

        if(current == head){
            head = newNode;
        }else {
            newNode.getPrevious().setNext(newNode);
        }

        size++;
        return true;
    }


}
