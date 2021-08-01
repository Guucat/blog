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
        /**
         * 为反转后的每一个结点开辟新空间 原链表不会改变
         */
        SingleLinkedList newHead = new SingleLinkedList();
        SingleLinkedList nowNode = null;
        SingleLinkedList nowNode_new = null;
        SingleLinkedList t = head.next;
        //得到最后一个结点
        while (t.next != null) {
            t = t.next;
        }
        nowNode = t;
        newHead.addNode(new SingleLinkedList(t.value));
        nowNode_new = newHead.next;
        //TODO start to flip link list
        while (true) {
            t = head.next;
            while (t.next != nowNode) {
                t = t.next;
                if (t == null) {
                    return newHead;
                }
            }
            nowNode_new.addNode(new SingleLinkedList(t.value));
            nowNode_new = nowNode_new.next;
            nowNode = t;
        }

        /**
         * 没有为反转后的结点开辟新空间 原链表会改变
         */
//        SingleLinkedList newHead = new SingleLinkedList();
//        SingleLinkedList nowNode = null;
//        SingleLinkedList t = head.next;
//        //得到最后一个结点
//        while (t.next != null) {
//            t = t.next;
//        }
//        nowNode = t;
//        newHead.addNode(t);
//        //TODO start to flip link list
//        while (true) {
//            t = head.next;
//            while (t.next != nowNode) {
//                t = t.next;
//                if (t == null) {
//                    return newHead;
//                }
//            }
//            nowNode.addNode(t);
//            nowNode = nowNode.next;
//        }
    }

    public static void  printLinkedList(SingleLinkedList head) {
        while (head.next != null) {
            System.out.print(head.next.value + "->");
            head = head.next;
        }
        System.out.println("NULL");
    }
}
