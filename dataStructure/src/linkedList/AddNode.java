package linkedList;

public class AddNode {
    Node head = null;

    /**
     * 直接插入节点到链表中
     * @param data
     */
    public void add(int data){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.data = data;
    }

    /**
     * 在指定的位置插入节点到链表中
     */
    public void addIndex(int index, Node data){
        Node temp = null;

    }

}
