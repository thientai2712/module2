package com.company.stacks;

public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;
    public MyStack(int size){
        this.size = size;
        arr = new int[size];
    }
    public void push(int newE){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        arr[index] = newE;
        index++;
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[--index];
    }
    public boolean isFull(){
        return index == size;
    }
    public boolean isEmpty(){
        return index ==0;
    }
    public void display(){
        for (int a : arr){
            System.out.println(a +" ");
        }
        System.out.println("--");
    }

    public static void main(String[] args) {
        MyStack s1 = new MyStack(5);
        MyStack s2 = new MyStack(5);
        s1.push(5);
        s1.push(6);
        s1.push(7);
        s1.push(8);
        s1.push(9);
        s1.display();
        for (int i = 0; i < s1.arr.length; i++) {
            s2.push(s1.pop());
        }
        s2.display();
    }
}
