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
        DoublyCircularLinkedList node4 = new DoublyCircularLinkedList("d");
        DoublyCircularLinkedList node5 = new DoublyCircularLinkedList("e");

        node1.addNextNode(node2);
        node2.addNextNode(node3);
        node5.addPriorNode(node4);
        node2.addNextNode(node4);
        node1.viewNodes();
        node1.deleteNodeByIndex(3);
        node1.viewNodes();
        node1.updateNodeByIndex(2,"eee");
        node1.viewNodes();
        DoublyCircularLinkedList tem = node1.getNodeByValue(" ");
        System.out.println(tem.getElement());
        tem.viewNodes();



    }
}
