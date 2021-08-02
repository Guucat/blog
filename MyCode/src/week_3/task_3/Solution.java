package week_3.task_3;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author shengyi
 * @create 2021/8/2 - 21:58
 */
public class Solution {

    private static class ListNode {
        int value;
        ListNode next;


        public void add(int value) {
            ListNode oldFirst = this.next;
            ListNode newNode = new ListNode();
            newNode.value = value;
            newNode.next = oldFirst;
            this.next = newNode;
        }

        public void printNode() {
            ListNode node = this.next;
            while (node != null) {
                System.out.print(node.value + " --> ");
                node = node.next;
            }
            System.out.println("Null");
        }
    }


    public ListNode deleteNode(ListNode head, int val) {
        ListNode node;
        node = head;
        while (head.next != null) {
            if (head.next.value == val) {
                head.next = head.next.next;
                return node;
            }
            head = head.next;
        }
        return node;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode();
        listNode.add(1);
        listNode.add(2);
        listNode.add(3);
        listNode.printNode();
        solution.deleteNode(listNode,2).printNode();

    }
}
