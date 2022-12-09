package prac8;
public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;
    BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
    @Override
    public void add(E element) {
        if(content.size() < capacity){
            content.add(element);
        }
        else{
            System.out.println("Список переполнен");
        }
    }
    @Override
    public String toString() {
        return "BoundedWaitList: " + content + " capacity= " + capacity;
    }
}