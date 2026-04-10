import java.util.*;
class MyCircularDeque {
    Deque<Integer> dq;
    int size;
    public MyCircularDeque(int k) {
        dq = new LinkedList<>();
        size = k;
    }
    public boolean insertFront(int value) {
        if(dq.size() == size) return false;
        dq.addFirst(value);
        return true;
    }
    public boolean insertLast(int value) {
        if(dq.size() == size) return false;
        dq.addLast(value);
        return true;
    }
    public boolean deleteFront() {
        if(dq.isEmpty()) return false;
        dq.removeFirst();
        return true;
    }
    public boolean deleteLast() {
        if(dq.isEmpty()) return false;
        dq.removeLast();
        return true;
    }
    public int getFront() {
        return dq.isEmpty() ? -1 : dq.peekFirst();
    }
    public int getRear() {
        return dq.isEmpty() ? -1 : dq.peekLast();
    }
    public boolean isEmpty() {
        return dq.isEmpty();
    }
    public boolean isFull() {
        return dq.size() == size;
    }
}