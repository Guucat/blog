package week_1.task_2;

/**
 * @author shengyi
 * @create 2021/7/24 - 13:56
 */
public class DoublyCircularLinkedList {
    private String element = null;
    public DoublyCircularLinkedList next = this.prior;
    public DoublyCircularLinkedList prior = this.next;

    public DoublyCircularLinkedList(String element){
        this.element = element;
        this.next = this;
        this.prior = this;
    };

    public void setElement(String element) {
        this.element = element;
    }

    public String getElement() {
        return element;
    }

    public void addNextNode(DoublyCircularLinkedList node){
        this.next.prior = node;
        node.prior = this;
        node.next = this.next;
        this.next= node;
    }

    public void addPriorNode(DoublyCircularLinkedList node){
        this.prior.next = node;
        node.next = this;
        node.prior = this.prior;
        this.prior = node;
    }

    public void deleteNextNode(){
        this.next = this.next.next;
        this.next.prior = this;
    }

    public void deletePriorNode(){
        this.prior = this.prior.prior;
        this.prior.next = this;
    }

    /**
     *
     * @param n 负数为当前结点第前n个结点，正数为当前结点第后n个结点，0为当前结点
     * @param newElement 新的结点值
     */
    public void updateNode(int n,String newElement) {
        DoublyCircularLinkedList temporary = null;
        if (n == 0) {
            this.setElement(newElement);
            System.out.println("修改成功");
        }
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                temporary = this.next;
            }
            temporary.setElement(newElement);
            System.out.println("修改成功");
        }
        if (n < 0) {
            for (int i = 0; i > n; i--) {
                temporary = this.prior;
            }
            temporary.setElement(newElement);
            System.out.println("修改成功");
        }
    }

    /**
     *
     * @param element 需要查找的值
     * @return 含有该值的结点,若值不存在则返回null
     */
    public DoublyCircularLinkedList getNodeByValue(String element){
        DoublyCircularLinkedList flag = this;
        DoublyCircularLinkedList temporary = this;
        while (temporary.next != flag){
            if (temporary.element.equals(element)) {
                return temporary;
            }
            temporary = temporary.next;
        }
        return null;
    }

    /**
     *
     * @return 链表的长度
     */
    public int getNodesLength(){
        int l = 1;
        DoublyCircularLinkedList flag = this;
        DoublyCircularLinkedList temporary = this;
        while (temporary.next != flag){
            l++;
            temporary = temporary.next;
        }
        return l;
    }

    /**
     * 按顺序打印当前结点到最后一个结点的值
     */
    public void viewNodes(){
        DoublyCircularLinkedList temporary = this;
        StringBuilder  graph = new StringBuilder("--> ");
        for (int i = 0; i < this.getNodesLength(); i++) {
            graph.append(temporary.element + " --> ");
            temporary = temporary.next;
        }
        System.out.println(graph);
    }
}
