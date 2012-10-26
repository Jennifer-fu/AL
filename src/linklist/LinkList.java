package linklist;

public class LinkList<T> {
    class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    public void insert(T data) {
        if (head == null) head = new Node<T>(data);
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<T>(data);
        }
    }

    public Node reverse() {
        if (head == null || head.next == null) return head;
        Node prev = head;
        Node current = head.next;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head.next = null;
        head = prev;
        return head;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.data).append(",");
            current = current.next;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        LinkList<Integer> list = new LinkList<Integer>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        System.out.println(list.toString());
        list.reverse();
        System.out.println(list.toString());
    }
}
