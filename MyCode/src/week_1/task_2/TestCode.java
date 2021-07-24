package week_1.task_2;

/**
 * @author shengyi
 * @create 2021/7/24 - 15:13
 */
public class TestCode {
    public static void main(String[] args) {
        DoublyCircularLinkedList node1 = new DoublyCircularLinkedList("a");
        DoublyCircularLinkedList node2 = new DoublyCircularLinkedList("b");
        DoublyCircularLinkedList node3 = new DoublyCircularLinkedList("c");
        node1.addNextNode(node2);
        node2.addNextNode(node3);
        System.out.println(node3.prior.getElement());
        node3.updateNode(1, "aa");
        System.out.println(node3.next.getElement());
        System.out.println(node2.getNodesLength());
        node1.viewNodes();

    }
}
