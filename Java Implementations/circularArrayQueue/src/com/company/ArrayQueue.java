package com.company;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Employee[] queue;
    private int front;
    private int back;


    public ArrayQueue(int capacity){
        queue = new Employee[capacity];
    }

    public int size(){
        if(front <= back){
        return back-front;
        }else{
            return back-front+queue.length;
        }
    }

    public void add(Employee employee){
        if(size() == queue.length-1){

            int numItems = size();
            Employee[] newArrray = new Employee[2*queue.length];

            //unwrapping the queue into bigger array
            System.arraycopy(queue,front,newArrray,0,queue.length-front);
            System.arraycopy(queue,0,newArrray,queue.length - front, back);

            queue = newArrray;

            front = 0;
            back = numItems;
        }

        queue[back] = employee;
        if(back < queue.length-1){
            back++;
        }else{
            back=0;
        }

    }

    public Employee remove(){
        if(size() == 0 ){
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        queue[front] = null;
        front++;
        if(size()==0){
            front = 0;
            back =0;
        }else if(front == queue.length){
            front = 0;
        }
        return employee;
    }

    public Employee peek(){
        if(size()==0){
            throw new NoSuchElementException();
        }else{
            return queue[front];
        }
    }

    public void printQueue() {

        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.print(queue[i]);
            }
        }else{
            for(int i = front; i < queue.length;i++){
                System.out.print(queue[i]);
            }
            for(int i = 0; i < back;i++){
                System.out.print(queue[i]);
            }

        }
        System.out.println();
    }

}

