package week_2.task_4;

/**
 * @author shengyi
 * @create 2021/7/31 - 17:54
 */
public class Stack {
    private Node first;
    private int N;

    private class Node {
        int value;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void push(int value) {
        Node oldFirst = first;
        first = new Node();
        first.value = value;
        first.next = oldFirst;
        N++;
    }

    public int pop() {
        int value = first.value;
        first = first.next;
        N--;
        return value;
    }

    public int peek() {
        return first.value;
    }

    public boolean search(int value) {
        Node current = first;
        while (current != null) {
            if (current.value == value) return true;
            current = current.next;
        }
        return false;
    }
}
