package com.Recursion;
import java.util.*;

public class circularQueue {
    protected int[] data;
    private static final int default_size = 10;

    protected int end =0;
    protected int front =0;
    private int size =0;

    public circularQueue(){
        this(default_size);
    }
    public circularQueue(int size){
        this.data = new int[size];
    }
    /* in this we wont check for the end to be equals to length because everytime the end will come atfirst.
       if there will be an empty space.
     */

    public boolean isFull(){
        return size==data.length;
    }

    // similarly here.
    public boolean isEmpty(){
        return size==0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        end= end% data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        int removed = data[front++];
        front = front%data.length;
        size--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[front];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        int i = front;
        do{
            System.out.print(data[i]+" ");
            i++;
            i%=data.length;
        }while (i!=end);
            System. out.println("END");
    }
}
