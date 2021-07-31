package week_2.task_3;

import javax.net.ssl.SSLContext;

/**
 * @author shengyi
 * @create 2021/7/31 - 17:56
 */
public class SingleLinkedList {
    int value;
    SingleLinkedList next;

    public SingleLinkedList() {}

    public  SingleLinkedList(int value) {
        this.value = value;
        this.next = null;
    }

    public void addNode(SingleLinkedList node) {
        node.next = this.next;
        this.next = node;
    }

    public static SingleLinkedList flipLinkedList(SingleLinkedList head) {
        SingleLinkedList newHead = new SingleLinkedList();
        SingleLinkedList temporary = new SingleLinkedList();
        SingleLinkedList nowNode = null;
        temporary = head.next;
        //to get the node end of the linked list;
        while (temporary.next != null) {
            temporary = temporary.next;
        }
        nowNode = temporary;
        newHead.next = nowNode;
        //TODO start to flip link list
        while (true) {
            temporary = head.next;
            while (temporary.next != nowNode) {
                temporary = temporary.next;
                if (temporary == null) {
                    return newHead;
                }
            }
            nowNode.addNode(temporary);
            nowNode = nowNode.next;
        }
    }

    public static void  printLinkedList(SingleLinkedList head) {
        while (head.next != null) {
            System.out.print(head.next.value + "->");
            head = head.next;
        }
        System.out.println("NULL");
    }
}
