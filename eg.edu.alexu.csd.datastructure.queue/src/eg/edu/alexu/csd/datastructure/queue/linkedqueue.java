package eg.edu.alexu.csd.datastructure.queue;

public class linkedqueue implements IQueue,ILinkedBased {
    linkedlist s = new linkedlist();

    public void enqueue(Object item){
        s.add(item);
    }

    public Object dequeue(){
        Object e = s.get(0);
        s.remove(0);
        return e ;
    }

    public boolean isEmpty(){
        return s.isEmpty();
    }

    public int size(){
        return s.size();
    }
}