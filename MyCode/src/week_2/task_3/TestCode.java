package week_2.task_3;

/**
 * @author shengyi
 * @create 2021/7/31 - 17:52
 */
public class TestCode {
    public static void main(String[] args) {
        SingleLinkedList head = new SingleLinkedList();
        for (int i = 0; i < 10; i++) {
            head.addNode(new SingleLinkedList(i));
        }
        System.out.print("before:");
        SingleLinkedList.printLinkedList(head);
        System.out.print("after:");
        SingleLinkedList newNode = SingleLinkedList.flipLinkedList(head);
        SingleLinkedList.printLinkedList(newNode);

        SingleLinkedList.printLinkedList(head);


    }
    public static SingleLinkedList  aVoid (SingleLinkedList a) {
        a.next = null;
        return a;
    }

}
