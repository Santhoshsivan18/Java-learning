//import java.util.*;
public class Linked {

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
        }
    }

    public Node head = null;

    public void display() {
        Node temp = head;

        if (temp.next == null) {
            System.out.println("Empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println();
    }

    public void createLinkedList() {
        Node n1 = new Node(101);
        Node n2 = new Node(102);
        Node n3 = new Node(103);
        Node n4 = new Node(104);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        head = n1;
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = newNode;
    }

    public int length() {
        if (head == null) {
            return 0;
        }
        int len = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        return len;
    }

    public void insertAtpos(int pos, int value) {
        if (head == null || pos == 1) {
            addFirst(value);
        } else if (pos == length()) {
            addLast(value);
        } else {
            Node newNode = new Node(value);
            Node temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node tail = head;
        // for (int i = 1; i < length() - 1; i++) {
        // tail = tail.next;
        // }
        // tail.next = null;

        while (tail.next.next != null) {
            tail = tail.next;
        }
        tail.next = null;
    }

    public void deleteAtpos(int pos) {
        if (head == null || pos == 1) {
            deleteFirst();
        } else if (pos == length()) {
            deleteLast();
        } else {
            Node tail = head;
            for (int i = 1; i < pos - 1; i++) {
                tail = tail.next;
            }
            tail.next = tail.next.next;
        }
    }

    public void middleElement() {
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.print("Middle Element: " + slow.data);
    }

    public static void main(String args[]) {
        Linked m = new Linked();
        m.createLinkedList();
        m.display();

        // m.addFirst(100);
        // m.display();

        // m.addLast(105);
        // m.display();

        // m.insertAtpos(3, 103);
        // m.display();

        // m.deleteFirst();
        // m.display();

        // m.deleteLast();
        // m.display();

        // m.deleteAtpos(2);
        // m.display();

        m.middleElement();
    }
}