package linkedList;

import org.w3c.dom.Node;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(2);

        myLinkedList.addLast(16);
        myLinkedList.addLast(9);

        myLinkedList.add(3, 6);
        myLinkedList.add(4,5);
        myLinkedList.printList();

        myLinkedList.get(2);

        myLinkedList.remove(8);
        myLinkedList.printList();
    }
}
