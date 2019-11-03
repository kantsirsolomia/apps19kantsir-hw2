package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList data;

    public Stack(){
        this.data = new ImmutableLinkedList();
    }

    public Object peek(){
        return data.getFirst();

    }

    public   Object pop(){
        Object element  = data.getFirst();
        data = data.removeFirst();
        return element;
    }

    public void push(Object e){
        data= data.addFirst(e);
    }
}

