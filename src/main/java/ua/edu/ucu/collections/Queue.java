package ua.edu.ucu.collections;
import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {
    private ImmutableLinkedList data;

    public Queue(){
        this.data = new ImmutableLinkedList();
    }

    public Object peek(){
        return data.getFirst();
    }

    public Object dequeue(){
        Object element = data.getFirst();
       data =data.removeFirst();
        return element;
    }

    public  void enqueue(Object e){
        data = data.addLast(e);
    }


}
