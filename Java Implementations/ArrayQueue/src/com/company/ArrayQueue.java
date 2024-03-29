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
        return back-front;
    }

     public void add(Employee employee){
       if(back == queue.length){
           Employee[] newArrray = new Employee[2*queue.length];
           System.arraycopy(queue,0,newArrray,0,queue.length);
           queue = newArrray;
       }

       queue[back] = employee;
       back++;
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

     public void printQueue(){
        for(int i = front;i < back;i++){
            System.out.print(queue[i]);
        }
        System.out.println();
    }

}
