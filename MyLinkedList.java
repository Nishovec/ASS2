public class MyLinkedList<E> implements MyList<E> {

    private class Node {
        E element;
        Node next;
        Node prev;

        public Node(E element) {
            this.element = element;
            this.next = null;
            this.prev = null;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }


}
